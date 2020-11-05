package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] num=new int[100];
		int count=0;
		for(int i=0;;i++) {
			num[i]=scan.nextInt();
			if(num[i]==-1) {
				break;}
			count=i;
		}
		for(int i=2;i>=0;i--) {
			if((count-i)>=0)
			System.out.printf("%d ",num[count-i]);
		}
		scan.close();
	}
}
