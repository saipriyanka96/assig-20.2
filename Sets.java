package set;
//Package is a grouping of related types providing access protection and name

import java.util.HashSet;
import java.util.Set;

public class Sets {
	//public keyword is used in the declaration of a class,method or 
		//field;public classes,method and fields can be accessed by the 
		//members of any class.
		//class defines instance and class fields,methods and inner classes as
		//well as specifying the interfaces the class implements and the 
		//immediate superclass of the class
	  

	public static void main(String[] args)
//static is used for memory management
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
			
	{
		// TODO Auto-generated method stub
		Set set1=new HashSet();
//As it implements the Set Interface, duplicate values are not allowed.
//Objects that you insert in HashSet are not guaranteed to be inserted
//in same order. Objects are inserted based on their hash code. 
//NULL elements are allowed in HashSet. HashSet also implements 
//Serializable and Cloneable interfaces.
//creating the object
		set1.add("priya");//add the values
		set1.add("meera");
		set1.add("anika");
		set1.add("gauri");
		
		Set set2=new HashSet();
		//creating the objects
		set2.add("uma");//adding the values
		set2.add("shanthi");
		set2.add("bhavya");
		set2.add("tharani");
		
		System.out.println("Set1 elements:"+set1);//print set1
		System.out.println("Set2 elements:"+set2);//print set2
		set1.addAll(set2);//add all the values of set2 to set1
		System.out.println("After adding set2 elements into set1:");
		System.out.println(set1);//print set1
		//system is final class
	      //out is a static member of system class and type printStream
	      //println is method of printStream class.ln means nextline
	    
	}

}
