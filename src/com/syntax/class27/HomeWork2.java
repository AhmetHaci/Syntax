package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class HomeWork2 {
 
	public static void main(String[] args) {
		
          List<String>myList=new ArrayList<>();
          myList.add("Smile");
          myList.add("Run");
          myList.add("Study");
          myList.add("prepare");

          Iterator<String> newList=myList.iterator();
          while (newList.hasNext()) {
        	  if (newList.next().endsWith("e")) {
        		  newList.remove();
        		
        	  }
          }
          System.out.println(myList);
	}

}
