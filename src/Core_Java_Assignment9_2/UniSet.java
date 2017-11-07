package Core_Java_Assignment9_2;
import java.util.*;  
public class UniSet {
    public static void main(String a[]){      
	      
    	TreeSet<Integer> ExampleSet1=new TreeSet<Integer>(); //Initializing TreeSet, creates a TreeSet object ExampleSet1.
    	ExampleSet1.add(20);   // add() method is used to add an element to the ArrayList. 10 is added to the ExampleSet1.
    	ExampleSet1.add(30);   // add() method is used to add an element to the ArrayList. 20 is added to the ExampleSet1.
    	ExampleSet1.add(10);   // add() method is used to add an element to the ArrayList. 30 is added to the ExampleSet1.
	       	        
	        System.out.println("Set1 : "+ExampleSet1);  //It will print all the elements in the ExampleSet1.
	                
	     TreeSet<Integer> ExampleSet2=new TreeSet<Integer>(); //Initializing TreeSet, creates a TreeSet object ExampleSet2.
	     ExampleSet2.add(50);  // add() method is used to add an element to the ArrayList. 30 is added to the ExampleSet2.
	     ExampleSet2.add(40);  
	     ExampleSet2.add(30);  
	     ExampleSet2.add(45);
	     
	        System.out.println("Set2 : "+ExampleSet2);  //It will print all the elements in the ExampleSet2
	        
	        ExampleSet1.addAll(ExampleSet2);           //Inserting all of the ExampleSet2 elements to the ExampleSet1 ArrayList.
	        
	        System.out.println("Union of Set1 and Set2 is : "+ExampleSet1);  //It will all the unique elements of ExampleSet1 and ExampleSet2 in ascending order. 
	        
	    }  
	}  
	
	


