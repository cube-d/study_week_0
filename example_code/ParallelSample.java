
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ParallelSample {

	public static void main(String[] args) {

		List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);

		
		long strat = System.currentTimeMillis();
		
		result
			.parallelStream() // parallel  stream
			//.stream()  
			.peek(i -> {
					try {
						TimeUnit.SECONDS.sleep(4);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				})
			.reduce(0, (num1, num2) -> num1 + num2);

		long end = System.currentTimeMillis();
		
		
		System.out.println((end - strat));
	}

}
