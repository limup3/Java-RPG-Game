package Ŭ����;

public class ThreadTest {
	
	public static void main(String[] args) {

		TestThread thread = new TestThread();
		thread.start();
		
		// 0.5�� �Ŀ� �����带 ����
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.threadStop(true);
	}
}