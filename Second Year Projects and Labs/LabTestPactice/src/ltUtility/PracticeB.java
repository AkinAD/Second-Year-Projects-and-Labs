package ltUtility;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
	private PracticeB() 
	{
        
    }
	
	public static Integer last(List<Integer> t)
	{
		if (t.isEmpty())
		{
			throw new IllegalArgumentException();
		}
		return t.get(t.size()-1); // not quite sure why -1 is subtracted
			
	}
	public static int totalArea(List<Integer> widths,
            List<Integer> heights) {
		int n =  widths.size();
		int result = 0;
		if(widths.size() != heights.size())
		{
			throw new IllegalArgumentException("Yo fam the lists ain't da same sizes eh. fix dat styll");
		}
		for (int i = 0; i < n; i++) 
		{ if(widths.get(i)>= 0 && heights.get(i) >=0)
			result += (widths.get(i) * heights.get(i));
		}
				return result;
		
	}
	public static int alternatingSum(List<Integer> t)
	{ int sum = 0;
	int multiple = 1;
	for (Integer i :t)
	{sum += multiple *i;
	multiple *= -1;
		
	}
		return sum;
	}
	public static List<Integer> encode(List<Integer> t)
	{
		List<Integer> result = new ArrayList<Integer>();
		int count =  1;
		int prev = t.get(0);
		int digit = 0;
		for (int i =0; i<t.size(); i++)
		{ digit =  t.get(i);
		if (digit == prev)
		{
			count++;
		}
		else 
		{
			result.add(count);
			result.add(digit);
			count = 1;
			prev = digit;
		}
			
		}
		result.add(count);
		result.add(digit);
		return result;
	
	}
	
}
