package org.da.ass2.connector;

import java.net.MalformedURLException;
import java.rmi.*;

import org.da.ass2.messages.*;

/**
 * The Remote interface for an RMIConnector
 */
public interface IRMIConnector
	extends Remote
{
	/**
	 * The reception callback of a message from a certain sender
	 * 
	 * @param sender The process id of the sending process
	 * @param message The message being sent
	 * @throws java.rmi.RemoteException If something went wrong
	 * @throws MalformedURLException IF the binding URL was malformed
	 * @throws NotBoundException If we are binding to an unbound url
	 */
	public void receive(long sender, GenericMessage message) throws java.rmi.RemoteException, MalformedURLException, NotBoundException;
}
