import java.util.Arrays;
import java.util.Random;
//import edu.princeton.cs.algs4.*;
import java.util.stream.IntStream;

//ALGO 2223
public class Runner
{
    public static void main(String[] args) {
        //october26();
        //october28();
        //october29();
    	//november1();
    	//november4();
    	//november5();
    	november8();
    	//november9();
    }

    public static void october26() {
    	Oct26 ice = new Oct26();
    	int[] arr = IntStream.generate(() -> new Random().nextInt(1000)).limit(1000).toArray();
    	int[] candidates = IntStream.generate(() -> new Random().nextInt(1000)).limit(5).toArray();

    	Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Starting Binary Search");
		for(int i : candidates) {
			if( ice.binarySearch(i, arr) == -1 )
				System.out.format( "int %d not found\n", i ) ;
			else
				System.out.format( "int %d found!!!\n", i ) ;
		}
		System.out.format( "steps %d in Binary Search\n", ice.bSteps) ;

		System.out.println("Starting Recursive Binary Search");
		for(int i : candidates) {
			if( ice.recursiveBinarySearch(i, arr) == -1 )
				System.out.format( "int %d not found\n", i ) ;
			else
				System.out.format( "int %d found!!!\n", i ) ;
		}
		System.out.format( "steps %d in Recursive Binary Search\n", ice.rSteps) ;

        System.out.println(ice.count(arr));
    }
    public static void october28() {
    	Oct28 ice = new Oct28();
    	ice.stats();
    	ice.stackStuff();
    }
    public static void october29() {
    	Oct29 ice = new Oct29();
    	ice.bagStuff();
    	ice.queueStuff();
    }
    public static void november1() {
    	Nov1 ice = new Nov1();
    	ice.tt();
    }
    public static void november4() {
    	Nov4 ice = new Nov4();
    	ice.linkedlists();
    }
    public static void november5() {
    	SortCompare ice = new SortCompare();
    	ice.sortCompare("Insertion", "Selection");
    }
    public static void november8() {
    	SortCompare ice = new SortCompare();
    	ice.sortCompare("Merge 1", "Merge 2");


    }
    public static void november9() {
    	Nov9 ice = new Nov9();
    	
    }
    
}
