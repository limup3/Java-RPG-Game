package 클래스;

import java.util.Scanner;

public class MyThread2 implements Runnable {

	String str[]; // 문자열 받아오기
	int a; // 슬립 시간 받아오기
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

