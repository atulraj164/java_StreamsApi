package streamApi;

import java.util.Optional;
import java.util.function.Function;

public class map_it {
	public static void main(String[] args) {
 Function<Integer,Integer> map=new Function<Integer,Integer>(){

	@Override
	public Integer apply(Integer t) {
		return t*2;
	}
	 
 };
 
    System.out.println(map.apply(9));
   
    //lamda implementation as ot is functional interface
    
    Function<Integer,Integer> map2=n->n*2;
    
	}
}
