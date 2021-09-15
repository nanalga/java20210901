package p13generic.p01textbook.s130301;

public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	public void setKind(T Kind) {
		this.kind = kind;
	}
	
	public M getModel(){
		return this.model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
