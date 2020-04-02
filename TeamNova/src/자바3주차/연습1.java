package 자바3주차;

import java.util.Scanner;

public class 연습1 {

	public static void main(String[] args) {
	
		System.out.println("별의 크기를 정수로 입력하세요 .");
		System.out.print("입력 : ");
		
		Scanner Star_Scan = new Scanner(System.in);
		
		String Star = Star_Scan.nextLine();
		
		int Star_Num = Integer.parseInt(Star); //Star = 별
	

		for(int Head=0; Head<Star_Num+3; Head++) //Star의 머리부분 Head
		{
			for(int H_Blank=Star_Num+3; H_Blank>Head; H_Blank--) //공백 Num+3부터 Head까지 2칸씩 감소 줄바뀔수록 회전수 감소
			{
				System.out.print("  ");
			}
			for(int H_Blank2 =0; H_Blank2<1; H_Blank2++) // 공백 1칸씩증가 1회전 (아래 몸통과 균형 맞추기위해 사용)
			{
				System.out.print(" ");
			}
			for(int H_Blank3=0; H_Blank3<Head; H_Blank3++) // 0부터 Head만큼 회전하여 2칸씩 증가
			{
				System.out.print("  ");
			}
			for(int H_Blank4=Star_Num+3; H_Blank4>Head; H_Blank4--) //Four
			{		
				if(H_Blank4!=Head+1) // 마지막부분 빼고 Num+3부터 Head만큼 회전하여 1칸씩 감소
				{
					System.out.print(" "); 
				}
			}
			for(int H_Two=0; H_Two<Head ; H_Two++)  // 첫부분을 제외하고 2개씩 증가
			{
				System.out.print("aa");
			}
			if(Head==0)	//꼭대기 하나 출력하기 위해서 if문 사용
			{
				System.out.print("a");
			}
			System.out.println("");
		}

		for(int Body = 0 ; Body<Star_Num+2 ; Body++) //몸통
		{	
			
			for(int B_Blank = 0 ; B_Blank<Body+3 ; B_Blank++) //몸통의 공백 줄바뀔때마다 1칸씩 증가
			{
				System.out.print(" ");
			}
			for(int B_Four= 0; B_Four<Body; B_Four++) //4칸씩 출력 증가형태
			{
				if(Body!=0) //가로 +3 세로 +2 출력
				{
					System.out.print("aaaa");	
				}
			}		
			for(int B_Six = Star_Num+2; B_Six>Body ; B_Six--) //6칸씩출력 감소형태
			{
				System.out.print("aaaaaa");
								
			}

			System.out.println("");
		}
		
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
			

			for(int L_Right = Star_Num+4 ; L_Right>Leg ; L_Right--) //오른쪽다리
			{
				System.out.print("a"); 			
			}
			for(int L_Right2 = Star_Num ; L_Right2>Leg ; L_Right2--) //오른쪽다리2
			{
				System.out.print("a"); 			
			}
			
			
			System.out.println("");
		}
	}

}
