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

	//finds longest consecutive subsequence in an arraylist
	private static int longestConsecutiveSubsequence(ArrayList<Integer> inputArry)
	{
		//max is the absolute max, len is the current max value from the index
		int max = 1;
		int len = 1;
		//loops through the array, checks to see if the values are strictly increasing and updates len
		for(int i = 0; i < inputArry.size()-1; i++)
		{
			//values are increasing
			if(inputArry.get(i+1) > inputArry.get(i))
			{
				//increment len, updates max if necessary
				if(len+1 > max)
					max = len+1;
				len++;
			}
			//values are not increasing, reset len
			else len = 1;
		}
		//check if final length is larger than max
		if(len > max)
			max = len;
		return max;
	}

	//code to return the longest subsequence
	//PROBLEM DEFINITION CHANGED TO LONGEST CONTIGUOUS SUBSEQUENCE, THIS SOLVES FOR LONGEST DISJOINT SUBSEQUENCE
	/*private static int LongestSubsequence(ArrayList<Integer> inputArry)
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
	}*/

	public static void main(String[] args) {
		/*//checks for random array of length 100
		ArrayList<Integer> l = createRandArry();
		System.out.println(l);
		System.out.println(LongestSubsequence(l));*/

		//first test case, should be 3
		int[] nums = {1,3,5,4,7};
		ArrayList<Integer> al = new ArrayList<>();
		for(int i : nums)
			al.add(i);

		System.out.println(al);
		System.out.println(longestConsecutiveSubsequence(al));

		//next test case, should be 5
		int[] nums2 = {1,5,6,2,4,7,9,11,0};
		al.clear();
		for(int i : nums2)
			al.add(i);

		System.out.println(al);
		System.out.println(longestConsecutiveSubsequence(al));

		//next test case, should be 5
		int[] nums3 = {8,7,6,5,4,2,3,8,4};
		al.clear();
		for(int i : nums3)
			al.add(i);

		System.out.println(al);
		System.out.println(longestConsecutiveSubsequence(al));
	}
}
