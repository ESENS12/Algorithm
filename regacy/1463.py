'''
1로만들기

정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최소값을 출력하시오.

첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 자연수 N이 주어진다.
10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.


8 -> 4 -> 3 -> 1
3, 2 로 나누어 떨어지지 않으면 -1
나눠지면 나누고 아니면 다시 -1
반복


'''
import sys
sys.setrecursionlimit(1000002)
# 각 자리수를 -1로 초기화

#TODO 동적계획법 기초부터 풀기 !!

#dp = []
#10->9->3->1

def ass(n):
    global dp
    if dp[n] != -1:
        return dp[n]

    dp[n] = ass(n-1) + 1

    if n % 3 == 0:
        dp[n] = ass(n//3) + 1
    if n % 2 == 0:
        dp[n] = ass(n//2) + 1


    return dp[n]

k = int(input())

dp = [-1]*1000001
dp[1] = 0
dp[2] = 1
dp[3] = 1
#print(ass(k))
#print(dp[1:k-1])
step = 0

for i in range(k, 0, -1):
    if dp[k-1] != -1:
        dp[k-1] = min(dp[k-1],step+1)

    else:
        dp[k-1] = step+1

    if k % 3 == 0:
        if dp[k//3] != -1:
            dp[k//3] = min(dp[k//3],step+1)
        else:
            dp[k//3] = step+1
    if k % 2 == 0:
        if dp[k//2] != -1:
            dp[k//2] = min(dp[k//2],step+1)
        else:
            dp[k//2] = step+1
    #print(step)
    step += 1

print(dp[0:k])