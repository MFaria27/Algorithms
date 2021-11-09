public class Oct26 {
	public int bSteps;
	public int rSteps;
	public Oct26 () {
		//ALGO 2223
		//October 26, 2021
		//3-7, 9, 25, 36-41, 47, 172-175
	}

	public int binarySearch (int key, int[] a){
        int low = 0;
        int high = a.length-1;
        while (low <= high){
        	bSteps++;
            int mid= low + (high-low)/2;
            if (key < a[mid]) high = mid - 1;
            else if (key > a[mid]) low = mid + 1;
            else return mid;
        }
        return -1;
    }

    public int recursiveBinarySearch (int key, int[] a){
        return recursiveBinarySearch(key, a, 0, a.length - 1);
    }

    public int recursiveBinarySearch (int key, int[] a, int low, int high){
        if (low > high) return -1;
        rSteps++;
        int mid = low + (high - low) / 2;
        if(key < a[mid]) return recursiveBinarySearch(key, a, low, mid -1);
        else if (key > a[mid]) return recursiveBinarySearch(key, a, mid + 1, high);
        else return mid;
    }

    //ThreeSum
    public int count(int[] a){
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                for (int k = j + 1; k < N; k++){
                    if (a[i] + a[j] + a[k] == 0) cnt++;
                }
            }
        }
        return cnt;
    }
}
