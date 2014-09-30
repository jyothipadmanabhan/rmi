//creation of remot interface
import java.rmi.*;
public interface StringManipulationInterface extends Remote
{
	public void compare(String s1,String s2)throws RemoteException;
	public void reverse(String original)throws RemoteException;
	public void concat(String str1,String str2)throws RemoteException;
	public void lower(String st1)throws RemoteException;
	public void upper(String st2)throws RemoteException;
}
