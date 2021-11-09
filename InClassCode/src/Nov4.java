public class Nov4 {

	public Nov4() {

	}

	public void linkedlists () {
		LinkedListStack<String> myStack = new LinkedListStack<>();
		myStack.push("Hello");
		myStack.push("There");
		myStack.push("Class");
		System.out.println("Done");

		LinkedListQueue<String> myQueue = new LinkedListQueue<>();
		myQueue.enqueue("Hello");
		myQueue.enqueue("There");
		myQueue.enqueue("Class");
		System.out.println("Done");

		LinkedListBag<String> myBag = new LinkedListBag<>();
		myBag.add("Hello");
		myBag.add("There");
		myBag.add("Class");
		System.out.println("Done");
	}
}
