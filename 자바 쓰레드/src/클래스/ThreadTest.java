package 클래스;

public class ThreadTest {
	
	public static void main(String[] args) {

		TestThread thread = new TestThread();
		thread.start();
		
		// 0.5초 후에 스레드를 종료
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.threadStop(true);
	}
}