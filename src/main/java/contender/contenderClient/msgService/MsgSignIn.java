package contender.contenderClient.msgService;

import com.google.gson.Gson;

import contender.contenderClient.inetConnection.InetConnection;
import io.InetMsg;
import io.InetMsgType;
import msgSystem.Adress;

public class MsgSignIn extends MsgToServer {
	private String data;
	
	public MsgSignIn(Adress from, Adress to, String data) {
		super(from, to);
		this.data = data;
	}

	@Override
	void exec(InetConnection abonent) {
		InetMsg inet_msg = new InetMsg(InetMsgType.SIGN_IN_USER, data);
		abonent.sendln(new Gson().toJson(inet_msg));
	}

}
