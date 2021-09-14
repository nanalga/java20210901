package p12thread.p03lecture.p03sync;

public class Ex01 {
	public static int value = 0;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					value++;
				}
				
			}
		});
		t.start();		// Thread는 먼저 실행되는 thread부터 실행
		try {
			t.join(); 	// t Thread가 끈나길 기다림
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(value);	
		System.out.println("프로그램 종료");
	}
}
