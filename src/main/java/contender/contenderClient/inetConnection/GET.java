package contender.contenderClient.inetConnection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.Callable;

public class GET implements Callable<String> {
	private BufferedReader in;
    private BufferedWriter out;
    private Socket socket;
    private String request;

	public GET(String request, Socket socket) {
		this.socket = socket;
		this.request = request;
	}
	
	@Override
	public String call() throws Exception {
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			down();
			System.err.println("Creating BufferedReader/Writer failed");
			return null;
        }
		
		try {
			out.write(request);
		} catch (IOException e) {
			down();
			System.err.println("Writing to server failed");
			return null;
        }
		
		String result = null;
		if (in.ready()) {
			try {
				result = in.readLine();
			} catch (IOException e) {
				down();
				System.err.println("Reading from server failed");
				return null;
	        }
		}
		down();
		return result;
	}
	
	private void down() {
		try {
			in.close();
			out.close();
		} catch (IOException pass) {}
	}
}
