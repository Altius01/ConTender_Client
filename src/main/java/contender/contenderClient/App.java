package contender.contenderClient;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;

import contender.contenderClient.inetConnection.InetConnection;
import contender.contenderClient.inetConnection.InetService;
import contender.contenderClient.util.ScreenController;
import contender.contenderClient.views.Activity;
import contender.contenderClient.views.Controller;
import contender.contenderClient.views.ViewNames;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Callback;
import msgSystem.MsgSystem;


/**
 * JavaFX App
 */
public class App extends Application {

	
	private Stage primaryStage;
    private BorderPane rootLayout;
    
    private InetService connection;
    private Thread inetConnectionThread;
    private ScreenController screenController;
    
    @Override
    public void start(Stage primaryStage) {
    	System.out.println("Client Started");
    	connection = InetService.getInstance(ipAddr, port);
        
    	this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ClientApp");
        
        initRootScene();
    }
    
    public static String ipAddr = "localhost";
    public static int port = 8080;
    
    public static void main(String[] args) {
        launch();
    }
    
    public void initRootScene() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("views/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            Scene scene = new Scene(rootLayout);
            screenController = new ScreenController(rootLayout);
            
            for (String name: ViewNames.ViewNames) {
            	loader = new FXMLLoader();
            	loader.setLocation(App.class.getResource(name));
            	loader.setControllerFactory(Controller.getCallback();
            	
            	Pane pane = loader.load();
            	Activity ctrl = (Activity) loader.getController();
            	screenController.addScreen(name, ctrl);
            	ctrl.initController(ms, connection.getAdress(), screenController, pane);
            }
            
            screenController.activate("views/authentication.fxml");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	@Override
    public void stop() throws Exception {
    	inetConnectionThread.interrupt();
    	super.stop();
    }
}