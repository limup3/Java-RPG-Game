package 클래스;

import java.util.Scanner;



public class Inn {

	Scanner scan = new Scanner(System.in);
	
	
	

	
	public void inn(Knight knight) {
		Media Town = new Media(); //음악쓰레드 객체생 test.setDaemon(true);

		
		
		System.out.println("");
		System.out.println(">>여관에 오신것을 환영합니다!!");
		System.out.println(">>여관에선 시험의 탑에서 쌓인 피로도를 회복할수있습니다.");
		System.out.println(">>골드를 내고 여관에서 휴식하시겠습니까?");
		System.out.println("");
		System.out.println("피로도 상태 :"+knight.Fatigue);
		System.out.println("");
		System.out.println("1. 예 / 2. 아니오");
		int Num8 = 0;
		try {	
			Num8 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if( Num8 ==1)
		{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
			knight.Gold-=10;
			knight.Fatigue=0;
			System.out.println("10골드를 내고 휴식을 취합니다.");
			System.out.println("현재 소지골드 : "+knight.Gold);
			System.out.println("현재 피로도    : "+knight.Fatigue);
			System.out.println("");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			try {
				Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/피로도회복.wav");
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
		}
		else if(Num8 == 2)
		{	
			System.out.println("마을로 돌아갑니다.");
			System.out.println();
			
		}
		
	}
		public void Arc_in(Archer archer) {
			Media Town = new Media(); //음악쓰레드 객체생 test.setDaemon(true);



			System.out.println("");
			System.out.println(">>여관에 오신것을 환영합니다!!");
			System.out.println(">>여관에선 시험의 탑에서 쌓인 피로도를 회복할수있습니다.");
			System.out.println(">>골드를 내고 여관에서 휴식하시겠습니까?");
			System.out.println("");
			System.out.println("피로도 상태 :"+archer.Fatigue);
			System.out.println("");
			System.out.println("1. 예 / 2. 아니오");
			int Num14 = 0;
			try {	
				Num14 = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
			if( Num14==1)
			{
				Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
			archer.Gold-=10;
			archer.Fatigue=0;
			System.out.println("10골드를 내고 휴식을 취합니다.");
			System.out.println("현재 소지골드 : "+archer.Gold);
			System.out.println("현재 피로도    : "+archer.Fatigue);
			System.out.println("");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			try {
				Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/피로도회복.wav");
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			}
		else if(Num14== 2)
		{
			System.out.println("마을로 돌아갑니다.");
			System.out.println();
		}
		}
	
		public void Thi_in(Thief thief) {
			Media Town = new Media(); //음악쓰레드 객체생 test.setDaemon(true);


		System.out.println("");
		System.out.println(">>여관에 오신것을 환영합니다!!");
		System.out.println(">>여관에선 시험의 탑에서 쌓인 피로도를 회복할수있습니다.");
		System.out.println(">>골드를 내고 여관에서 휴식하시겠습니까?");
		System.out.println("");
		System.out.println("피로도 상태 :"+thief.Fatigue);
		System.out.println("");
		System.out.println("1. 예 / 2. 아니오");
		int Num13 = 0;
		try {	
			Num13 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if( Num13==1)
		{
			Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
			thief.Gold-=10;
			thief.Fatigue=0;
			System.out.println("10골드를 내고 휴식을 취합니다.");
			System.out.println("현재 소지골드 : "+thief.Gold);
			System.out.println("현재 피로도    : "+thief.Fatigue);
			System.out.println("");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			try {
				Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/피로도회복.wav");
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			Town.Stop();
		}
		else if(Num13== 2)
		{
			System.out.println("마을로 돌아갑니다.");
			System.out.println();
		}
	}
}
