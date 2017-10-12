package org.spring.invo8.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.spring.invo8.httpInvoker.Calculation;

public class RMIClient {

	private static Calculation look_up;

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		look_up = (Calculation) Naming.lookup("//localhost:2020/RMIServer");
		System.out.println(look_up.cube(4));
	}
}
