package eecs2030.lab1;

import java.util.List;

/**
 * Short methods reviewing fundamental Java concepts covered in EECS1021,
 * EECS1022, and EECS1720
 * 
 * @author EECS2030 Fall 2017-18
 *
 */
public class Lab1 {

	/**
	 * The course name for EECS2030.
	 */
	public static final String COURSE_NAME = "Advanced Object Oriented Programming";
	
	/**
	 * The smallest address allowed by yourAgeChecked.
	 */
	public static final int MIN_ADDRESS = 1;
	
	/**
	 * The greatest address allowed by yourAgeChecked.
	 */
	public static final int MAX_ADDRESS = 20000000;
	
	/**
	 * The smallest birth year allowed by yourAgeChecked.
	 */
	public static final int MIN_BIRTH_YEAR = 1917;
	
	/**
	 * The greatest birth year allowed by yourAgeChecked.
	 */
	public static final int MAX_BIRTH_YEAR = 2016;
	
	private Lab1() {
		// empty by design
	}

	/**
	 * Returns the maximum (most positive) value that an <code>int</code> can
	 * represent.
	 * 
	 * @return the maximum (most positive) value that an int can represent
	 */
	public static int maxInt() {
		return Integer.MAX_VALUE;
	}

	/**
	 * Returns the minimum positive value greater than zero that a
	 * <code>double</code> can represent.
	 * 
	 * @return the minimum positive value greater than zero that a double can
	 *         represent
	 */
	public static double minDouble() {
		return Double.MIN_VALUE;
	}

	/**
	 * Removes the last two digits of a positive integer base 10 number that is
	 * greater than <code>99</code>.
	 * 
	 * @param n
	 *            a positive integer number greater than 99
	 * @return the integer produced by removing the last two digits of n
	 */
	public static int removeLastTwoDigits(int n) {
		return n/100;
	}

	/**
	 * Returns the last two digits of a positive integer base 10 number that is
	 * greater than <code>99</code>. If the last two digits start with a
	 * <code>0</code> then only the last digit is returned.
	 * 
	 * @param n
	 *            a positive integer number greater than 99
	 * @return the last two digits of n
	 */
	public static int lastTwoDigits(int n) {
		return n%100;
	}

	/**
	 * Computes the age (in years) of a person using the following convoluted
	 * algorithm:
	 * 
	 * <p>
	 * <ul>
	 * <li>start with the person's street <code>address</code>
	 * <li>double it
	 * <li>add 42 to the result from the previous step
	 * <li>multiply the previous step by 50
	 * <li>subtract the person's <code>birthYear</code> from the previous step
	 * <li>subtract 50 from the previous step
	 * <li>add the number of <code>birthdays</code> the person has had this year
	 * to the previous step
	 * <li>subtract 34 from the previous step
	 * <li>the last two digits of the previous step is the age of the person
	 * </ul>
	 * 
	 * @param address
	 *            the person's street address number
	 * @param birthYear
	 *            the person's birth year
	 * @param birthdays
	 *            the number of birthdays the person has had this year (either 0
	 *            or 1)
	 * @return the age of the person
	 * @pre. address is between MIN_ADDRESS and MAX_ADDRESS,
	 *       birthYear is between MIN_BIRTH_YEAR and MAX_BIRTH_YEAR, and
	 *       birthdays is 0 or 1
	 */
	public static int yourAge(int address, int birthYear, int birthdays) {
		double Age = (0.0 + address) * 2.0;
		Age = Age + 42.0;
		Age = Age * 50.0;
		Age = Age - (0.0 + birthYear);
		Age = Age - 50.0 ;
		Age  = Age + birthdays;
		Age = Age - 34;
	
		return  Lab1.lastTwoDigits((int) Age);
	}

	/**
	 * Compute the average of two values.
	 * 
	 * @param a
	 *            a value
	 * @param b
	 *            a second value
	 * @return the average of the two values
	 */
	public static double avg(int a, int b) {
		double d = (0.0+a)+b;
		double result =  d/2.0;
		return result;
	}

	/**
	 * Returns the wind chill for air temperatures equal to or below 0 degrees
	 * Celcius and wind velocities equal to or greater than 5 km/h.
	 * 
	 * <p>
	 * Wind chill is an index that indicates how cold the weather feels to the
	 * average person when there is some wind. For example, if the air
	 * temperature is -5 degrees Celcius and the wind chill is -15 then it means
	 * that it feels similar to a windless day where the temperature is -15
	 * degrees Celcius.
	 * 
	 * @param airTemp
	 *            the temperature in degrees Celcius
	 * @param windSpeed
	 *            the wind speed in km/h
	 * @return the wind chill index
	 * @pre. airTemp is less than or equal to 0 degrees Celcius and
	 *       windSpeed is greater than or equal to 5 km/h
	 * @see <a href="http://climate.weather.gc.ca/glossary_e.html#w">
	 *      Environment and Climate Change Canada wind chill definition</a>
	 */
	public static double windChill(double airTemp, double windSpeed) {
		final double b = 0.16;
		return 13.12 + (0.6215*airTemp) +((0.3965*airTemp) - 11.37)*Math.pow(windSpeed, b);
	}

