package Collection;

import java.util.HashMap;

public class a 
{
	public static void main(String[] args) 
	{
		String[]s= {"Apple","Mango"};
		int[]a= {1,2};
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0; i<s.length; i++)
		{
			map.put(s[i], a[i]);
		}
		System.out.println(map);
		
	}
	

}
