package 자바3주차;

public class 별다리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		for(int a = 0 ; a<num+4 ; a++) //다리
		{

			for(int b = num+4 ; b>a ; b--)
			{
				System.out.print(" ");
			}
			for(int c = num+4 ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			for(int c = num ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			

			for(int k=0; k<1; k++) //첫번째 공백표현
			{
				System.out.print("  ");
				
			}
			
			for(int j =0 ; j<a ; j++) //num숫자만큼 반복증가 ex) num이 1일때  2번째줄 한번반복, num 2일때 2,3번째줄 반복
			{
				if(a<=num) 
				{
					System.out.print("      ");
				}
				
			}
			for(int p =0 ; p<num ; p++) //끝에서 2번째줄부터 4증가
			{
				if(a>num)
				{
					System.out.print("      ");	
				}
				
			}
			
			for(int p = num+1 ; p<=a ; p++) //끝에서 2번째줄부터 4증가
			{
				System.out.print("    ");
			}
			

			for(int g = num+4 ; g>a ; g--) 
			{
				System.out.print("b"); 			
			}
			for(int c = num ; c>a ; c--) 
			{
				System.out.print("b"); 			
			}
			
			
			System.out.println("");
		}

		/*
		for(int a = 0 ; a<num+3 ; a++) //다리 0827 4시21분 수정전
		{

			for(int b = num+3 ; b>a ; b--)
			{
				System.out.print(" ");
			}
			for(int c = num+3 ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			for(int c = num ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			

			for(int e = 0 ; e<=a ; e++)
			{
				if(a==0)
				{
					System.out.print("  ");					
				}
				else if(a!=0)
				{
					System.out.print("    ");
				}
			}
			

			for(int g = num+3 ; g>a ; g--) 
			{
				System.out.print("b"); 			
			}
			for(int c = num ; c>a ; c--) 
			{
				System.out.print("b"); 			
			}
			
			
			System.out.println("");
		} */
		
/*		for(int z = 0 ; z<1 ; z++) //다리 마지막부분
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
		
		*/
	}

}
