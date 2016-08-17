package com.mypackage;

public class ChessProblem {
	/*
	 * Find the count to reach the given point in chess from (0,0) considering you can move only (1,2) or (2,1) steps
	 */
	public static void main(String[] args) {
		ChessProblem cp = new ChessProblem();
		System.out.println(cp.solution(5, 4));
	}


	private int solution(int x, int y) {

		if(x < 0 || y < 0){
			return -1;
		}
		if(x == 0 && y == 0){
			System.out.println("("+x+","+y+") = " + 0);
			return 0;
		}
		int firstMove = solution(x-2, y-1);
		int secondMove = solution(x-1, y-2);
		if(firstMove != -1){
			System.out.println("("+x+","+y+") = " + (firstMove + 1));
			return firstMove + 1;
		}else if (secondMove != -1){
			System.out.println("("+x+","+y+") = "+ (secondMove + 1));
			return secondMove + 1;
		}
		return -1;
	}

}
