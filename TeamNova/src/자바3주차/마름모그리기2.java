package 자바3주차;

public class 마름모그리기2 {

	public static void main(String[] args) {
/*		for(int i = 0 ; i<3 ; i++)
		{
			System.out.print(".");
			for(int j =0 ; j<i ; j++)
			{
				System.out.println("."); // 역삼각형
			}
		
		}
*/

/*		for(int i = 0 ; i<3 ; i++)
		{
			System.out.print(".");
			for(int j = 0 ; j<i ; j++)
			{
				System.out.print(".");
			}
			System.out.println(""); // 직삼각형
		}
*/
		for(int i = 0 ; i<4 ; i++)
		{
			System.out.print(" ");
			for(int j = 3 ; j>i ; j--)
			{
				System.out.print(".");
			}
			System.out.println(""); 
		}

		/*		int num = 4;
		for(int i = 0 ; i<num ; i++)
		{
			for(int k =num ; k>i; k--)
			{
				System.out.print(" ");
			}
			
			for(int p = 0 ; p<i ; p++)
			{
				System.out.print(".");
			}
			
			for(int j = 0 ;j<i ; j++)
			{
				System.out.print(".");
			}
			System.out.println(".");
		}

		for (int q = 0 ; q<num-1 ; q++)
		{		System.out.print(" ");
		
			for (int r = 0 ; r<=q ; r++)
			{
				System.out.print(" ");
			}
			for(int w = num-2 ; w>q ; w--)
			{
				System.out.print(".");
			}
			for(int e = num-2 ; e>q ; e--)
			{
				System.out.print(".");
			}
		
			System.out.println(".");
		}
*/
		
		/*
		
		for(int i = 0 ; i<1 ; i++)
		{		
			System.out.println("\t.");
			for (int j = 3 ; j>0 ; j= j-2)
			{
				
				System.out.println("...");
			}
			
		}
		
*/
	}

}
