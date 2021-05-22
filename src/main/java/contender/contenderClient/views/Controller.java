package contender.contenderClient.views;

import java.util.concurrent.Callable;

import javafx.util.Callback;

public abstract class Controller {
	public static String fxml;
	
	public Callable<Controller> getCallable() {
		return new Callable<Controller>() {
	        @Override
	        public Controller call() throws Exception {
	        	//TODO: return the instance of your class
	            return null;
	        }
	    };
	}

	public static Callback<Class<?>, Object> getCallback(Callable<?> callable) {
		return new Callback<Class<?>, Object>() {
		    @Override
		    public Object call(Class<?> param) {
		        Callable<?> callable = null;
				try {
					callable = ((Controller) param.newInstance()).getCallable();
				} catch (InstantiationException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        if (callable == null) {
		            try {
		                // default handling: use no-arg constructor
		                return param.newInstance();
		            } catch (InstantiationException | IllegalAccessException ex) {
		                throw new IllegalStateException(ex);
		            }
		        } else {
		            try {
		                return callable.call();
		            } catch (Exception ex) {
		                throw new IllegalStateException(ex);
		            }
		       }
		    }
		};
	}
}