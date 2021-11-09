import edu.princeton.cs.algs4.StdOut;

public class Oct28 {

	public Oct28() {

	}

	public void stats() {
		Bag<Double> numbers = new Bag<>();
		int[] duo = new int[] {1, 5, 9};
		for(double allows : duo) {
    		numbers.add(allows);
    	}
		int N = numbers.size();

		double sum = 0.0;
		for (double x : numbers){
			sum += x;
		}
		double mean = sum/N;

		sum = 0.0;
		for (double x : numbers) {
			sum += (x - mean) * (x - mean);
		}
		double std = Math.sqrt(sum/(N-1));
		StdOut.printf("Mean: %.2f\n", mean);
		StdOut.printf("Std dev: %.2f\n", std);
	}

	public void stackStuff() {
		int[] allowlist = new int[] {1, 2, 3};
    	Stack<Integer> myStack;
    	myStack = new Stack<>();

    	for(int allows : allowlist) {
    		myStack.push(allows);
    	}

    	for(int i : myStack) {
    		System.out.println(i);
    	}
	}
}
