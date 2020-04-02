package 자바3주차;

public class 별그리기4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1; // 18 24 30 ... 증가

		for(int q = 0 ; q<num+2 ; q++) //몸통
		{	
			
			for(int w = 0 ; w<q ; w++)
			{
				System.out.print(" ");
			}
			for(int g= 0; g<q; g++)
			{
				if(q!=0) //가로 +3 세로 +2 출력
				{
					System.out.print("aaaa");	
				}
			}		
			for(int e = num+2; e>q ; e--)
			{
				System.out.print("aaaaaa");
								
			}

			System.out.println("");
	}
		for(int q = 0 ; q<num+1 ; q++) //몸통 뒤에부분
		{	
			
			for(int w = num ; w>q ; w--)
			{
				System.out.print(" ");
			}
			for(int g= num; g>q; g--)
			{
				if(q!=num)
				{
					System.out.print("aaaa");	
				}
				
			}		
			for(int e = 0; e<=q+1 ; e++)
			{
				System.out.print("aaaaaa");
								
			}

			System.out.println("");
	}
		
/*		
		for(int q = 0 ; q<num-3 ; q++) //몸통 // 횟수
		{	
	
			for(int w = num-2 ; w>q ; w--)
			{
				System.out.print("   ");
				
			}

			for(int e = 0; e<q+3 ; e++) //
			{
				System.out.print("a");
				
			}
			for(int r =0  ; r<q+3 ; r++)
			{
				System.out.print("a");
			}
			for(int e = 0; e<q+3 ; e++)
			{
				System.out.print("a");
				
			}
			for(int r = 0 ; r<q+3 ; r++)
			{
				System.out.print("a");
			}
			for(int e = 0; e<q+3 ; e++)
			{
				System.out.print("a");
				
			}
			for(int r = 0 ; r<q+3 ; r++)
			{
				System.out.print("a");
			}
			

			System.out.println("");
	}
	*/	
	
		/*		System.out.println("aaaaaaaaaaaaaaa");
		for (int q = 0; q<num ; q++)
	{
		for (int w= 0 ; w< )
	}
	*/
/*		for(int i = 0 ; i<num ; i++) //4개증가
	{

		
		for(int j = 0 ; j<=i ; j++)
		{
			System.out.print("j");
		}
		for(int k = 0 ; k<=i ; k++)
		{
			System.out.print("k");
		}
		for(int j = 0 ; j<=i ; j++)
		{
			System.out.print("a");
		}
		for(int k = 0 ; k<=i ; k++)
		{
			System.out.print("s");
		}
		System.out.println("");
	}
*/
	}
}
