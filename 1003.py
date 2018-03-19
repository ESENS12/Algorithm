'''
백준 알고리즘 1003번 문제 풀이
작성자 ESENS
작성일 180319
int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        return 0;
    } else if (n == 1) {
        printf("1");
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 구성되어있다.

첫째 줄에 N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.

입력
3
0
1
3

출력
1 0
0 1
1 2

'''
#dp = dict()

dp = [-1]*1000001
dp[0] = 0
dp[1] = 1

# fib(5)이면 1 1 2 3 5
# fib(10)이면 1 1 2 3 5 8 13 21 34 55

cnt_zero = 0
cnt_one = 0
cnt = [-1]*2

def fibonacci(n):
    global cnt_zero
    global cnt_one

    if dp[n] != -1:
        if dp[n] == 0 : cnt_zero += 1
        elif dp[n] == 1 : cnt_one += 1
        return dp[n]

    else:
        dp[n] = fibonacci(n - 2) + fibonacci(n - 1)
        return dp[n]

def basic_fibonacci(n):
    global cnt_zero
    global cnt_one

    if n == 0:
        cnt_zero += 1
        print("n is 0")
    elif n == 1:
        cnt_one += 1
        print("n is 1")
    else:
        return basic_fibonacci(n-2) + basic_fibonacci(n-1)

print(basic_fibonacci(6))
print(str(cnt_zero) +" "+str(cnt_one))
'''
case = int(input())

for i in range(0, case):
    num = int(input())
    fibonacci(num)
    print(str(cnt_zero) + " " + str(cnt_one))
    cnt_one = 0
    cnt_zero = 0

print(dp[:10])
'''


