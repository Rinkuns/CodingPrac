package com.sasken.Rinkun;

public class Parents {
	public static void main(String[] args) {
			
			int input1=3;
			int input2 =1;
			int[] input3= {-1,0,0};
			System.out.println(jhon(input1, input2, input3));
	}
			
	static int jhon(int input1,int input2,int[] input3) {
			int Parent[] = new int[input1];
			
			int sub[] = new int[input1];
			
			int c = 0;
			
			for(int i=0; i<input1; ++i)
			{
				Parent[i] =input2;
				
				if(Parent[i] != -1)
					++sub[Parent[i]];
			}
			
			for(int i=0; i<input3.length; ++i)
			{
				if(sub[i] >= input2)
					++c;
			}
			
			return c;
		}

}
