package forEachLoop;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String [] cars= {"BMW","Audi","Ferrari"};
//		for( int i=0;i<cars.length;i++) {
//			System.out.println(cars[i]);
//		}
		for(String car: cars) {
			System.out.println(car);
			ArrayList<Integer> numbers= new ArrayList<Integer>();
			numbers.add(9);
			numbers.add(8);
			numbers.add(0);
			numbers.add(3);
			for(int num: numbers) {
			System.out.println(num);
			}
		}
	}
}
