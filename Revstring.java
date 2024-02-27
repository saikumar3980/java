import java.util.*;
class Revstring
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);;
	System.out.println("enter a string= ");
	String str=sc.next();
	String rev="";
	/*for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}	
    System.out.println("reverse = "+rev); */
    char str[]=s.toCharArray();
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+str[i];
	}	
	System.out.println("reverse = "+rev); 
	//StringBuffer s=new StringBuffer(str);
	//System.out.println(s.reverse());
}
}