package streamApi;

import java.util.function.BiFunction;

public class accumulators {
 public static void main(String [] args) {
	 BiFunction<Integer,Integer,Integer>sum=new BiFunction<>(){

		@Override
		public Integer apply(Integer t, Integer u) {
		
			return t+u;
		}
		 
	 };
 }
}
