package p08Interface.p01textbook.exercises.p04;

public class OracleDao implements DataAccessObject {
	@Override
	public void insert() {
		System.out.println("Oracle Db응 삽입");
	}
	@Override
	public void select() {
		System.out.println("Oracle Db에서 검색");
		
	}
	@Override
	public void update() {
		System.out.println("Oracle Db를 수정");
		
	}
	@Override
	public void delete() {
		System.out.println("Oracle Db에서 삭제");		
	}
}
