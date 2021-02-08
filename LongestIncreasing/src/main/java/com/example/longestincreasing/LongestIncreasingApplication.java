package com.example.longestincreasing;


import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingApplication {

	private static ArrayList<Integer> createRandArry()
	{
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i < 100; i++)
		{
			list.add((int)(Math.random()*100));
		}
		return list;
	}

	private static int LongestSubsequence(ArrayList<Integer> inputArry)
	{
		return 0;	//placeholder
	}

	public static void main(String[] args) {
		List l = createRandArry();
		System.out.println(l);
	}
}
