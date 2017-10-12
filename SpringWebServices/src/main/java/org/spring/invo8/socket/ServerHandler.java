package org.spring.invo8.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class ServerHandler implements IoHandler {

	private String serverMessage;

	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		
		cause.printStackTrace();
		
	}

	public void messageReceived(IoSession session, Object message)
			throws Exception {
		
		String str = message.toString();
        System.out.println("Message received from Client is: "+ message.toString());
        
        if( str.trim().equalsIgnoreCase("quit") ) {
            session.close();
            return;
        }

        System.out.print("Server -> Enter Message: ");
        serverMessage = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        
        /*Date date = new Date();
        session.write( date.toString() );*/
        session.write( serverMessage );
        System.out.println("Message written...");
	}

	public void messageSent(IoSession session, Object message) throws Exception {
		
	}

	public void inputClosed(IoSession session) throws Exception {
		
	}
	
	public void sessionCreated(IoSession session) throws Exception {
		
	}

	public void sessionOpened(IoSession session) throws Exception {
		
	}

	public void sessionClosed(IoSession session) throws Exception {
		
	}

	public void sessionIdle(IoSession session, IdleStatus status)
			throws Exception {
		
		 System.out.println( "IDLE " + session.getIdleCount( status ));
		
	}

}
