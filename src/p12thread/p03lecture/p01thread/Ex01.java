package p12thread.p03lecture.p01thread;

public class Ex01 {
	public static void main(String[] args) {
		OtherThread t1 = new OtherThread();
		t1.start(); //실행해야 할 메소드, Thread에 start()메소드 상속, JVM이 실행
		
		System.out.println("program start");
		
		for(int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		
		System.out.println("program end");
		
	}
}

// Thread 클래스 활용
class OtherThread extends Thread {
	@Override
	public void run() {	// 사용자가 재정의 해야할 run()메소드
		System.out.println("other Thread start");
		
		for(int i = 10000_0000; i < 10001_0000; i++) {	// 10001_0000 "_"자리수 표현
			System.out.println(i);
		}
		System.out.println("other Thread end");
	}
}