// basic combination 

void println(ArrayList<Integer> arr){
    String str_number = "";
    for(int n : arr){
        System.out.print(n);
    }
    System.out.println("");

}	

void combination(int[] arr, boolean[] visited, int start, int n, int r) {
    if (r == 0) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                numbers.add(arr[i]);
            }
        }
        println(numbers);
        return;
    }

    for (int i = start; i < n; i++) {
        visited[i] = true;
        combination(arr, visited, i + 1, n, r - 1);
        visited[i] = false;
    }
}