/**
 * Minimum Swaps 2
Problem Description

Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)]. It is allowed to swap any two elements (not necessarily consecutive).

Find the minimum number of swaps required to sort the array in ascending order.



Problem Constraints
1 <= N <= 100000
0 <= A[i] < N



Input Format
The only argument given is the integer array A.



Output Format
Return the minimum number of swaps.



Example Input
Input 1:

A = [1, 2, 3, 4, 0]
Input 2:

A = [2, 0, 1, 3]


Example Output
Output 1:

4
Output 2:

2


Example Explanation
Explanation 1:

 If you swap (1, 2) -> (2, 3) -> (4, 0) -> (3, 0). You will get a sorted array.
 You cannot sort it with lesser swaps.
Explanation 2:

 You cannot sort it with lesser than 2 swaps.
 */

package Sorting2;

class MinimumSwaps2 {
	public static int MOD = 1000000007;

	public int solve(int[] A) {
		int swap = 0;
		for (int i = 0; i < A.length; i++) {
			while (A[i] != i) {
				int tmp = A[i];
				int tmp2 = A[A[i]];
				A[i] = tmp2;
				A[tmp] = tmp;
				swap++;
			}
		}
		return swap;
	}

	public static void main(String[] args) {
		MinimumSwaps2 ms2 = new MinimumSwaps2();
		// int A[] = {7, 8, 6, 4, 6 };
		int A[] = { 1, 2, 3, 4, 0 };
		int x = ms2.solve(A);
		System.out.println(x);
	}
}
