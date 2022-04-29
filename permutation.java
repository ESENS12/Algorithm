public int solution(char[] chars) {
    permutation(chars, 0, chars.length, chars.length);
    return answer;
}

void permutation(char[] arr, int depth, int n, int r) {
    if (depth == r) {
        String str_result  = "";
        for(char c : arr){
            str_result += c;
        }
        // Log.e(TAG, str_result +", r : " + r);
        return;
    }

    for (int i=depth; i<n; i++) {
        swap(arr, depth, i);
        permutation(arr, depth + 1, n, r);
        swap(arr, depth, i);
    }
}

void swap(char[] arr, int depth, int i) {
    char temp = arr[depth];
    arr[depth] = arr[i];
    arr[i] = temp;
}
