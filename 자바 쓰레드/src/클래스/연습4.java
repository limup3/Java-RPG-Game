package Ŭ����;

import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread2 asd = new MyThread2();
		Thread r2 = new Thread(asd);
		r2.start();
		
		System.out.println("������������������������������������������");
		System.out.println("\t\t\t �����򸻣�");
		System.out.println("");
		System.out.println("1. ����â���� ��ȯ���� ���¸� Ȯ���� �� �ֽ��ϴ�.");
		System.out.println("");
		System.out.println("2. ���������� �������� ȹ���� ��带 �̿��Ͽ� ����� ���� �����Ҽ��ֽ��ϴ�.");
		System.out.println("");
		System.out.println("3. ���������� �Ƿε��� ȸ�� �Ҽ��ֽ��ϴ�.");
		System.out.println("      �Ƿε��� 100�� ������� �й��ϰԵǴ� �����ϼ��� !!");
		System.out.println("");
		System.out.println("4. ����غ� �������� ������ž ���������� ���ø� �˴ϴ�.");
		System.out.println("������������������������������������������");

		r2.interrupt();
		System.out.println("����");
		
}
}