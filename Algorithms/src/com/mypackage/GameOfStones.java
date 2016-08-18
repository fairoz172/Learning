package com.mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GameOfStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.valueOf(sc.nextLine());
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		result.put(0, 0);
		result.put(1, 0);
		result.put(2, 1);
		result.put(3, 1);
		result.put(4, 1);
		result.put(5, 1);
		for(int n = 6; n <= 103; n++){
			if(result.get(n-2)!=1 || result.get(n-3) != 1 || result.get(n-5) != 1){
				result.put(n, 1);
			}else{
				result.put(n, 0);
			}
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0 ; i < t ; i++){
			numbers.add(Integer.valueOf(sc.nextLine()));
		}
		for(Integer number : numbers){
			if(result.get(number) == 1){
				System.out.println("First");
			}else{
				System.out.println("Second");
			}
		}
	}


}
