import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(packageRice(2, 10, 18));

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
	
	public static boolean isPalindrome(String word) { 
		for (int i = 0; i < word.length() - 1; i++) {
			if(word.charAt(i) != word.charAt((word.length() - 1) - i))
	                return false;
		}
		return true;
	}
	
	//FIBONACCI EVEN NUMBERS
	public static Integer fibonacciEvenNumbers(Integer n) { 
		
		Integer total = 0;
		Integer prevprev = 0;
		Integer prev = 1;
		Integer fibonacci = 0;
		
		while(prevprev + prev < n) {
			fibonacci = prevprev + prev;
			prevprev = prev;
			prev = fibonacci;
			if(fibonacci % 2 == 0) {
				total += prev;
			}
		}
		return total;
    }
	
	//GREATEST COMMON DIVISOR
	public static Integer gcd(Integer p, Integer q) { 
		
		Integer divisor = 1;
		Integer gcd = 1;
		
		while(p > divisor ) {
			if(p % divisor == 0 && q % divisor == 0) {
				gcd = divisor;
		}
			divisor++;
		}
		return gcd;
	}
	
	//PACKAGE RICE BAGS
	public static Boolean packageRice(Integer big, Integer small, Integer goal) { 

			while(goal - 5 >= 0 && big > 0) {
				goal -= 5;
				big--;
			}
			while(goal - 1 >= 0 && small > 0) {
				goal -= 1;
				small--;
			}
			if(goal == 0)
				return true;
			
			return false;
	}
	
	//FILTER STRINGS USING LAMBDAS AND STREAMS
	public List<String> search(List<String> list) { 
		
		List<String> result = list.stream()             
                .filter(word -> word.length() == 3)
                .filter(word -> word.startsWith("a"))
                .collect(Collectors.toList());              

        return result;
		
	}
}
