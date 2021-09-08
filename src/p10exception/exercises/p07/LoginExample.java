package p10exception.exercises.p07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void login(String id, String password) throws NotExistIDException, WrongPassWordException {
		if(!id.equals("blue")) {
			throw new NotExistIDException("입력하신 "+id+"가 존재하지 않습니다.");
		}
		if(!password.equals("12345")) {
			throw new NotExistIDException("입력하신 비밀번호가 틀렸습니다.");
		}
	}

}
