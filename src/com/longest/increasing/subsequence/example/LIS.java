package com.longest.increasing.subsequence.example;
import java.util.*;
public class LIS {
public static void main(String[] args){
	int arr[]= {1,23,45,67,29,12,87,91,13,54,98,21,99};
	int length=arr.length;
	System.out.println("given array is ::");
	for(int i=0;i<arr.length;i++){
		
		System.out.println( +arr[i] +" ");
	}
	System.out.println("the given size of the array is::" +length);
	
	longestIncreasingSubsequence(arr,length);
	System.out.println("the length of the lis is ::" +longestIncreasingSubsequence(arr, length));
	

	LIS obj =new LIS();
	int result=obj.longestIncreasingSubsequence(arr,length);
	int[] result1= obj.printlis(arr,length);
	System.out.println("the longest increasing subsequence is----");
	for(int i=0;i<result1.length;i++) {
	   if(result1[i]!=0)
	System.out.println(result1[i]);

	}
	
		
	
	
}


  
public static int[] printlis(int[] arr, int length) {

int[] lis=new int[length];
int[] lis1=new int[length];
//int lis1[]={0};
int i,j,result=0,count=0;
for ( i=0;i<length;i++){
lis[i]=1;
}
for(i=1;i<length;i++) {
for(j=0;j<i;j++) {
if(arr[i]>arr[j] && lis[i]<lis[j]+1) {
lis[i]=lis[j]+1;

}
}

}
j=0;
for(i=0;i<length;i++) {
   if(lis[i]>count){
lis1[j]=arr[i];
count++;
j++;
  }
}
return lis1;
}

	

//this function returns the length of the lis
public static int longestIncreasingSubsequence(int[] arr, int length) {
	
	int[] lis=new int[length]; 
	int i,j,result=0;
	for ( i=0;i<length;i++) {
		lis[i]=1;
	}
	for(i=1;i<length;i++) {
		for(j=0;j<i;j++) {
			if(arr[i]>arr[j] && lis[i]<lis[j]+1) {
				lis[i]=lis[j]+1;
				
			}
		}
		
	}
	//picks up maximum of all the lis values
	for(i=0;i<length;i++) {
		if(result<lis[i]) {
			//System.out.println(lis[i]);
			result=lis[i];
		}
		
	}
	return result;
}

		
		
}

