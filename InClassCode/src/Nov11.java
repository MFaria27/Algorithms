import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Transaction;

public class Nov11 {
	public Nov11 () {
		
	}
	
	public void TopM(int size) {
		try {
			int M = size;
			File f = new File("tinyBatch.txt");
			Scanner sc = new Scanner(f);
			MinPQ<Transaction> pq = new MinPQ<Transaction>(M+1);
			while (sc.hasNextLine()) {
				pq.insert(new Transaction(sc.nextLine()));
				if (pq.size() > M) pq.delMin();
			}
			Stack<Transaction> stack = new Stack<Transaction>();
			while (!pq.isEmpty()) {
				Transaction t = pq.delMin();
				stack.push(t);
			}
			for (Transaction t : stack) System.out.println(t);
		} catch (FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
	
	public void heapSort(Comparable[] a) {
		int N = a.length-1;
		for (int k = N/2; k >= 1; k--)
			sink(a, k, N);
		while(N > 1) {
			exch(a, 1, N--);
			sink(a, 1, N);
		}
	}
	
	private void sink(Comparable[] a, int k, int N) {
		while (2*k <= N) {
			int j = 2*k;
			if(j < N && less(a, j, j+1)) j++;
			if(!less(a, k, j)) break;
			exch(a, k, j);
			k = j;
		}
	}
	
	private static boolean less(Comparable[] a, int i, int j) {
		return a[i].compareTo(a[j]) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public void show(Comparable[] a) {
		for (Comparable element : a)
			StdOut.print(element + " ");
		StdOut.println();
	}

	private boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a, i, i-1)) return false;
		}
		return true;
	}
	
	// https://stackoverflow.com/a/52437408
	public <T> T[] add2BeginningOfArray(T[] elements, T element) {
		T[] newArray = Arrays.copyOf(elements, elements.length + 1);
		newArray[0] = element;
		System.arraycopy(elements, 0, newArray, 1, elements.length);
		return newArray;
		}
	
	
}
