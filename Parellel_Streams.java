package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//A parallel stream splits data into multiple parts and processes them simultaneously using multiple threads.
//Uses ForkJoinPool (common pool) internally.

public class Parellel_Streams {
  public static void main(String [] args) {
	  List<Integer> nums=new ArrayList<>();
	   Random ran=new Random();
	   
	  for(int i=0;i<10_000;i++) {
		  nums.add(ran.nextInt());
	  }
	  
	  //can do traditionaly also
	  int sum=nums.parallelStream().mapToInt(i->i).sum();
	  //mapToInt produces stream of input types only thaats why we can apply mathematical operation
	  System.out.println(sum);
 	
}
}
