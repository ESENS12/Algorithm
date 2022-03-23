/**
 *  첫째 줄에 회의의 수 n(1<=n<=100,000)이 주어진다. 둘째 줄부터 n+1 줄까지 각 회의의 정보가 주어지는데
    이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다. 회의시간은 0시부터 시작한다.
    회의의 시작시간과 끝나는 시간의 조건은 (시작시간 <= 끝나는 시간)입니다.
    첫째 줄에 최대 사용할 수 있는 회의 수를 출력하여라.

    입력 
    5
    1 4
    2 3
    3 5
    4 6
    5 7

    출력
    3

 * 
 */

public int solution(String str1, String str2){
        
    int result = 0;
    int nNumberOfCandidate = 5;
    ArrayList<Reference> references = new ArrayList<>();
    references.add(new Reference(1,4));
    references.add(new Reference(5,7));
    references.add(new Reference(3,5));
    references.add(new Reference(4,6));
    references.add(new Reference(2,3));


    Collections.sort(references);
    int nMaxCnt = 0;
    for(int i=0; i<references.size(); i++){
        Reference target = references.get(i);
        int nTempCnt = 1; //하나는 잡고 시작하므로(target 부터 시작하므로 1부터 시작)
        for(int j=i+1; j<references.size(); j++){
            Reference temp = references.get(j);
            if(temp.nStartTime >= target.nEndTime){
                Log.e(TAG,"target : " + target.nStartTime + " ~ " + target.nEndTime);
                Log.e(TAG,"temp : " + temp.nStartTime + " ~ " + temp.nEndTime);
                nTempCnt++;
                target = temp;
            }
        }

        if(nMaxCnt < nTempCnt){
            nMaxCnt = nTempCnt;
        }
    }

    Log.e(TAG,"nMaxCnt = " + nMaxCnt);
    return result;
}

class Reference  implements Comparable<Reference>{
    public int nStartTime,nEndTime;


    Reference(int nStartTime, int nEndTime){
        this.nStartTime = nStartTime;
        this.nEndTime = nEndTime;
    }

    @Override
    public int compareTo(Reference reference) {
        //회의 시작시간을 기준으로 오름차순 정렬 ( - 로 리턴되면 오름차순 )
        return this.nStartTime - reference.nStartTime;
    }
}