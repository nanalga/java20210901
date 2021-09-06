package p01review.p06class.p03lecture.p01static.p01textbook.exercises.p16.p20;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	//Account객체를 아이템으로 가질수 있음
	//참조타입이 아이템일 경우 null로 초기화됨
	private static Account[] acountArray = new Account[100];	
	//선생님 private static size = 0;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			
			int sectNum = scan.nextInt();
			
			if(sectNum == 1) {
				createAccount();
			} else if(sectNum == 2) {
				accountList();
			} else if(sectNum == 3) {
				deposit();
			} else if(sectNum == 4) {
				withdraw();
			} else if(sectNum == 5) {
//				run = false;
				System.exit(0);
//				System.out.println("종료되었습니다.");
			}
		}
	}
	
	//계좌생성
	private static void createAccount() {
		System.out.println("---------------------------");
		System.out.println("계좌생성");
		System.out.println("---------------------------");
		System.out.print("계좌번호 : ");
		String ano = scan.next();
					
		System.out.print("예금주 : ");
		String owner = scan.next();
		
		System.out.print("초기금액 : ");
		int balance = scan.nextInt();
		
		Account ac = new Account(ano, owner, balance);
		//선생님 accountArray[size] = ac;
		//선생님 size++;
		
		for(int i = 0; i <acountArray.length; i++) {
			if(acountArray[i] == null) {
				acountArray[i] = ac;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록 보기
	private static void accountList() {
		System.out.println("---------------------------");
		System.out.println("계좌목록");
		System.out.println("---------------------------");
		
		for(int i =0; i < acountArray.length; i++) {
			Account ac = acountArray[i];
			if(ac != null) {
				System.out.println(ac.getAno() + "\t" + ac.getOwner() + "\t" + ac.getBalance());
			}
		}
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("---------------------------");
		System.out.println("예금");
		System.out.println("---------------------------");
		System.out.print("계좌번호 : ");
		String ano = scan.next();
		
		System.out.print("예금액 : ");
		int balance = scan.nextInt();
		
		Account ac = new Account();
		ac = findAcount(ano);

		int addBalance = ac.getBalance() + balance;
		ac.setBalance(addBalance);
		
		System.out.println("결과 : 예금이 성공되었습니다.");
								
	}	
	//출금하기
	private static void withdraw() {
		System.out.println("---------------------------");
		System.out.println("출금");
		System.out.println("---------------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scan.next();
		
		System.out.print("출금액 : ");
		int balance = scan.nextInt();
		
		Account ac = new Account();
		ac = findAcount(ano);
		
		int minusBalance = ac.getBalance() - balance;
		ac.setBalance(minusBalance);
		
		System.out.println("결과 : 출금이 성공되었습니다.");
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 착기
	private static Account findAcount(String ano) {
		Account ac = new Account();
		for(int i = 0; i < acountArray.length; i++) {	//선생님 accountArray.length -> size.length
			if(acountArray[i].getAno().equals(ano)) {	//accountArray의 ano와 입력받은 ano비교 
				ac = acountArray[i];
				break;
			}
		}
		//System.out.println(ac.getAno());
		return ac;
	}
	
	
	

}
