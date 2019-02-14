package eecs2311.week3;

public class Counter {
private int data;
	
	public Counter() {
		data = 0;
	}
	
	public int increment() {
		data++;
		return data;
	}
	
	public int decrement() {
		data--;
		return data;
	}
	public int reset()
	{
		data = 0;
		return data;
	}
	
	public int increment(int value)
	{
		data += value;
		return data;
	}
	public int decrement(int value)
	{
		data -= value;
		return data;
	}
	public int getValue()
	{
		return data;
	}
}
