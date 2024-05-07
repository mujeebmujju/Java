package string_program;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Occurence_Of_Char_Using_Collection_If_Not_Print_1 
{

	public static void main(String[] args) 
	{
		int[] s = { 1, 2, 3, 3, 2, 4, 4, 5 };
		int count = 0,max = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < s.length; i++) 
		{
			if (map.containsKey(s[i])) 
			{
				map.put(s[i], map.get(s[i]) + 1);
			} 
			else 
			{
				map.put(s[i], 1);
			}
		}
		for (Entry<Integer, Integer> m : map.entrySet()) 
		{
			if (m.getValue() > 1) 
			{
				if(m.getKey()>max) 
				{
					max = m.getKey();
				}
//				count = 1;
//				System.out.println(e.getKey());
//				System.out.println(e.getKey() + "---" + e.getValue());
			}
		}
		System.out.println(max);
	}



    @Test
	public void test()
	{
		int[] s = { 1, 2,3,4, 5 };
		int count = 0,max = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < s.length; i++) 
		{
			if (map.containsKey(s[i])) 
			{
				map.put(s[i], map.get(s[i]) + 1);
			} 
			else 
			{
				map.put(s[i], 1);
			}
		}
		for (Entry<Integer, Integer> m : map.entrySet()) 
		{
			if (m.getValue() > 1) 
			{
				if(m.getKey()>max) 
				{
					max = m.getKey();
				}

			}
		}
		if (count == 0) 
		{
			System.out.println("-1");
		}
	}
}
