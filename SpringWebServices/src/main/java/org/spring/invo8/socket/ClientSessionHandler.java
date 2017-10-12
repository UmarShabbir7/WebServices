package org.spring.invo8.socket;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClientSessionHandler implements IoHandler {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	private final String values;
	private boolean finished;

	public ClientSessionHandler(String values)
	{
		this.values = values;
	}

	public boolean isFinished()
	{
		return finished;
	}

	
	public void sessionOpened(IoSession session)
	{
		session.write(values);
	}

	
	public void messageReceived(IoSession session, Object message)
	{
		/*logger.info("Message received in the client..");
		System.out.println("Message is: " + message.toString());
		session.write("quit");*/

		String str = message.toString();
		System.out.println("Message received from Server is: "+ message.toString());

		System.out.print("Client -> Enter Message: ");
		try{
			str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		}catch (Exception ex){
			System.out.println("Exception occurred.");
		}

		session.write( str );
		System.out.println("Message written...");
	}

	
	public void exceptionCaught(IoSession session, Throwable cause)
	{
		session.close();
	}

	
	public void inputClosed(IoSession arg0) throws Exception {
		
	}

	
	public void messageSent(IoSession session, Object arg1) throws Exception {
		//session.write("Ping Ping");
	}

	
	public void sessionClosed(IoSession session ) throws Exception {
		// Wait for five seconds before reconnecting.
	}

	
	public void sessionCreated(IoSession arg0) throws Exception {
		
	}

	
	public void sessionIdle(IoSession arg0, IdleStatus arg1) throws Exception {
		
	}

}
