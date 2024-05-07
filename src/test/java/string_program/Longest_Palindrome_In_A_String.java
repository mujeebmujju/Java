  package string_program;

import org.testng.annotations.Test;

public class Longest_Palindrome_In_A_String 
{
	@Test
	  public void longestPalindrome()
	  {
		  String s="nitigupta"; //ayamalayalamkayak
		  String s1="";
		  String s2="";
		  int len=0;
		  for(int i=0;i<s.length();i++)
		  {
			  s1=s1+s.charAt(i);
			  for(int j=i+1;j<s.length();j++)
			  {
				  s1=s1+s.charAt(j);
				  String rev="";
				  for(int k=s1.length()-1;k>=0;k--)
				  {
					  rev=rev+s1.charAt(k);
				  }
				  if(s1.equals(rev) && s1.length()>len )
				  {
					  s2=s1;
					  len=s2.length();
				  }
			  }
			  s1="";
		  }
		  System.out.println(s2);
		  System.out.println(len);
	  }

}
