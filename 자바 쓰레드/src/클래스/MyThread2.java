package Ŭ����;

import java.util.Scanner;

public class MyThread2 implements Runnable {

	String str[]; // ���ڿ� �޾ƿ���
	int a; // ���� �ð� �޾ƿ���
	public MyThread2() {
		
		
	}
	
	
	public void run() {
		for( int i = 0 ; i<100 ; i++)
		{
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

