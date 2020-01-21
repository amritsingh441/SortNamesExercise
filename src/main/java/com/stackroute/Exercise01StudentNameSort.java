package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Complete the code below as given in the problem.md file
public class Exercise01StudentNameSort {
	
	public static String[] sortStudents(String[] studentNames, int[] percentage) {
		
		Map <Integer, String> myMap = new TreeMap<Integer, String>();
		for (int i = 0; i < studentNames.length; i++) {
			myMap.put(percentage[i], studentNames[i]);
		}
		Iterator<Integer> mykeySet = myMap.keySet().iterator();
		List<String> tmpList = new ArrayList<String>();
		while(mykeySet.hasNext()) {
			tmpList.add(myMap.get(mykeySet.next()));
		}
		String [] resArr = new String[tmpList.size()];
		for (int i = 0; i < tmpList.size(); i++) {
			resArr[i] = tmpList.get(i);
		}
		return resArr;
	}
	
	//Do not print anything other than what's expected/asked in problem
	public static void main(String[] args) {
		//Use Scanner to get input from console
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		String [] tmpArr = inputStr.split(";");
		List<String> namesList = new ArrayList<String>();
		List<String> percentList = new ArrayList<String>();
		for (int i = 0; i < tmpArr.length; i++) {
			namesList.add(tmpArr[i].split(":")[0]);
			percentList.add(tmpArr[i].split(":")[1]);
		}
		String [] studentNames = new String [namesList.size()];
		int  [] percentage = new int [percentList.size()];
		for (int i = 0; i < namesList.size(); i++) {
			studentNames[i] = namesList.get(i);
		}
		for (int i = 0; i < percentList.size(); i++) {
			percentage[i] = Integer.parseInt(percentList.get(i));
		}
		System.out.println(Arrays.toString(sortStudents(studentNames,percentage)));
	}
}