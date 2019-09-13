package assignment2;
import java.util.*;
import java.math.*;
import java.util.Random;

public class bench {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size()<10){
		int num=(int)(Math.random()*100);

		hs.add(num);
		System.out.println(num);

		}
		
	}

}