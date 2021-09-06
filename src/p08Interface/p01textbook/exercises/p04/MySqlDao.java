package p08Interface.p01textbook.exercises.p04;

public class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("MySql Db를 검색");
	}
	@Override
	public void insert() {
		System.out.println("MySql Db를 삽입");		
	}
	@Override
	public void delete() {
		System.out.println("MySql Db에서 삭제");		
	}
	@Override
	public void update() {
		System.out.println("MySql Db에서 수정");		
	}
}
