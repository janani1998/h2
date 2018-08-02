import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String s="1234";
	int c=0;
	for(int i=0;i<s.length();i++){
		
		char ch[]=s.toCharArray();
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		c++;
	}
	if(c>=1)
	System.out.print("yes");
	else
	System.out.print("No");
	}
}
