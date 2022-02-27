package abc;


import java.util.ArrayList;
import java.util.*;
public class SearchEmail  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner (System.in);
		//String stringInput=sc.nextLine();
		//System.out.println("Enter tghe user name"+ stringInput);
ArrayList<String> emailId= new ArrayList<String>();
emailId.add("kalpana26@gmail.com");
emailId.add("ranjitha343@gmail.com");
emailId.add("abc@gmail.com");
emailId.add("xyz@gmail.com");
emailId.add("kavi2345@gmail.com");
emailId.add("efgh@gmail.com");
emailId.add("rstu@gmail.com");
String searcElement ="kalpana26@gmail.com";
for( int i=0; i<emailId.size();i++)
{
	System.out.println(emailId.get(i));
   if(searcElement==emailId.get(i)) 
	{
		System.out.println("\n");
		System.out.println("email Id" + "x" + searcElement  +  " found");
		break;
	}
}
	}

}



