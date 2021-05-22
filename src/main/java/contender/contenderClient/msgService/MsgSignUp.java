package contender.contenderClient.msgService;

import com.google.gson.Gson;

import contender.contenderClient.entites.User;
import contender.contenderClient.inetConnection.InetConnection;
import io.InetMsg;
import io.InetMsgType;
import msgSystem.Adress;

public class MsgSignUp extends MsgToServer {
private String data;
	
	public MsgSignUp(Adress from, Adress to, String data) {
		super(from, to);
		this.data = data;
	}

	@Override
	void exec(InetConnection abonent) {
		InetMsg inet_msg = new InetMsg(InetMsgType.SIGN_UP_USER, data);
		abonent.sendln(new Gson().toJson(inet_msg));
	}

}