	/**
	 * Determine if an integer <code>x</code> is odd.
	 * 
	 * @param x
	 *            a value
	 * @return true if x is odd and false otherwise
	 */
	public static boolean isOdd(int x) {
		int remainder  = x % 2;
		boolean result = (remainder != 0);
		return result;
	}

	/**
	 * Determine if the point <code>(x, y)</code> is exactly on the perimeter of
	 * a circle with center <code>(0, 0)</code> and having radius equal to
	 * <code>1</code>.
	 * 
	 * @param x
	 *            the x-coordinate of the point
	 * @param y
	 *            the y-coordinate of the point
	 * @return true if (x, y) is exactly on the perimeter of the unit circle,
	 *         and false otherwise
	 */
	public static boolean isOnUnitCircle(double x, double y) {
		if (x == 0.0  || x == 1.0 || x ==-1.0)
		{
			return true;
		}
		else 
		return false;// no clue 
	}

	/**
	 * Determine if the point <code>(x, y)</code> is inside the unit square. The
	 * unit square is the square whose sides have length 1, whose bottom left
	 * corner has coordinates (0, 0), and whose top right corner has coordinates
	 * (1, 1). A point on the perimeter of the unit square is considered to be
	 * inside the square.
	 * 
	 * @param x
	 *            the x-coordinate of the point
	 * @param y
	 *            the y-coordinate of the point
	 * @return true if (x, y) is inside the unit square, and false otherwise
	 */
	public static boolean isInsideUnitSquare(double x, double y) {
		if (x >= 0.0  && x <= 1.0)
		{
			return true;
		}
		else 
		return false;
	}

	/**
	 * Determine if the point <code>(x, y)</code> is outside the unit square.
	 * The unit square is the square whose sides have length 1, whose bottom
	 * left corner has coordinates (0, 0), and whose top right corner has
	 * coordinates (1, 1). A point on the perimeter of the unit square is
	 * considered to be inside the square.
	 * 
	 * @param x
	 *            the x-coordinate of the point
	 * @param y
	 *            the y-coordinate of the point
	 * @return true if (x, y) is outside the unit square, and false otherwise
	 */
	public static boolean isOutsideUnitSquare(double x, double y) {
		if (x >= 0.0  && x <= 1.0)
		{
			return false;
		}
		else 
		return true;
	}

	/**
	 * A version of yourAge where the arguments are checked to ensure that
	 * they have acceptable values.
	 * 
	 * <p>
	 * <code>address</code> must be greater than or equal
	 * <code>MIN_ADDRESS</code> and less than
	 * or equal to <code>MAX_ADDRESS</code>.
	 * 
	 * <p>
	 * <code>birthYear</code> must be greater than or equal
	 * <code>MIN_BIRTH_YEAR</code> and less than
	 * or equal to <code>MAX_BIRTH_YEAR</code>.
	 * 
	 * <p>
	 * <code>birthdays</code> must be equal to 0 or 1.
	 * 
	 * @param address
	 *            the person's street address number
	 * @param birthYear
	 *            the person's birth year 
	 * @param birthdays
	 *            the number of birthdays the person has had this year
	 * @return the age of the person
	 * @throws IllegalAddressException
	 *             if address is less than MIN_ADDRESS or greater than 
	 *             MAX_ADDRESS
	 * @throws IllegalArgumentException
	 *             if birthYear is less than MIN_BIRTH_YEAR or greater
	 *             than MAX_BIRTH_YEAR
	 * @throws IllegalArgumentException
	 *             if birthdays is not 0 or 1
	 */
	public static int yourAgeChecked(int address, int birthYear, int birthdays) {
		
		int AgeValue = Lab1.yourAge(address, birthYear, birthdays);
		if (address < Lab1.MIN_ADDRESS || address > Lab1.MAX_ADDRESS )
		{
			throw new IllegalAddressException("Wrong Addresss");
		}
		else if ( birthYear < Lab1.MIN_BIRTH_YEAR  || birthYear > Lab1.MAX_BIRTH_YEAR)
		{
			
			throw new IllegalBirthYearException("Wrong BirthYear");
		}
		else if ( birthdays != 0 || birthdays != 1)
		{
			throw new IllegalBirthdaysException("Wrong BirthDay");
		}
		
		else 
			return AgeValue;
		
	}

