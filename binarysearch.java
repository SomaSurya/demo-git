package com.BinarySearch.www;

import java.util.Scanner;

public class SwappingArrayIndexes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The length of array:");
		int [] arr = new int [scan.nextInt()];
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Before Swapping array indexs:");
		for(int elem:arr) {
			System.out.println(elem+" ");
		}
		System.out.println("Enter the index1:");
		int index1=scan.nextInt();
		System.out.println("Enter the index2:");
		int index2=scan.nextInt();
		
		if(index1>=0 && index1<=arr.length && index2>=0 && index2<=arr.length)
		{
			int temp;
			temp=arr[index1];
			arr[index1]=arr[index2];
			arr[index2]=temp;
		}
		else
		{
			System.out.println("Invalid Indexes");
		}
		System.out.println("After Swapping array indexs:");
		for(int elem:arr) {
			System.out.println(elem+" ");
		}
		
	}

}
