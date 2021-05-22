package contender.contenderClient.inetConnection;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.Callable;

public class POST implements Callable<String> {
    private BufferedWriter out;
    private Socket socket;
    private String data;
    
    public static final String OK_CODE = "OK_CODE";
    public static final String ERROR_CODE = "ERROR_CODE";

	public POST(String data, Socket socket) {
		this.socket = socket;
		this.data = data;
	}
	
	@Override
	public String call() throws Exception {
		try {
	        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			down();
			System.err.println("Creating BufferedReader/Writer failed");
			return ERROR_CODE;
        }
		
		try {
			out.write(data);
		} catch (IOException e) {
			down();
			System.err.println("Writing to server failed");
			return ERROR_CODE;
        }
		return OK_CODE;
	}
	
	private void down() {
		try {
			out.close();
		} catch (IOException pass) {}
	}
}
