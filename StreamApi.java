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
      
  }
}
