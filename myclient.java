//client
import java.rmi.*;

import java.io.*;

public class myclient{
	public static void main(String args[]){
String rev,str3,loriginal,uoriginal,s1,s2;
int a;
		try{
			String ip="localhost";
			StringManipulationInterface s=(StringManipulationInterface)Naming.lookup(ip);
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	do{	
		System.out.println("MENU\n1.compare\n2.reverse\n3.concatination\n4.lowercase\n5.uppercase\n6.exit");
		System.out.println("enter the choice");
		int n=Integer.parseInt(br.readLine());
		switch(n)
		{
		case 1:
		System.out.println("enter the string");
		s1=br.readLine();
		System.out.println("enter the string");
		s2=br.readLine();
		a=s.compare(s1,s2);
		if(a==1)
		System.out.println("First string is greater than second.");
		else if(a==2)
		System.out.println("First string is smaller than second.");
		else
		System.out.println("Both strings are equal.");
		break;
		case 2:
			System.out.println("enter the string");
			s1=br.readLine();
			rev=s.reverse(s1);
			System.out.println("Reversed string is"+rev);
		break;
		case 3:
			System.out.println("enter the string");
			 s1=br.readLine();
			System.out.println("enter the string");
			s2=br.readLine();
			str3=s.concat(s1,s2);
			System.out.println("string after concatination is"+str3);
		break;
		case 4:
			System.out.println("enter the string");
			 s1=br.readLine();
			loriginal=s.lower(s1);
			System.out.println("lower case string is"+loriginal);
			break;
		case 5:
			System.out.println("enter the string");
			 s2=br.readLine();
			uoriginal=s.upper(s2);
			System.out.println("upper case string is"+uoriginal);

		break;
		case 6:
			s.close();
		
		default:
			System.out.println("enter the correct choice");
		

	}
}while(true);
		}
catch(Exception e){
		System.out.println("error"+e);
		}
	}
}
		

		
