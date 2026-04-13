package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamApi {
  public static void main(String [] args) {
	  List<Integer> nums= Arrays.asList(1,5,3,2,7,6);
      Stream <Integer> str=nums.stream();
     
  	
      //for each sends the stream value to consumer and consumer prints it one by one 
      //reffer consumers_op class
      str.forEach( n-> System.out.println(n.intValue()));//this is a consumer operation
      
      Stream<Integer>str2=nums.stream();
      Stream<Integer>str3=str2.filter(n->n%2==0);//this is a predator method;
      //reffer predicate_class
      Stream<Integer>str4=str3.map(n->n*2);//maps is Function the old value to new based on the argument provided
      //reffer map
      Integer i=  str4.reduce(0,(a,b)->a+b);//accumulator reduce all the value to one value
      //reffer accumulators class
      //a=a+b repeat till list end,b=next value a=1,b=2->a=3,a=3,b=3->a=6,a=6,b=4->a=10
      System.out.println(i);
      //all in one
      int k=nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(a,b)->a+b);
      System.out.println(k);
  }
}
