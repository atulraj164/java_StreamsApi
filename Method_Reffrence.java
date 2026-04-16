package Functional_programing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//method REffrence used to implement functional; style programing where we can call method inside method
//A method reference is a shorthand way of writing a lambda expression that calls a method.
//ClassName::methodName
public class Method_Reffrence {
  public static void main(String [] args) {
	  
	  List<String>numsSmall=Arrays.asList("ram","shyam");
	  List<String>numsCap=numsSmall.stream().map(n->n.toUpperCase()).toList();
	  
	  //or we can use ,method reffrence
	  List<String>numsCap1=numsSmall.stream().map(String::toUpperCase).toList();
	  
	  //just method and the class it belongs to
	  
	  List<Students>students=new ArrayList<>();
	  List<String>std=Arrays.asList("par","akns");
	  
	  //copy all names int students list by creating new object
	  
	  	//students=std.stream().map(n->new Students(n)).toList();
	  	//or using reffrence
	  students=std.stream().map(Students::new).toList();
	  
	  	
  }
} 
