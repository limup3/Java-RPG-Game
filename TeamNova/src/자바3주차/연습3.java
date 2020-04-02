package 자바3주차;

public class 연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Star_Num= 3;
		
		for(int Leg = 0 ; Leg<Star_Num+4 ; Leg++) //다리 Leg
		{

			for(int L_Blank = Star_Num+4 ; L_Blank>Leg ; L_Blank--) // 공백 1개씩 감소
			{
				System.out.print(" ");
			}

			for(int L_Left = Star_Num+4 ; L_Left>Leg ; L_Left--)  //Num+4부터 1개씩 감소
			{
				System.out.print("a"); 			
			}

			for(int L_Left2 = Star_Num ; L_Left2>Leg ; L_Left2--) //Num부터 1개씩감소 
			{
				System.out.print("a"); 			
			}
			
			for(int L_Blank=0; L_Blank<1; L_Blank++) //첫번째 공백표현
			{
				System.out.print("  ");
				
			}	
			for(int L_Blank2 =0 ; L_Blank2<Leg ; L_Blank2++) //Star_Num숫자만큼 반복증가                           ex) Star_Num이 1일때  2번째줄 한번반복, Star_Num 2일때 2,3번째줄 반복
			{
				if(Leg<=Star_Num) 
				{
					System.out.print("      ");
				}
				
			}
			for(int L_Blank3 =0 ; L_Blank3<Star_Num ; L_Blank3++) //끝에서 2번째줄부터 4증가
			{
				if(Leg>Star_Num)
				{
					System.out.print("      ");	
				}
				
			}		
			for(int L_Blank4 = Star_Num+1 ; L_Blank4<=Leg ; L_Blank4++) //끝에서 2번째줄부터 4증가
			{
				System.out.print("    ");
			}
			

			for(int L_Right = Star_Num+4 ; L_Right>Leg ; L_Right--) 
			{
				System.out.print("a"); 			
			}
			for(int L_Right2 = Star_Num ; L_Right2>Leg ; L_Right2--) 
			{
				System.out.print("a"); 			
			}
			
			
			System.out.println("");
		}
	}

	}

