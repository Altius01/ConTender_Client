package contender.contenderClient.views;

public abstract class ViewNames {
	public final static String[] FxmlNames = { 
			"views/authentication.fxml",
			"views/SignUp.fxml"
			};
	public final static Class[] Viewclasses = {
		SignUpController.class,
		AuthController.class
	};
}