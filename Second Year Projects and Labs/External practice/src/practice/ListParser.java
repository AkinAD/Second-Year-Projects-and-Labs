package practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ListParser {
	String text = "";
    BufferedWriter outputTxt = null;
    ListManager aList;
    ArrayList<String> output = new ArrayList<String>();
    ListParser(ListManager List)
    {
    	this.aList = List;
    }
    public void createHeader()
    {
    	output.add(aList.getNode().getKeyPhrase()); //Based on Phils Explanation when you first call this method it is on node 1 by default 
    	System.out.println(output + "Bananna");
   // Output.add(arg0)
    }
//	ListParser(ListManager List) throws IOException
//	{
//		 output = new BufferedWriter(null);
//	        try {
//	            File file = new File("example.txt");
//	            output = new BufferedWriter(new FileWriter(file));
//	            output.write(text);
//	        } catch ( IOException e ) {
//	            e.printStackTrace();
//	        } finally {
//	          if ( output != null ) {
//	            output.close();
//	          }
//	        }
//	    }
private void writeToFile()
{
}
}
