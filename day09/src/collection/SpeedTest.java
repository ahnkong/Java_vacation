package collection;

//ArrayList, hashSet 속도 비교!
// hashSet이 ArrayList보다 훨씬 빠르다.


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class SpeedTest {
	public static void main(String[] args) {
		
		final int SIZE = 10_000_000;							//r칸수지정
		final List<Integer> arrayList = new ArrayList<Integer>(SIZE);
		final Set<Integer> hashSet = new HashSet<Integer>(SIZE);
		final int DATA = 7_133_401;

		
		//------------람다식------------------
		IntStream.range(0, SIZE).forEach(value -> {
			arrayList.add(value);
			hashSet.add(value); //9_999_999까지
		}); //---------------------------

		Instant start = Instant.now();
		arrayList.contains(DATA);
		Instant end = Instant.now();
		long elapsedTime = Duration.between(start, end).toMillis();
		System.out.println("arrayList : " + elapsedTime * 0.1 + "초");

		start = Instant.now();
		hashSet.contains(DATA);
		end = Instant.now();
		elapsedTime = Duration.between(start, end).toMillis();
		System.out.println("hashSet : " + elapsedTime * 0.1 + "초");
	
	}
}
