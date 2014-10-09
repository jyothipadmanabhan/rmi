//creation of remot interface
import java.rmi.*;
public interface StringManipulationInterface extends Remote
{
	public int compare(String s1,String s2)throws RemoteException;
	public String reverse(String original)throws RemoteException;
	public String concat(String str1,String str2)throws RemoteException;
	public String lower(String st1)throws RemoteException;
	public String upper(String st2)throws RemoteException;
	public void close()throws RemoteException;
}
