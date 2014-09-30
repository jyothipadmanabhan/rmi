//implementation of remote interface
import java.rmi.*;
import java.rmi.server.*;
import java.lang.String;
public class rmiclass extends UnicastRemoteObject implements StringManipulationInterface
{
	public rmiclass()throws RemoteException{
		super();
	}
	
	public void compare(String s1,String s2)
	{
	if ( s1.compareTo(s2) > 0 )
         	System.out.println("First string is greater than second.");
	else if ( s1.compareTo(s2) < 0 )
        	System.out.println("First string is smaller than second.");
      	else   
        	System.out.println("Both strings are equal.");
	}
	public void reverse(String s1)throws RemoteException
	{
		String reverse=" ";
		int i,length;
		length=s1.length();
		for(i=length-1;i>=0;i--)
		{
			reverse+=s1.charAt(i);
		}
		System.out.println("Reversed string is"+reverse);
	}
	public void concat(String s1,String s2)throws RemoteException
	{
		String str3=s1.concat(s2);
		System.out.println("string after concatination is"+str3);
	}
	public void lower(String s1)throws RemoteException
   	{
     		String loriginal;
     		loriginal=s1.toLowerCase();
		System.out.println("lower case string is"+loriginal);
   	}
 	public void upper(String s2)throws RemoteException
   	{
     		String uoriginal;
     		uoriginal=s2.toUpperCase();
		System.out.println("upper case string is"+uoriginal);
   	}
}

