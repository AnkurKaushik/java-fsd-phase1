package com.example.longestincreasing;


import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingApplication {

	//inits new arraylist of length 100 with random ints between 0-100
	private static ArrayList<Integer> createRandArry()
	{
		//output list
		ArrayList<Integer> list = new ArrayList<>();
		//adds the ints
		for(int i=0; i < 100; i++)
			list.add((int)(Math.random()*100));

		return list;
	}

	//code to return the longest subsequence
	private static int LongestSubsequence(ArrayList<Integer> inputArry)
	{
		//holds value of current longest lengths starting at each index
		ArrayList<Integer> temp = new ArrayList<>();
		int max = 0;
		

		return max;
	}

	public static void main(String[] args) {
		List l = createRandArry();
		System.out.println(l);
	}
}
