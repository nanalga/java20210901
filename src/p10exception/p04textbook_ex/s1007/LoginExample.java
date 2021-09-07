package p10exception.p04textbook_ex.s1007;

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

	private static void login(String id, String password) throws NotExitIDException, NotExitPasswordException {
		//id가 "blue"가 아니라면 NotExitIDException 발생
		if(!id.equals("blue")) {
			throw new NotExitIDException(id + " 아이디가 존재하지 않습니다.");
		}
		if(!password.equals("12345")) {
			throw new NotExitPasswordException("패스워드가 틀립니다.");
		}
	}
}
