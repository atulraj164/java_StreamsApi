package streamApi;
import 	java.util.function.Consumer;

//consumer is an interface that consumes one value in its function
public class Consumers_op {
         public static void main(String[] args) {
        	 Consumer<Integer>con=new Consumer<Integer>() {


				@Override
				public void accept(Integer t) {
					System.out.println(2*t.intValue());
					
				}
        		 
        	 };
        	 con.accept(5);
        	 
        	 // also code can be reuced using lamda cause interface is abstract only one method
        	 
        	 Consumer<Integer>con2=t->System.out.println(t.intValue());
         }
}
