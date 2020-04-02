package 클래스;

import java.util.Scanner;

class TestThread extends Thread{
	private boolean stop; // stop 플래그
	
	TestThread(){
		this.stop = false;
	}
	
	@Override
	public void run(){
		while(!stop){
			System.out.println("무한 실행");
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("실행 종료");
	}
	
	public void threadStop(boolean stop){
		this.stop = stop;
	}
}

