package streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class practice {
	
	static class  employe implements Comparable{
		
		public employe(int id, String name, int salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		int id;
		String name ;
		int salary;
		


		@Override
		public int compareTo(Object o) {
			employe emp=(employe)o;
			if(this.salary>emp.salary) {
				return 1;
			}else {
				return -1;
			}
		}
		
	}
	
	static class compare implements Comparator{

	
		@Override
		public int compare(Object o1, Object o2) {
			employe e1,e2;
			e1=(employe)o1;
			e2=(employe)o2;
			
			if(e1.salary >e2.salary) {
				return 1;
			}else {
				return -1;
			}
			
		}
		
	}
 public static void main(String[] args) {
		
    	 ArrayList<employe> emp = new ArrayList<>();
         
    	 employe e1=new employe(1,"sdd",12223);
    	 emp.add(e1);
    	 emp.add(new employe(1, "Rahul", 25000));
         emp.add(new employe(2, "Amit", 30000));
         emp.add(new employe(3, "Priya", 35000));
         emp.add(new employe(4, "Neha", 28000));
         emp.add(new employe(5, "Ravi", 40000));


	  emp.stream().sorted(Comparator.comparingInt((employe e)->e.salary).reversed())
                     .forEach(e->System.out.println(e.name+" "+e.salary));

	  Optional<employe> max= emp.stream().max(Comparator.comparingInt(e->e.salary));   
       System.out.println(max.get().salary);

	  //  Collections.sort(emp, new compare());
         
       //  Collections.sort(emp);
        
        
      //   emp.forEach(n->System.out.println(n.salary));
   
    	 
      //   List<Integer> arr = List.of(10, 20, 20, 30, 30, 30);
    	 
    	/* List<Integer>list=
    			  arr.stream()
    			 .filter(n->n>5).map(n->n*2)
    			 .toList();
    	 
    	 */
      //   List<Integer>list=arr.stream().filter(n->n>15).distinct().toList();
         
         
         List<Integer> list = List.of(30, 10, 20, 20, 40, 15, 30);
         
      /*   list=list.stream()
        		 .filter(n->n>20)
        		 .distinct()
        		 .sorted(Comparator.reverseOrder())
        		 .toList();
         
         */
	 //list.stream().filter(n->n%2==0).limit(4).skip(2).forEach(System.out::println);
/*	  Optional<Integer> ans=list.stream().sorted(Comparator.reverseOrder()).min(Comparator.naturalOrder());
         System.out.println(ans);
	 
	  long k=list.stream().filter(n->n%2==0).count();
      System.out.println(k);
       
      System.out.println(list.stream().anyMatch(n->n%2==0));
      System.out.println(list.stream().allMatch(n->n%2==0));
      System.out.println(list.stream().noneMatch(n->n>50));
       
       
      list=list.stream().filter(n->n%2==0).limit(4).skip(2).toList();
	  Optional<Integer> ans=list.stream().sorted(Comparator.reverseOrder()).findFirst();
      System.out.println(ans);
*/
	 Optional<Integer> ans=list.stream().max(Comparator.naturalOrder());
        System.out.println(ans);
   List<Integer> nums = List.of(10, 20, 10, 30, 20, 40, 30);
         
        Optional<Integer> sum=nums.stream().sorted(Comparator.reverseOrder()).findFirst();
        nums.stream().distinct().toList().forEach(System.out::println);

	 
      Iterator <Integer>itr=list.iterator();
    	 
      while(itr.hasNext()) {
    		 System.out.println(itr.next());
    	 }
    	 
 }
}
