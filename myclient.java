//client
import java.rmi.*;

import java.io.*;

public class myclient{
	public static void main(String args[]){
		try{
			String ip="localhost";
			StringManipulationInterface s=(StringManipulationInterface)Naming.lookup(ip);
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the string");
		
		String s1=br.readLine();
		String s2=br.readLine();
		s.compare(s1,s2);
		s.reverse(s1);
		s.concat(s1,s2);
		s.lower(s1);
		s.upper(s2);
		}catch(Exception e){
		System.out.println("error"+e);
		}
	}
}
		

		
