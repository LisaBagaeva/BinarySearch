public class BinarySearch {

	public static Integer search(Integer[] sequance, Integer key) {

		InsertionSort.sort(sequance);
		int n = sequance.length;
		int lb = 0;
		int ub = n - 1;

		while (ub - lb != 1) {
			if (sequance[(ub + lb) / 2] == key)
				return (ub + lb) / 2;
			if (sequance[lb] == key)
				return lb;
			if (sequance[ub] == key)
				return ub;
			if (sequance[(ub + lb) / 2] > key)
				ub = (ub + lb) / 2;
			else
				lb = (ub + lb) / 2;
		}

		if (sequance[lb] == key)
			return lb;
		if (sequance[ub] == key)
			return ub;
		return -1;
	}

	public static void main(String[] argc) {
		Integer[] seq = { 4, 3, 6, 1, 7, 8, 1, 11, 9, 0 };
		int key = 7;

		System.out.println("Index = " + BinarySearch.search(seq, key));
		for (int i = 0; i < seq.length; i++)
			System.out.print(seq[i] + " ");
	}
}