package contender.contenderClient.msgService;

import contender.contenderClient.inetConnection.InetConnection;
import msgSystem.Abonent;
import msgSystem.Adress;
import msgSystem.Msg;

public abstract class MsgToServer extends Msg{

	public MsgToServer(Adress from, Adress to) {
		super(from, to);
	}
	
	public void exec(Abonent abonent) {
		if (abonent instanceof InetConnection) {
			exec((InetConnection) abonent);
		}
	}
	
	abstract void exec(InetConnection connection);
}
