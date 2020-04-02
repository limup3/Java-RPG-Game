package 자바3주차;

public class 별그리기완성본 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Star_Num = 2;
		
		for(int H_First=0; H_First<Star_Num+3; H_First++) //Star의 머리부분 Head_First
		{
			for(int H_Second=Star_Num+3; H_Second>H_First; H_Second--) //Head_First for문의 중첩포문 Head_Second
			{
				System.out.print("  ");
			}
			for(int i =0; i<1; i++)
			{
				System.out.print(" ");
			}
			for(int H_Third=0; H_Third<H_First; H_Third++) // Third
			{
				if(H_Third!=Star_Num+3)						// 중첩for문 Third가 Num+3이 아닐시 공백 출력 , 가로 +3 세로 -1을 표현하기위해 사용 (가로표현)
				System.out.print("  ");
			}
			for(int H_Four=Star_Num+3; H_Four>H_First; H_Four--) //Four
			{
				
				if(H_Four!=H_First+1)							// Four이 First+1이 아닐시 공백 출력 , 가로 +3 세로 -1을 표현하기위해 사용 (세로 표현)
				{
					System.out.print(" "); 
				}
			}
			for(int H_Five=0; H_Five<H_First ; H_Five++)  // Five
			{
				System.out.print("aa");
			}
			if(H_First==0)	//꼭대기 하나 출력하기 위해서 if문 사용
			{
				System.out.print("a");
			}
			System.out.println("");
		}

		for(int q = 0 ; q<Star_Num+2 ; q++) //몸통
		{	
			
			for(int w = 0 ; w<q+3 ; w++)
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
			for(int e = Star_Num+2; e>q ; e--)
			{
				System.out.print("aaaaaa");
								
			}

			System.out.println("");
	}
		
		for(int a = 0 ; a<Star_Num+4 ; a++) //다리
		{

			for(int b = Star_Num+4 ; b>a ; b--)
			{
				System.out.print(" ");
			}
			for(int c = Star_Num+4 ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			for(int c = Star_Num ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			

			for(int k=0; k<1; k++) //첫번째 공백표현
			{
				System.out.print("  ");
				
			}
			
			for(int j =0 ; j<a ; j++) //Star_Num숫자만큼 반복증가 ex) Star_Num이 1일때  2번째줄 한번반복, Star_Num 2일때 2,3번째줄 반복
			{
				if(a<=Star_Num) 
				{
					System.out.print("      ");
				}
				
			}
			for(int p =0 ; p<Star_Num ; p++) //끝에서 2번째줄부터 4증가
			{
				if(a>Star_Num)
				{
					System.out.print("      ");	
				}
				
			}
			
			for(int p = Star_Num+1 ; p<=a ; p++) //끝에서 2번째줄부터 4증가
			{
				System.out.print("    ");
			}
			

			for(int g = Star_Num+4 ; g>a ; g--) 
			{
				System.out.print("a"); 			
			}
			for(int c = Star_Num ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			
			
			System.out.println("");
		}
	}

}
