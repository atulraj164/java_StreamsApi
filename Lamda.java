package streamApi;

import java.util.ArrayList;

public class Lamda {
	
	public interface str {	
		public int add(ArrayList<Integer> arr);
	}
	
         public static void main(String[] args) {
        	 
        	 ArrayList<Integer> arr=new ArrayList<>();
        	 for(int i=1;i<=10;i++) {
        		 arr.add(i);
        	 }
        	 
        	 str st=(ArrayList<Integer> list)->{
        			  int sum = 0;
        			  for(int i:arr) {
        				  sum+=i;
        			  }
        			  return sum;
        		 
        	 };
        	 
			 
        	 
        	System.out.println(st.add(arr));
        	
        	
      arr.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        	 
        	 
        	 
		}
}
