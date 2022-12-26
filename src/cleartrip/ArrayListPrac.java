package cleartrip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<List>  aa =  new ArrayList<>();
		System.out.println("ENter number of test cases : " );
		int t= sc.nextInt();
		for(int i=0;i<t;i++) {
			ArrayList<Integer> k = new ArrayList<>();
			k.add(sc.nextInt());
			k.add(sc.nextInt());
			k.add(sc.nextInt());
			aa.add(k);
		}
		for(List l : aa) {
			
			int count = 0, res=0;
			if(c>d) {
			while(true) {
			if((res+c) == n || (c-d)==n) {
				System.out.println("Your work is finished in" + ++count + " days");
				break;
			}else {
				count++;
				res=(c-d)+res;
				System.out.println("Count is "+count + "Result is  "+res);
			}
			}
		}else {
			System.out.println("Work destruction is more than construction");
		}
		}
	}
}
