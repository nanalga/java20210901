package p12thread.p03lecture.p03sync;

public class Ex03 {
	public static int v = 0;
	public static Object o = new Object();
	
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					synchronized(o) {	//공유되는 객체를 사용할때 해결 방법(*읽기 전용으로 권장) (thread를 획득하고 반납)
						v++;
					}
				}
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(v);
	}
}
