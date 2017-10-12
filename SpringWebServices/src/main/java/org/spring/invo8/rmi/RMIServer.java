package org.spring.invo8.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import org.spring.invo8.httpInvoker.Calculation;

public class RMIServer extends UnicastRemoteObject implements Calculation{

	private static final long serialVersionUID = 1L;

	protected RMIServer() throws RemoteException {
		super();
	}

	public int cube(int number) throws RemoteException {
		return number * number * number;
	}
	
	public static void main(String[] args){
		try {
			//Runtime.getRuntime().exec("rmiregistry 1024");
			LocateRegistry.createRegistry(2020);
			Naming.rebind("//localhost:2020/RMIServer", new RMIServer());
			System.err.println("Server ready");

		} catch (Exception e) {

			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();

		}
	}
}
