public class Oct29 {

	public Oct29() {

	}

	public void bagStuff() {
		int[] allowlist = new int[] {1, 2, 3};
    	Bag<Integer> myBag;
    	myBag = new Bag<>();

    	for(int allows : allowlist) {
    		myBag.add(allows);
    	}

    	for(int i : myBag) {
    		System.out.println(i);
    	}
	}

	public void queueStuff() {
		int[] allowlist2 = new int[] {1, 2, 3};
    	Queue<Integer> myQueue;
    	myQueue = new Queue<>();

    	for(int allows : allowlist2) {
    		myQueue.enqueue(allows);
    	}

    	for(int i : myQueue) {
    		System.out.println(i);
    	}
	}
}

