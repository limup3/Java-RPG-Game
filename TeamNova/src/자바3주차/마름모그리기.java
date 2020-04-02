package 자바3주차;

import java.util.Scanner;

public class 마름모그리기 {

	public static void main(String[] args) {

		
		for (int q = 0 ; q<3 ; q++)
		{
			for (int r = 0 ; r<=q ; r++)
			{
				System.out.print(" ");
			}
			for(int w = 2 ; w>q ; w--)
			{
				System.out.print(".");
			}
			for(int e = 2 ; e>q ; e--)
			{
				System.out.print(".");
			}
		
			System.out.println(".");
		}
		
/*		
		for(int w = 2 ; w>q ; w--)
		{
			System.out.print("w");
		}
		for(int e = 2 ; e>q ; e--)
		{
			System.out.print("e");
		}
*/		
		
/*		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.print("\ti");
			{
				for (int k = 0 ; k<i ; k++)
				{
					System.out.print("k");
				}
			}
			for (int j = 0 ; j<i ; j++)
			{
				System.out.print("j");
			}
			System.out.println();
		}
*/		
/*		for(int i = 2 ; i>0 ; i--)
		{
			System.out.print(" ");
			for (int j = i ; j<3 ; j++)
			{
				System.out.println(".");
			}
			System.out.println();
		}
*/
	
			}

}
