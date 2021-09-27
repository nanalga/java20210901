package p13generic.p03lecture.p03wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Ex05 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.addAll(Arrays.asList(3, 4, 5, 6));
		
		ArrayList<Double> arr2 = new ArrayList<Double>();
		arr2.addAll(Arrays.asList(3.3, 4.4, 5.5, 6.6));
		
		MyConsumer<Integer> con1 = new MyConsumer<>();
		MyConsumer<Double> con2 = new MyConsumer<>();
		
		MyConsumer<Number> con3 = new MyConsumer<>();
		
		arr1.forEach(con1);
		arr2.forEach(con2);

		arr1.forEach(con3);
		arr2.forEach(con3);
	}
}


class MyConsumer<T> implements Consumer<T> {
	@Override
	public void accept(T t) {
		System.out.println(t);
	}
}