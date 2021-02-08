package com.example.longestincreasing;


import java.util.ArrayList;
import java.util.Arrays;
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
		//inits the temp array otherwise set call will throw an exception
		for(int i = 0; i < inputArry.size(); i++)
			temp.add(0);
		//current max
		int max = 0;
		//double for loop, iterates through both dirs
		for(int i = 0; i < inputArry.size(); i++)
		{
			//initial length always starts at 1, gets updated then stored
			int len = 1;
			for(int j = i-1; j >= 0; j--)
			{
				//increments the length
				if(inputArry.get(i) > inputArry.get(j))
					if(temp.get(j)+1 > len)
						len = temp.get(j)+1;
			}
			//sets the current length to arraylist
			temp.set(i, len);
			if(len > max)
				max = len;
		}
		return max;
	}

	public static void main(String[] args) {
		//checks for random array of length 100
		ArrayList<Integer> l = createRandArry();
		System.out.println(l);
		System.out.println(LongestSubsequence(l));

		//test case from online, result should be 6
		int[] ary={0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
		ArrayList<Integer> al = new ArrayList<>();
		for(int i : ary)
			al.add(i);
		System.out.println(LongestSubsequence(al));

		//2nd test case result should be 4
		int[] nums = {0,1,0,3,2,3};
		al.clear();
		for(int i : nums)
			al.add(i);
		System.out.println(LongestSubsequence(al));
	}
}
