// 문제출처 X (스카이 콩콩..)

//steps를 remain의 횟수 안에 stepSize로 갈 수 있는지
private boolean isAbleTogo(int stepSize, int remain, int[] steps ){
    int before_steps = 0;
    boolean bIsSuccess = false;
    int before_idx = 0;
    int current_idx = 1;

    while(true){

        before_steps = steps[before_idx];

        if(remain == 0){
            break;
        }

        if(current_idx == steps.length-1 && before_steps + stepSize >= steps[current_idx]){
            bIsSuccess = true;
            break;
        }

        int current_steps = steps[current_idx];

        if(before_steps + stepSize > current_steps){
            current_idx+=1;
        }else if(before_steps + stepSize == current_steps){
            // 반드시 다른수 이며 오름차순 정렬이 되어있으므로 현재값이 같다면 오를수있는 최대값.
            before_idx = current_idx;
            current_idx+=1;
            remain--;
        }else{
            break;
        }

    }
    return bIsSuccess;
}