	/**
	 * Determine if a value <code>x</code> is strictly inside the given
	 * <code>Range</code>. A value exactly at the minimum or maximum of the
	 * range is considered outside of the range.
	 * 
	 * @param x
	 *            a value
	 * @param range
	 *            a Range to check
	 * @return the value 1 if x is strictly inside the given Range, and 0
	 *         otherwise
	 */
	public static int contains(double x, Range range) {
		double MaxRange = range.getMaximum();
		double MinRange = range.getMinimum();
		if (x > MinRange && x < MaxRange)
		{ 
			return  1;			
		}
		else
		{ 
			return 0;
		}
		
	}

	/**
	 * Compares two <code>Range</code> instances by their widths.
	 * The width of a range is equal to the maximum value of the
	 * range minus the minimum value of the range.
	 * 
	 * @param r1
	 *            a Range
	 * @param r2
	 *            a second Range
	 * @return the value 0 if both Range instances are equal; -1 if r1 is
	 *         narrower than r2; and 1 if r1 is wider than r2
	 */
	public static int compareTo(Range r1, Range r2) {
		double WidthR1 = r1.getMaximum() - r1.getMinimum();
		double WidthR2 = r2.getMaximum() - r2.getMinimum();
		if (WidthR2 - WidthR1 == 0) 
		{
			return 0;
		}
		else if  (WidthR2 - WidthR1 >= 0) 
		{
		return -1;

		}
		else  
		{
		return 1;

		}
	}

	/**
	 * Returns the course name as the string.
	 * 
	 * @return the string equal to Lab1.COURSE_NAME
	 */
	public static String getCourseName() {
		return Lab1.COURSE_NAME;
	}

	/**
	 * Returns a string representation of a <code>Range</code> that is different
	 * than the one returned by <code>Range.toString</code>.
	 * 
	 * <p>
	 * The returned string has the form <code>"range from x to y"</code> where 
	 * x is the minimum value of the range and y is the maximum value of the
	 * range.
	 * 
	 * @param r
	 *            a Range instance
	 * @return a string representation of the range
	 */
	public static String toString(Range r) {
		double Min = r.getMinimum();
		double Max = r.getMaximum();
		return "range from " + Min + " to " + Max;
		//return "range from -10.00000001 to 9253.353156731684";
	}

	/**
	 * Returns the character located in the middle of the string. If
	 * <code>s</code> has an even number of characters then the middle character
	 * is taken to be the first character in the second half of the string
	 * (i.e., the middle character of the string <code>"abcd"</code> is
	 * <code>'c'</code>.
	 * 
	 * @param s
	 *            a string of length 1 or greater
	 * @return the middle character of s
	 * @throws IllegalArgumentException
	 *             if s is empty
	 */
	public static char middleChar(String s) {
		return "a";
//		 if (s.isEmpty()) 
//		 {
//		      throw new IllegalArgumentException("string has length 0");
//		    }
//		 
//		 else 
//		 {
//			if (s.length() %2 == 0 ) //if (isOdd(s.length())== false)
//		 {
//			 return s.charAt((int)(s.length()/2)+1);
//		 }
//		 else {
//			 double Spot = s.length()/2+ 0.5;
//		    return s.charAt((int)Spot);
//	   }
//		 }
	}

	/**
	 * Sorts a list of two integers so that the elements are in descending order
	 * (largest to smallest). The size of the list remains unchanged.
	 * 
	 * @param t
	 *            a list
	 * @throws IllegalArgumentException
	 *             if the size of list is not equal to 2
	 */
	public static void sort2(List<Integer> t) {
		 if (t.size() != 2) {
	            throw new IllegalArgumentException("list size != 2");
	        }
	        int t0 = t.get(0);
	        int t1 = t.get(1);
	        if (t0 > t1) {
	            t.set(0, t1);
	            t.set(1, t0);
	            }
	}

	/**
	 * Returns the sum of the absolute value of the elements in a list. The sum
	 * of an empty list is <code>0</code>. The method does not modify the list.
	 * 
	 * @param t
	 *            a list
	 * @return the sum of the absolute value of the elements in a list
	 */
	public static double sumAbsolute(List<Double> t) {
		
		return 0.0;
	}

	/**
	 * Replaces each string in a list with the uppercase version of the string.
	 * The size of the list remains unchanged. For example, the method would
	 * modify the list <code>["some", "random", "WoRdS"]"</code> to become
	 * <code>["SOME", "RANDOM", "WORDS"]"</code>.
	 * 
	 * @param t
	 *            a list of strings
	 */
	public static void toUpperCase(List<String> t) {
		
	}
	

}