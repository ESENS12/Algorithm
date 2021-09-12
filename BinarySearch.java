int binarySearch1(int key, int low, int high) {
	int mid;

	if(low <= high) {
		mid = (low + high) / 2;

		if(key == arr[mid]) {
			return mid;
		} else if(key < arr[mid]) {
			return binarySearch1(key ,low, mid-1);  
		} else {
			return binarySearch1(key, mid+1, high); 
		}
	}

	return -1;
}
