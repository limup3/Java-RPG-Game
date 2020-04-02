package 자바3주차;

import java.util.Scanner;

public class 별그리기1 {

	public static void main(String[] args) {

		int num = 1;
		
		num+=3;
		
		for(int i = 0; i<num ; i++) // 머리
		{
			for(int j = num+2; j>i ; j--)
			{
				System.out.print(" ");
			}
			for(int k = 0; k<i ; k++)
			{
				System.out.print("a");
			}
			for(int p = 0; p<i ; p++)
			{
				System.out.print("a");
			}
			System.out.println("a"); // 머리
		}
		num+=2;

		for(int q = 0 ; q<num ; q++) //몸통
		{

			if(q == num-2)
			{

				break;
			}
		
			for(int w = 0 ; w<q ; w++)
			{
				System.out.print(" ");
			}
			for(int e = num ; e>q ; e--)
			{
				System.out.print("a");
			}
			for(int r = num ; r>q ; r--)
			{
				System.out.print("a");
			}
			for(int t = num ; t>q ; t--) //몸통
			{
				System.out.print("");
			}
			
		
			System.out.println("a");
		}

		num=0;
		num += 1;

	
		for(int a = 0 ; a<num+1 ; a++) //다리
		{

			for(int b = 0 ; b<num+1 ; b++)
			{
				System.out.print(" ");
			}
			for(int c = num+2 ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}

			for(int e = 0 ; e<a+1 ; e++)
			{
				System.out.print(" ");
			}
			for(int f = 0 ; f<a ; f++)
			{
				System.out.print(" ");
			}
			for(int g = num+2 ; g>a ; g--) 
			{
				System.out.print("a"); 			
			}
			
			
			System.out.println("");
		}
		for(int z = 0 ; z<1 ; z++) //다리 마지막부분
		{
			for(int x = 0 ; x<num ; x++)
			{
				System.out.print(" ");
			}
			for(int v = 0 ; v<1 ; v++)
			{
				System.out.print("a");
			}
			for(int Q = 0 ; Q<num+2 ; Q++)
			{
				System.out.print(" ");
			}
			for(int W = 0 ; W<num+2 ; W++)
			{
				System.out.print(" ");
			}

			System.out.print(" a");
		}
	}

}
