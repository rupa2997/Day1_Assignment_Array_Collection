
/*
 4. Given an integer array A of size N, find the sum of elements in it.
Input: First line contains an integer denoting the test cases 'T'. T test cases follow.
Each test case contains two lines of input. First line contains N the size of the array A.
The second line contains the elements of the array.
Output: For each test case, print the sum of all elements of the array in separate lines.
 Example:Input:
2
3
3 2 1
4
1 2 3 4
Output:
6
10
 */
package Day1_Array;

import java.util.ArrayList;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tCases=sc.nextInt();
		for(int i=0;i<tCases;i++) {
			int num = sc.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<num;j++) {
				int n = sc.nextInt();
				a.add(n);
			}
			int sum=0;
			for(int j=0;j<num;j++) {
				sum+=a.get(j);
			}

			System.out.println(sum);
		}


	}

}
