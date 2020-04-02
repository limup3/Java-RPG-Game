package 자바4주차;

import java.util.Scanner;

public class Skill {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		String RPG_GAME = scan.nextLine();
		
		int Num = Integer.parseInt(RPG_GAME); //RPG GAME 선택지 입력
		
		int Blank =0; //화면 넘기기
		
		System.out.println("프롤로그");
		System.out.println("------------------------------------------");
		System.out.println("당신은 이세계의 주인공입니다.");
		System.out.println("시험의 탑으로 가서 1층부터 최종보스까지 클리어하세요");
		System.out.println("자 그러면 시작합니다.");
		System.out.println("------------------------------------------");
		while(Blank<5)
		{
			Blank++;
			System.out.println("");
		}
		System.out.println("------------------------------------------");
		System.out.println("당신은 소환수를 고를수있습니다.");
		System.out.println("소환수는 총 3마리입니다.");
		System.out.println("소환수에 대한 설명을 들으시겠습니까?");
		System.out.println("1. 듣는다 / 2. 안듣겠다.");
		


		
		System.out.println("aa");

	}

}
