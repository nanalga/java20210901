package p10exception.p04textbook_ex.p1005;

public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 열었습니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "를 닫습니다.");
	}

}
