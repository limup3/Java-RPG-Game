package 클래스;

import java.util.Scanner;

public class 연습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread2 asd = new MyThread2();
		Thread r2 = new Thread(asd);
		r2.start();
		
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("\t\t\t ＠도움말＠");
		System.out.println("");
		System.out.println("1. 스탯창에선 소환수의 상태를 확인할 수 있습니다.");
		System.out.println("");
		System.out.println("2. 상점에서는 몬스터한테 획득한 골드를 이용하여 무기와 방어구를 구매할수있습니다.");
		System.out.println("");
		System.out.println("3. 여관에서는 피로도를 회복 할수있습니다.");
		System.out.println("      피로도가 100이 넘을경우 패배하게되니 주의하세요 !!");
		System.out.println("");
		System.out.println("4. 모든준비를 마쳤으면 시험의탑 다음층으로 가시면 됩니다.");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");

		r2.interrupt();
		System.out.println("멈춰");
		
}
}