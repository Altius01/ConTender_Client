module Contender.ContenderClient {
    requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires com.google.gson;
	requires ContenderUtils;
    exports contender.contenderClient;
    
    opens contender.contenderClient.views to javafx.fxml;
}