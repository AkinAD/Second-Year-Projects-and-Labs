package ltTest2;

import java.util.ArrayList;

public class Hour {
	
	public static final String AM = "AM";
	public static final String PM = "PM";
	private int hour;
	public Hour()
	{
		this(0);
	}
	public Hour(int hour)
	{
		Hour.check24(hour);
		this.hour = hour;
	}

	public Hour(int hour String ampm) 
	{
		Hour.check12(hour, ampm);
		this.hour = Hour.to24HourClock(hour, ampm);
	
		
	}
	public Hour(Hour other) 
	{
		this.hour = other.hour;
	}
	public static boolean isValid(int hour)
	{
		if (hour >= 0 && hour <= 23) 
		{
			return true;
		}
		else
			return false;
	}
	public static boolean isValid(int hour,
            String ampm)
	{
		Boolean digit;
		Boolean label;
		if (hour >= 0 && hour <= 11) 
		{
			digit= true;
		}
		else
			digit =  false;
		if (ampm.contains(AM) || ampm.contains(PM) )
		{
			label = true;
		}
		else label = false;
		if (digit == true && label == true ) 
		{
			return true;
		}
		else return false;
		
	}
	public static void check12(int hour,
            String ampm) 
	{
		if(hour < 1 || hour > 12) {
			throw new IllegalArgumentException("Typically the 12 hour clock is between 1 and 12 dood. /n Figure it out.");
		}
		else if (!ampm.contains(AM) || !ampm.contains(PM)) {
			throw new IllegalArgumentException("Damn, you must think you're important or some shit, trying to make up a new time of day that isn't  AM or PM ? /n Twat.");
					}
	}
	public static void check24(int hour)
	{
		if(hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Typically the 24 hour clock is between 0 and 12  dood. /n Figure it out.");
		
		}
		}
	public static int to24HourClock(int hour,
            String ampm)
	{	
		Hour.check12(hour, ampm);
		if(ampm.contains(PM) && hour != 12) {
			hour = 12 + hour;
			}
		else if (ampm.contains(AM) && hour == 12 )
		{
			hour = 0;
		}
		return hour;
	}
	public static int to12HourClock(int hour)
	{
		Hour.check24(hour);
		if(hour > 11) {
			hour = hour - 12;
			}
		return hour;
	}
	public int getHour()
	{
		return this.hour;
	}
	public void setHour(int hour)
	{	
		Hour.check24(hour);
		this.hour = hour;
		
	}
	public void setHour(int hour,
            String ampm)
	{	Hour.check12(hour, ampm);
		this.hour = Hour.to24HourClock(hour, ampm);
		
		
		
	}
	public boolean equals(String h) 
	{ String[] parts = h.split(" ");
	  int hour  = Integer.parseInt(parts[0]);
	  String ampm = parts[1];
	  boolean eq = h != null && Hour.isValid(hour, ampm);
		if(eq)
		{
			eq= this.hour == Hour.to24HourClock(hour, ampm);
		}
		return eq;
	}
}
