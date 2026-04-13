package streamApi;

import java.util.function.Predicate;

public class predictor {
	public static void main(String[] args) {

 Predicate<Integer>pr=new Predicate<Integer>(){

	@Override
	public boolean test(Integer t) {
		if(t%2==0) {
		return true;
	}else {
		return false;
	} 
 }
};
 System.out.println(pr.test(3));
 
 //by lamda
 Predicate <Integer> pd=t->t%2==0;
 System.out.println(pd.test(2));
}
 }