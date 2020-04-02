package 자바3주차;

import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			for(int H_two=0; H_two<Head ; H_two++)  // 첫부분을 제외하고 2개씩 증가
			{
				System.out.print("aa");
			}
			if(Head==0)	//꼭대기 하나 출력하기 위해서 if문 사용
			{
				System.out.print("a");
			}
			System.out.println("");
		}
	}

}
