/*
 * 
 2. Given two linked lists, your task is to complete the function makeUnion(),
that returns the union of two linked lists. This union should include all the
distinct elements only.Example 1:
Input:
L1 = 9->6->4->2->3->8
L2 = 1->2->8->6->2
Output: 1 2 3 4 6 8 9
 */
package Day1_Array_Difficult;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st list : ");
		int size = sc.nextInt();
		
		LinkedHashSet<Integer> list1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> list2 = new LinkedHashSet<Integer>();
		for(int i=0; i<size; i++) {
			list1.add(sc.nextInt());
		}
		System.out.println("Enter the size of 1st list : ");
		size = sc.nextInt();
		for(int i=0; i<size; i++) {
			list2.add(sc.nextInt());
		}
		
		LinkedHashSet<Integer> list3 = new LinkedHashSet<Integer>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);

	}

}
