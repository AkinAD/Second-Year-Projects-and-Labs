package week5DataStructures;

public class StringList {
private String[] elements;
private int capacity;
private int size;
public StringList(int capacity) {
	if (capacity < 1) {
		throw new IllegalArgumentException("capacity must be positive");
	}
	this.capacity = capacity;
	this.size = 0;
	this.elements = new String[capacity];
	}
public String get(int index)
{
	if (index < 0 || index >= this.size)
	{
		throw new IndexOutOfBoundsException("index: "+ index);
	}
	return this.elements[index];
}
public String set(int index, String element)
{
	String oldElement = this.get(index);
	this.elements[index] = element;
	return oldElement;
}
public boolean add(String element)
{
	if (this.size == this.capacity)
	{
		this.resize();
	}
	this.elements[this.size] = element;
	this.size++;
	return true;
}
public void resize() {
	int newCapacity = 2* this.capacity;
	String[] newElements =  new String[newCapacity];
	for (int i = 0; i< this.size; i++) {
		newElements[i] = this.elements[i];
	}
	this.capacity = newCapacity;
	this.elements = newElements; 
}
public void add (int index, String element) {
	if (index <0 || index > this.size)
	{
		throw new IndexOutOfBoundsException("index: "+ index);
	}
	if (this.size ==  this.capacity)
	{
		this.resize();
	}
	for (int i =  this.size-1; i>= index; i--)
	{
		this.elements[i+1] = this.elements[i];
		
	}
this.set(index, element);
}
}
