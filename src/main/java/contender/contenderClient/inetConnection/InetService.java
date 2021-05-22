package contender.contenderClient.inetConnection;

import java.io.IOException;
import java.net.Socket;

public class InetService {
    private Socket socket;
	private String addr;
    private int port;
    
    private static InetService instance;
    
    private InetService(String addr, int port){
    	this.addr = addr;
        this.port = port;
        try {
            this.socket = new Socket(addr, port);
        } catch (IOException e) {
            System.err.println("Socket failed");
        }
    }
    
    public static InetService getInstance(String addr, int port) {
    	if (instance == null)
    		instance = new InetService(addr, port);
		return instance;
    }
    
    public static InetService getInstance() {
    	if (instance == null) {
    		System.out.print("Instance is null!!");
    		return null;
    	}
		return instance;
    }
    
    public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

    private void downService() {
        try {
            if (!socket.isClosed()) {
                socket.close();
            }
        } catch (IOException ignored) {}
    }
}
