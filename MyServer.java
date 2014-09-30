import java.rmi.*;
import java.rmi.registry.*;
public class MyServer
{
	public static void main(String args[])
	{
		try{
			rmiclass s=new rmiclass();
			Naming.rebind("localhost",s);
			System.out.println("server bound");
		}
	catch(Exception e){
				System.out.println(e);
	}
}
}
