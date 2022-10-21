package com.prog.prac;

public class HarryQuest {
public static void main(String[] args) {
	int[] inputArray=new int[] {1,2,3,4,5};
	int siblingsTofindOf=1;
	int[] results=findSiblings(inputArray.length,inputArray,siblingsTofindOf);
	System.out.print("(");
	for(int i=0;i<results.length;i++) {
		if(i>0 && i<results.length) {
			System.out.println(" ,");
		}
		System.out.print(String.valueOf(results[i]));
	}
	System.out.print(")");
	
}
public static int[] findSiblings(int input1,int[] inpu2,int input3) {
	int[] result=new int[] {-1};
	if(inpu2[0]==input3) {
	return	result;
	}
	int siblingFindIndex=-1;
	for(int i=0;i<inpu2.length;i++) {
		if(inpu2[i]==input3) {
			siblingFindIndex=i;
			break;
		}
	}
	if(siblingFindIndex>-1) {
		result=new int[] {inpu2[siblingFindIndex-1],inpu2[siblingFindIndex+1]};
	}
	return result;
}

}
