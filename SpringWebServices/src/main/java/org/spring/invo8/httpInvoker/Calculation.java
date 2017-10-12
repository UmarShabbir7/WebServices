package org.spring.invo8.httpInvoker;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculation extends Remote{  
	int cube(int number) throws RemoteException;  
}  
