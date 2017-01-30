public class BinarySearch {

	public static Integer search(Integer[] sequance, Integer key) {
		int lb = 0;
		int ub = sequance.length - 1;
		int a;

		while (ub >= lb) {
			a = (ub - lb) / 2;
			if (sequance[a + lb] == key)
				return a + lb;
			if (sequance[a + lb] > key)
				ub = a + lb - 1;
			else
				lb = a + lb + 1;
		}

		return -1;
	}

	public static void main(String argv[]) {
		Integer key = 4;
		Integer[] seq = { 1, 2, 4, 40, 50, 60, 70 };
		System.out.println(BinarySearch.search(seq, key));
	}

}