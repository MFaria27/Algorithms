import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {

	public SortCompare() {

	}
	public void sortCompare(String alg1, String alg2) {
		int N = 1000;
		int T = 100;
		double t1 = timeRandomInput(alg1, N, T);
		double t2 = timeRandomInput(alg2, N, T);
		StdOut.printf("For %d random Doubles\n    %s is", N, alg1);
		StdOut.printf(" %.1f times faster than %s\n", t2/t1, alg2);
	}

	public double time(String alg, Comparable[] a) {
		Nov5 iceNov5 = new Nov5();
		Nov8 iceNov8 = new Nov8();
		Nov9 iceNov9 = new Nov9();
		Stopwatch timer = new Stopwatch();
		if (alg.equals("Insertion")) iceNov5.insertionSort(a);
		if (alg.equals("Selection")) iceNov5.selectionSort(a);
		if (alg.equals("Merge 1")) iceNov8.mergeSort1(a);
		if (alg.equals("Merge 2")) iceNov8.mergeSort2(a);
		if (alg.equals("Quick")) iceNov9.quickSort(a);
		return timer.elapsedTime();

	}

	public double timeRandomInput(String alg, int N, int T) {
		double total = 0.0;
		Double[] a = new Double[N];
		for (int t = 0; t < T; t++) {
			for (int i = 0; i < N; i++) {
				a[i] = StdRandom.uniform();
			}
			total += time(alg, a);
		}
		return total;
	}
}
