/*
 1. Given a N x N matrix M. Write a program to find the count of all the
distinct elements common to all rows of the matrix. Print count of such
elements.
Example 1: Input: N = 4
M = {{2, 1, 4, 3},
 {1, 2, 3, 2},
 {3, 6, 2, 3},
 {5, 2, 5, 3}}
Output: 2
Explanation: Only 2 and 3 are common in all rows.
Example 2: Input: N = 5
M = {{12, 1, 14, 3, 16},
 {14, 2, 1, 3, 35},
 {14, 1, 14, 3, 11},
 {14, 5, 3, 2, 1},
 {1, 18, 3, 21, 14}}
Output: 3
Explanation: 14, 3 and 1 are common in all the rows.
  */
package Day1_Array_Difficult;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		ArrayList<Integer> M[] = new ArrayList[size];
		
		for(int i=0; i<size; i++) {
			M[i] = new ArrayList();
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.println("Enter element : "+(i+1)+(j+1)+" : ");
				M[i].add(sc.nextInt());
			}
		}
		
		HashSet<Integer> h = new HashSet<Integer>(M[0]);
		
		for(int i=1; i<size; i++) {
			h.retainAll(M[i]);
		}
		
	
		
		System.out.println(h.size());
		System.out.println(h);
		
	}

}
