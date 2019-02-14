package ltUtility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeA {
	private PracticeA(){
			}
	public static final String TEST_VERSION = "PRACTICE";
	public static String hello(String name)
	{
		return "Hello, " + name;
	}
	public static String toString(List<Character> t)
	{  String s = "";
		for (int i = 0; i < t.size(); i++)
		{
		s += t.get(i);
		}
		return s;
	}
	public static List<Character> shuffle(List<Character> t)
	{
		List<Character> result = new ArrayList<Character>();
		int n = t.size();
		if (!t.isEmpty() && n%2 == 0)
		{
			for (int i = 0; i < n/2; i ++)
			{
				result.add(t.get(i));
				result.add(t.get(i + n/2));
				
			}
		}
		return result;
	}
	public static List<Character> repeatedChars(String s)
	{
		List<Character> result =  new ArrayList<Character>();
		Set<Character> t = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c= s.charAt(i);
			if (t.contains(c) && !result.contains(c)) {
				result.add(c);
			}
		t.add(c);	
		}
		return result;
	}
}
