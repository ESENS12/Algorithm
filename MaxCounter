## 코딜리티 문제풀이 MaxCounter
def solution(N, A):
    
    # N개의 카운터가 주어지고 정수로 이루어진 A배열이 주어짐.
    # A[K]가 N보다 작거나 같을 때 increase(N[A[K]])
    # 만약 A[K]가 N보다 클 경우 K는 max counter가 되므로 현재 counter중 가장 높은 max counter의 숫자로 모두 초기화 된다
    
    #list오브젝트로 생성하는것과 다른 방법으로 생성하는 경우, 묵시적 타입과 명시적 타입의 차이점 확인해보자
    counter = list()
    max = 0
    
    #결과값을 저장할 counter 배열 초기화
    #수정하고 싶다..for문,반복문 기초 다시 확인하자;;
    for i in range(0,N):
        counter.append(0)
        
    for i in A:
        if N < i:
            #print("max Counter")
            #Every Counter initialize to Max Counter
            for i in range(0,N):
                counter[i] = max
            #print("--end max Counter")
        # Condition 1<= X <= N
        elif i == 0:
            continue
        else:
            counter[i-1] = counter[i-1]+1
            if max < counter[i-1]:
                max = counter[i-1]
            #print(counter)
    return counter
    
    
 '''
 현재 시간복잡도는 O(n+m)으로
 max값 발생시 counter에 최대원소값을 덮어씌우는 과정에서 2중 For문으로 구현하였기 때문.
 최적 시간 복잡도는 O(N)이므로 중첩 for문 제거가 필요함.
 문제를 푸는 시간보다 문제를 읽는 시간이 더 오래 걸렸던 것 같다(독해력의 급격한 저하..........)
 '''
