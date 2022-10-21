package com.prog.prac;

public class MayerAndExam {
	public static void main(String[] args) {
		int input1 = 5;
		int[] input2 = { 1, 2, 3, 4, 5 };

		System.out.println(mayer(input1, input2));
	}

	static int mayer(int input1, int[] input2) {
		int sum = 0, found = 1;
		int i, l;
		for (i = 1; i < input1; i++) {
			while (found == 1) {
				for (l = 0; l < i; l++) {
					if (input2[i] == input2[l]) {
						input2[i]++;
						found = 1;
						break;
					} else
						found = 0;
				}
			}
			found = 1;
		}
		for (int j = 0; j < input1; j++) {
			sum += input2[j];
		}
		return sum; // while writing a program instead of writing this

	}
}
