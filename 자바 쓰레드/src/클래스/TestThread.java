package Ŭ����;

import java.util.Scanner;

class TestThread extends Thread{
	private boolean stop; // stop �÷���
	
	TestThread(){
		this.stop = false;
	}
	
	@Override
	public void run(){
		while(!stop){
			System.out.println("���� ����");
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("���� ����");
	}
	
	public void threadStop(boolean stop){
		this.stop = stop;
	}
}

