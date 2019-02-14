package ltTest4;
import java.util.ArrayList;
import java.util.List;

public class Practice4B {

	private Practice4B() {
		// empty by design
	}

	/**
	 * Returns the sum of the digits in the specified string. The sum of the
	 * empty string is equal to zero. For example, if digits is the string
	 * "00036109" then sum(digits) returns 19.
	 * 
	 * @param digits
	 *            a string
	 * @return the sum of the digits in the specified string 
	 * @pre. digits contains only the characters 0, 1, 2, ..., 9
	 */
	public static int sum(String digits) {
		if (digits.isEmpty())
		{
			return 0;
		}
		return Integer.valueOf(digits.charAt(0)) + sum(digits.substring(1));
	}

	/**
	 * Tests whether the given character occurs an even number of times in the
	 * given string. The number 0 is even.
	 * 
	 * @param word
	 *            a word
	 * @param character
	 *            a character
	 * @return true if the given character occurs an even number of times in the
	 *         given string, false otherwise
	 */
	public static boolean even(String word, char character) {
		boolean even;
		if (word.length() == 0) {
			even = true;
		} else {
			if(word.startsWith(String.valueOf(character)))
			{
				even = !even(word.substring(1), character);
			}
			else {
				even = even(word.substring(1), character);
			}
		}
		return even;
		
	}

	/**
	 * Returns the index within the list t of the last occurrence of the string
	 * s. If s does not occur in the list then -1 is returned. For example,
	 * consider the list t having the elements ["x", "z", "a", "z", "a"]; then
	 * 
	 * <pre>
	 * lastIndexOf("x", t)       returns 0
	 * lastIndexOf("a", t)       returns 4
	 * lastIndexOf("z", t)       returns 3
	 * lastIndexOf("hello", t)   returns -1
	 * </pre>
	 * 
	 * @param s
	 *            a string
	 * @param t
	 *            a list
	 * @return the index of the last occurrence of the string s in the list t
	 */
	public static int lastIndexOf(String s, List<String> t) {
		if (t.size() == 0) {
			return -1;
		}
		int idx = t.size() - 1;
		String last = t.get(idx);
		if (s.equals(last)) {
			return idx;
		}
		return lastIndexOf(s, t.subList(0, idx));
		
	}

	/**
	 * Prints all of the sub-lists of the specified list t. See allSubsets below
	 * for an example.
	 * 
	 * @param t
	 *            a list of strings
	 */
	public static void subsets(List<String> t) {
		List<List<String>> b = allSubsets(t);
		for (List<String> lst : b) {
			System.out.println(lst);
		}
	}

	/**
	 * Returns the list containing all of the lists that are sub-lists of the
	 * specified list t. For the purposes of this method, a sub-list of t is any
	 * list that can be made by removing zero or more elements of t. The empty
	 * list is a sub-list of every list.
	 * 
	 * <p>
	 * For example, consider the list <code>t</code> whose string representation
	 * is <code>[Janet, Robert, Morgan]</code>. Then all of the sub-lists that
	 * can be formed from <code>t</code> that include the string
	 * <code>"Janet"</code> are:
	 * 
	 * <pre>
	 * [Janet, Robert, Morgan]
	 * [Janet, Robert]
	 * [Janet, Morgan]
	 * [Janet]
	 * </pre>
	 * 
	 * <p>
	 * And all of the sub-lists that can be formed that DO NOT include the
	 * string <code>"Janet"</code> are:
	 * 
	 * <pre>
	 * [Robert, Morgan]
	 * [Robert]
	 * [Morgan]
	 * []
	 * </pre>
	 * 
	 * <p>
	 * <code>allSubsets(t)</code> would return the list containing all of the
	 * sub-lists given above (all of the sub-lists that include
	 * <code>"Janet"</code> and all of the sub-lists that do not include
	 * <code>"Janet"</code>).
	 * 
	 * @param t
	 *            a list of strings
	 * @return the list containing all of the lists that are sublists of the
	 *         specified list t
	 */
	public static List<List<String>> allSubsets(List<String> t) {
		// This method is slightly different than
		// other methods we have studied in this course.
		// This method has a base case, followed by one
		// recursive case. After the recursive case, a
		// loop is required to process the result of
		// the recursive case.	
	}

}

