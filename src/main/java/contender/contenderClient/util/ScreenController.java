package contender.contenderClient.util;

import java.util.HashMap;

import contender.contenderClient.views.Controller;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class ScreenController {
    private HashMap<String, Pane> screenMap = new HashMap<>();
    private HashMap<String, Controller> controllerMap = new HashMap<>();
    
    private HashMap<String, Object> data = new HashMap<>(); 
    private BorderPane main;

    public ScreenController(BorderPane main) {
        this.main = main;
    }

	public void addScreen(String name, Pane pane, Controller ctrl){
         screenMap.put(name, pane);
         controllerMap.put(name, ctrl);
    }

    public void removeScreen(String name){
        screenMap.remove(name);
        controllerMap.remove(name);
    }
    
    public void addData(String key, Object val){
    	data.put(key, val);
    }

	public Object getData(String key){
		return data.get(key);
	}
	
	public void removeData(String key){
		data.remove(key);
	}
    
    public Controller activate(String name){
    	Controller ctrl = controllerMap.get(name);
        main.setCenter(screenMap.get(name));
        return ctrl;
    }
}
