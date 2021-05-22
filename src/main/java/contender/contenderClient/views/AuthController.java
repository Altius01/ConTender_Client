package contender.contenderClient.views;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import com.google.gson.Gson;

import contender.contenderClient.inetConnection.InetService;
import contender.contenderClient.inetConnection.POST;
import contender.contenderClient.util.ScreenController;
import io.SignInForm;
import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AuthController extends Controller{
	private ScreenController screenController;
	
	@FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    private Button login;
    
    @FXML
    private Button signup;
    
    public AuthController(ScreenController screenController) {
    	fxml = "views/authentication.fxml";
		this.screenController = screenController;
	}
    
    @FXML
    void login(MouseEvent event) {
    	SignInForm data = new SignInForm();
    	
    	data.setName(name.getText());
    	data.setPassword(password.getText());
    	
    	Gson gson = new Gson();
    	
    	POST post = new POST(gson.toJson(data), InetService.getInstance().getSocket());
    	FutureTask<String> future = new FutureTask<>(post);
    	
    	ExecutorService executor = Executors.newCachedThreadPool();
    	
    	executor.execute(future);
    	
    	System.out.println("Message arrived");
    }
    
    @FXML
    void signUp(MouseEvent event) {
    	SignInForm data = new SignInForm();
    	
    	data.setName(name.getText());
    	data.setPassword(password.getText());
    	
    	screenController.addData("log_in_form", data);
    	screenController.activate("views/SignUp.fxml");
    }
    
	public Callable<Controller> getCallable(ScreenController screenController) {
		return new Callable<Controller>() {
	        @Override
	        public Controller call() throws Exception {
	            return new AuthController(screenController);
	        }
	    };
	}
}


