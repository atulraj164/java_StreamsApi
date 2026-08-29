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
 }
}
