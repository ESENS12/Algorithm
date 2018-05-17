'''
백준 알고리즘 1003번 문제 풀이
작성자 ESENS
작성일 180319

동적 계획법

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 구성되어있다.

첫째 줄에 N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.


'''

#=============================================여기서부터 테스트코드!
#dp = dict()

dp = [-1]*1000001
dp[0] = 0
dp[1] = 1
dp[2] = 1

# fib(5)이면 1 1 2 3 5
# fib(10)이면 1 1 2 3 5 8 13 21 34 55

cnt_zero = 0
cnt_one = 0
cnt = [-1]*2

def fibonacci(n):

    if dp[n] != -1:
        return dp[n]
    else:
        dp[n] = fibonacci(n - 2) + fibonacci(n - 1)
        return dp[n]

def basic_fibonacci(n):
    global cnt_zero
    global cnt_one

    if n == 0:
        cnt_zero += 1
        #print("n is 0")
        return 1
    elif n == 1:
        cnt_one += 1
        #print("n is 1")
        return 1
    else:
        return basic_fibonacci(n-2) + basic_fibonacci(n-1)
#0과 1은 fib(n-2)와 fib(n-1)만큼 호출된다..!
# fib(10)이면 1 1 2 3 5 8 13 21 34 55

print(basic_fibonacci(2))
print(str(cnt_zero) +" "+str(cnt_one))
#=============================================여기까지 테스트 코드..피보나치 암산이 안돼서..

# 실제 정답 코드
# 0과 1의 개수를 세야 하는데 DP로 풀어야 초과가 안난다
# 문제 초과 시간이 조금 빡빡해서 그런지 한번 푼 피보나치 데이터를 각 입력값 마다 초기화 하면 시간초과가 남.. 걍 재활용 하면 통과
# N의 fib(0), fib(1)번 호출 횟수는 fib(n-1) , fib(n)번씩이다!
dp = [-1] * 100001
dp[0] = 0
dp[1] = 1


def fibonacci(n):
    if dp[n] != -1:
        return dp[n]
    else:
        dp[n] = fibonacci(n - 2) + fibonacci(n - 1)
        return dp[n]


case = int(input())

for i in range(0, case):
    num = int(input())
    fibonacci(num)
    if num == 1:
        print("0 1")
    elif num == 0:
        print("1 0")
    else:
        print(str(dp[num - 1]) + " " + str(dp[num]))


