package 클래스연습;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stun
		System.out.println("당신은 소환수를 고를수있습니다.");
		System.out.println("소환수는 총 3마리입니다.");
		System.out.println("소환수에 대한 설명을 들으시겠습니까?");
		System.out.println("1. 듣는다 / 2. 안듣겠다.");
		int Num = 0;
		Scanner scan = new Scanner(System.in);
		Scan input = new Scan();
	
		
		while(true)
		{
			try {
				Num = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
		
		if(Num == 1)
		{
			System.out.println("");
			System.out.println("1. 기사 : 칼을 사용하는 전형적인 기사 불속성 패시브로 체력이 증가한다.");
			System.out.println("         1차스킬 : 슬래시");
			System.out.println("         2차스킬 : 일검");
			System.out.println("2. 도적 : 삐에로형상의 도적 풍속성 패시브로 인하여 스킬데미지가 증가하며 "
									+   "나이프를 이용하여 싸우지만 스킬을 이용하여 카드로 적을 해치운다.");
			System.out.println("         1차스킬 : 카드날리기");
			System.out.println("         2차스킬 : 절단 마술");
			System.out.println("3. 궁수 : 활을 이용하여 적을 해치우는 궁수 불속성 패시브로 공격력이 증가한다 .");
			System.out.println("         1차스킬 : 더블샷");
			System.out.println("         2차스킬 : 마법화살");
			System.out.println("");
			break;
		}
		else if(Num == 2)
		{
			break;
		}
		else 
		{
		System.out.println("잘못누르셧습니다.");	
		}
		
		}
		
		

	
	
	
	
	}
	
		
		
	
	
	
	
	
	void Input(int i) {
		
	Scanner scan = new Scanner(System.in);

		try {
			i = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
	
	
		
		
	}
	}
	
