package p12thread.p03lecture.p03sync;

public class Ex02 {
	public static int value = 0;
	
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					value++;
					// 1. value 읽기
					// 2. value 증가
					// 3. value 쓰기
				}
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();	// 같은 Thread를 2번 실행
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(value);
	}
}
