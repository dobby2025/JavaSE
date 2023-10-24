package section17;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}


class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
	
}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}


public class Lambda05 {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(32, 12, 45, 67, 89);
		
		numbers.stream()
			.filter(new EvenNumberPredicate())
			.map(new NumberSquareMapper())
			.forEach(new SystemOutConsumer());
		
		numbers.stream()
			.filter(n -> n % 2 == 0)
			.map(n -> n * n)
			.forEach(System.out::println);
	}
}





