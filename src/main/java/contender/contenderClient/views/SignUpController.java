package contender.contenderClient.views;

import com.google.gson.Gson;


import contender.contenderClient.msgService.MsgSignIn;
import contender.contenderClient.msgService.MsgSignUp;
import contender.contenderClient.util.ScreenController;
import io.SignInForm;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import msgSystem.Adress;
import msgSystem.MsgSystem;

public class SignUpController extends Controller {

    public SignUpController() {
    	fxml = "views/SignUp.fxml";
    }

	@FXML
    private TextField email;

    @FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    private Button signup;
    
    public void onStart() {
		if (context.getData("log_in_form") != null) {
			SignInForm form = (SignInForm) context.getData("log_in_form");
			context.removeData("log_in_form");
			
			name.setText(form.getName());
			password.setText(form.getPassword());
		}
	}

    @FXML
    void singUp(MouseEvent event) {
    	Adress adressMain = new Adress();
    	SignInForm data = new SignInForm();
    	
    	data.setName(name.getText());
    	data.setPassword(password.getText());
    	
    	Gson gson = new Gson();
    	MsgSignUp msgAuth = new MsgSignUp(adressMain, connectionAdress, 
    			gson.toJson(data));
    	System.out.println("Message arrived");
    	ms.sendMessage(msgAuth);
    	context.activate("views/authentication.fxml");
    }

}
