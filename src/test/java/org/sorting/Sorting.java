package org.sorting;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {

		// Test Case 1
		int[] input1 = { 4, 2, 7, 1, 5 };
		int[] expectedOutput1 = { 1, 2, 4, 5, 7 };
		testSorting(input1, expectedOutput1);

		// Test Case 2
		int[] input2 = { 9, 3, 1, 8, 5 };
		int[] expectedOutput2 = { 1, 3, 5, 8, 9 };
		testSorting(input2, expectedOutput2);

		// Test Case 3
		int[] input3 = { 7, 5, 3, 1 };
		int[] expectedOutput3 = { 1, 3, 5, 7 };
		testSorting(input3, expectedOutput3);

		// Test Case 4
		int[] input4 = { 10, 20, 30, 40, 50 };
		int[] expectedOutput4 = { 10, 20, 30, 40, 50 };
		testSorting(input4, expectedOutput4);

		// Test Case 5
		int[] input5 = { -5, 0, 15, -10, 7 };
		int[] expectedOutput5 = { -10, -5, 0, 7, 15 };
		testSorting(input5, expectedOutput5);

		// Test Case 6
		int[] input6 = { 5 };
		int[] expectedOutput6 = { 5 };
		testSorting(input6, expectedOutput6);

		// Test Case 7
		int[] input7 = {};
		int[] expectedOutput7 = {};
		testSorting(input7, expectedOutput7);

		// Test Case 8
		int[] input8 = { 10, 10, 10, 10 };
		int[] expectedOutput8 = { 10, 10, 10, 10 };
		testSorting(input8, expectedOutput8);
	}

	private static void testSorting(int[] input, int[] expectedOutput) {
		int[] sortedArray = Arrays.copyOf(input, input.length);
		Arrays.sort(sortedArray);
		if (Arrays.equals(sortedArray, expectedOutput)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
	}
}
