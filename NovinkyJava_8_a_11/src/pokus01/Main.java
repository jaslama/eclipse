package pokus01;

//pozn.: kdyz jsem to chtel dostat do gitu, tak se muselo pres Teams / Share Project
//       naopak z gitu: Imort / Git 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("a","z","b","x","c","d","jouda","mòouk","mrsk");

		list.stream().forEach(System.out::println);
		System.out.println("--01---------------------------------------");
		
		list = list.stream()
				   .sorted()
				   .map(x -> x+x)
				   .filter(x -> !x.equals("bb"))
				   .map(String::toUpperCase)
				   .filter(x -> !x.equals("XX") && !x.equals("AA"))
				   .map(x -> x+"_"+x.length())
				   .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("--02---------------------------------------");

        list.stream().forEach(System.out::println);
        System.out.println("--03---------------------------------------");
	}

}
