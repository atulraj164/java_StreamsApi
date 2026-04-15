package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//optioinals special variables take generics 
//used to avoid null pointer exception if no value or null alue returned by the stream
public class Optionals {
 public static void main(String [] args) {
	 List<String> names=Arrays.asList("ram","sham","ghnsam");
	 String can="ram";
	Optional<String> str=names.stream().filter(n->n.equals(can)).findFirst();
	System.out.println(str.get());
	 	//or
	String can2="raj";
  String str2=names.stream().filter(n->n.equals(can2)).findAny().orElse("not found");
	
	//it will automaticaly create optional and save from null pointer exception
}
}
