import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(3));

	}
	
	//NON-RECURSIVE FACTORIAL
	public static Integer factorial(Integer n) { 
		Integer factorial = n;
		while(n > 1){
		factorial *= (n-1); 
		n--;
		}
		return factorial;
	}
	
	//RECURSIVE FACTORIAL
	public static Integer recursiveFactorial(Integer n) { 
			if(n<1)
				return 1;
			else
			return (Integer)n * recursiveFactorial((--n));

	}
	
	//POSITION IN ARRAY
	public static int search(Integer n, Integer[] list) { 
		
		for (Integer integer : list) {
			if(integer.equals(n)) {
				return java.util.Arrays.asList(list).indexOf(integer);
			}
		}
		return -1;
	}
	
	//REVERSE STRING
	public static String reverse(String s) { 
		String reverse = "";
		for(int i = s.length() - 1; i >= 0; i--)
		{
		reverse = reverse + s.charAt(i);
		}
		return reverse;
	}
	
	//FIND LARGEST
	public static Integer findLargest(Integer[] list) {
		Integer largest = 0;
		for (Integer integer : list) {
			if(integer > largest) {
				largest = integer;
			}
		}
		return largest;
	}
		
	//FIND AVERAGE
	public static Double FindAverage(List <Integer> list) {
		double average = 0.0;
		for (Integer integer : list) {
			average += integer;
		}
		average = average / list.size();
		return average;
	}
		
	//FIND AVERAGE - LAMBDA EXPRESSION
	public static Double FindAverageByStream(List <Integer> list) {
		
		return list.stream().mapToDouble(i -> i).average().getAsDouble();
	}
	
	//TO UPPER CASE - LAMBDA EXPRESSION
	public static List <String> upperCase(List<String> list) {
    	return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
	
	//FIBONACCI
	public static Integer fibonacci(Integer n) { 
		ArrayList<Integer> fibonacciArrayList = new ArrayList<>(Arrays.asList(0, 1));
		for (int i = 1; i < 10; i++) {
			fibonacciArrayList.add((fibonacciArrayList.get(i - 1) + fibonacciArrayList.get(i)));
		}
		return fibonacciArrayList.get(n);
    }

}
