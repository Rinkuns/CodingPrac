package com.prog.prac;

import java.util.HashSet;

public class SareenaFlower {
public static void main(String[] args) {
int input1=5;
int input2=3;
int[] input3= {1,1,2,1,5};
System.out.println(flower(input1, input2, input3));

	
}static int flower(int input1,int input2,int[] input3) {
	HashSet<Integer> hs=new HashSet<Integer> ();
	for(int i=0;i<input1;i++) {
		if(i<input2) {
			hs.add(input3[i]);
		}
	}
	return hs.size();
}
}
