/*
 5. Given an array A of size N, print the reverse of it.
Input: First line contains an integer denoting the test cases 'T'. T test cases follow.
Each test case contains two lines of input. First line contains N the size of the array A.
The second line contains the elements of the array.
Output: For each test case, in a new line, print the array in reverse order.
Example:
Input:
1
4
1 2 3 4
Output:
4 3 2 1
 * */
package Day1_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tCases=sc.nextInt();
		for(int i=0;i<tCases;i++) {
			int num = sc.nextInt();
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			for(int j=0;j<num;j++) {
				int n = sc.nextInt();
				a1.add(n);
			}
			Collections.sort(a1);
			for(int j=num-1;j>=0;j--) {
				System.out.print(a1.get(j)+" ");
			}
		}	
	}

}
