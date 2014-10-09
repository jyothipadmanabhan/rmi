//implementation of remote interface
import java.rmi.*;
import java.rmi.server.*;
import java.lang.String;
public class rmiclass extends UnicastRemoteObject implements StringManipulationInterface
{
	public rmiclass()throws RemoteException{
		super();
	}
		
	public int compare(String s1,String s2)
	{
	int a;
	if ( s1.compareTo(s2) > 0 )
	a=1;
         	
	else if ( s1.compareTo(s2) < 0 )
	a=2;
        	
      	else 
	a=0;  
       return(a); 	
	}
	public String reverse(String s1)throws RemoteException
	{
		String reverse=" ";
		int i,length;
		length=s1.length();
		for(i=length-1;i>=0;i--)
		{
			reverse+=s1.charAt(i);
		}
		return(reverse);
		
	}
	public String concat(String s1,String s2)throws RemoteException
	{
		String str3=s1.concat(s2);
		return(str3);
		
	}
	public String lower(String s1)throws RemoteException
   	{
     		String loriginal;
     		loriginal=s1.toLowerCase();
		return(loriginal);
		
   	}
 	public String upper(String s2)throws RemoteException
   	{
     		String uoriginal;
     		uoriginal=s2.toUpperCase();
		return(uoriginal);
	}
	public void close()throws RemoteException
	{
		System.exit(0);
	}
}

