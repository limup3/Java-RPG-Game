package 자바3주차;

import java.util.Scanner;

public class 도형과제 {

	public static void main(String[] args) {

		System.out.println("마름모의 크기를 정수로 입력하세요 .");
		System.out.print("입력 : ");
		
		Scanner Rhombus_Scan = new Scanner(System.in);
		
		String Rhombus = Rhombus_Scan.nextLine();
		
		int Rhombus_Num = Integer.parseInt(Rhombus); //Rhombus = 마름모
		
		Rhombus_Num+=1; // 1일때 모양이 안나와서 2부터 시작
		
		for(int Tri = 0 ; Tri<Rhombus_Num ; Tri++) //마름모 삼각형 Triangle
		{
			for(int Tri_Blank = Rhombus_Num ; Tri_Blank>Tri ; Tri_Blank--) //Tri 중첩포문 공백으로 Num만큼 증가해서 -1씩 감소
			{
				System.out.print(" ");
			}
			
			for(int Tri_Dot = 0 ; Tri_Dot<Tri ; Tri_Dot++) // Tri 중첩포문 2번째줄부터 1개씩 Tri개수만큼 증가
			{
				System.out.print(".");
			}
			
			for(int Tri_Dot2 = 0 ;Tri_Dot2<Tri ; Tri_Dot2++) // Tri 중첩포문 2번째줄부터 1개씩 Tri개수만큼 증가
			{
				System.out.print(".");
			}
			System.out.println("."); // 줄 바뀔때마다 1개씩 증가
		}

		for (int Rev = 0 ; Rev<Rhombus_Num-1 ; Rev++) //마름모 역삼각형 Reverse Triangle
		{		System.out.print(" ");					//삼각형이 3개 나올때 역삼각형은 2개 나와야되므로 -1
		
			for (int Rev_Blank = 0 ; Rev_Blank<=Rev ; Rev_Blank++) // 중첩포문 줄바뀔때마다 공백 1개씩 증가
																															
			{
				System.out.print(" ");
			}
			for(int Rev_Dot = Rhombus_Num-2 ; Rev_Dot>Rev ; Rev_Dot--) // 점이 Num부터 Rev까지 1개씩 감소
			{
				System.out.print(".");
			}
			for(int Rev_Dot2 = Rhombus_Num-2 ; Rev_Dot2>Rev ; Rev_Dot2--) // 점이 Num부터 Rev까지 1개씩 감소
			{
				System.out.print(".");
			}
		
			System.out.println("."); //줄 바뀔때마다 1개씩 증가
		}


		System.out.println("별의 크기를 정수로 입력하세요 .");
		System.out.print("입력 : ");
		
		Scanner Star_Scan = new Scanner(System.in);
		
		String Star = Star_Scan.nextLine();
		
		int Star_Num = Integer.parseInt(Star); //Star = 별
	

		for(int Head=0; Head<Star_Num+3; Head++) //Star의 머리부분 Head (가로 3증가 , 세로 1감소)
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

		for(int Body = 0 ; Body<Star_Num+2 ; Body++) //몸통 (가로 6증가 세로 2 감소)
		{	
			
			for(int B_Blank = 0 ; B_Blank<Body+3 ; B_Blank++) //몸통의 공백 줄바뀔때마다 1칸씩 증가
			{
				System.out.print(" ");
			}
			for(int B_Four= 0; B_Four<Body; B_Four++) //4칸씩 출력 증가형태
			{
				if(Body!=0) //0을 제외하고 4칸씩 증가
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
			
			for(int L_Blank=0; L_Blank<1; L_Blank++) //공백을 Num숫자만큼 6증가 , 끝에서 2줄은 4씩증가
			{
				System.out.print("  ");
				
			}	
			for(int L_Blank2 =0 ; L_Blank2<Leg ; L_Blank2++) //Leg가 Star_Num보다 작거나같을때 6개증가
			{
				if(Leg<=Star_Num) 
				{
					System.out.print("      ");
				}
				
			}
			for(int L_Blank3 =0 ; L_Blank3<Star_Num ; L_Blank3++) //Leg가 Star_Num보다 클떄 6개증가
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
