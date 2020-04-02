package 자바4주차;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		NormalMonster normalMonster = new NormalMonster();//노말몬스터 클래스 불러오기
		Knight knight = new Knight(); // 기사 클래스 불러오기
		System.out.println("박쥐등장!!");

		
		System.out.println("");
		System.out.println("######################");
		System.out.println("1. 공격하기 / 2. 박쥐상태창");

		int Num3 = scan.nextInt();

		
		while(true) {
			if(Num3 == 1)
			{	System.out.println("");
				System.out.println("영웅의 공격입니다.");
				normalMonster.Attacked_Bat(knight.Attack());
				System.out.println("박쥐 체력 : "+normalMonster.Hp_Bat);
				//몬스터의 체력이 0보다 작거나 같은 경우
				
				if(normalMonster.Hp_Bat<=0)
				{	
					System.out.println("");
					System.out.println("박쥐가 죽었습니다.");
					System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
					knight.Gold+=normalMonster.Gold;
					break;
				}
				System.out.println("");
				System.out.println("박쥐의 공격입니다.");
				knight.Attacked(normalMonster.Attack());
				System.out.println(" 영웅체력 : "+knight.Hp);
				if(knight.Hp <=0)
				{	System.out.println("");
					System.out.println("영웅이 죽었습니다.");
					//영웅체력 1로 만든다.
					knight.Hp = 1;
					System.out.println("영웅이 체력 1로 부활하였습니다.");
					break;
				}
			}
			else if(Num3 ==2 )
			{
				System.out.println("박쥐스탯");
				normalMonster.Bat();
				System.out.println("1.뒤로가기");
				break;
				
			}
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
		}
	}

}
