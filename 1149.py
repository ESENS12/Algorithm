'''
백준 알고리즘 1149 문제 풀이
작성자 ESENS
작성일 180509


RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다.
집 i의 이웃은 집 i-1과 집 i+1이다. 처음 집과 마지막 집은 이웃이 아니다.
각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때,
모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다.
둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다.
비용은 1,000보다 작거나 같은 자연수이다.


입력:

3
26 40 83
49 60 57
13 89 99


------------------------------------------------------------------------------------

출력:

96

현재 집에서 i를 골랐을때 i를 제외한 나머지에서 가장 작은값을 골라야 한다.

'''


def my_mini(num1, num2):
    if num1 >= num2:
        return num2
    if num2 >= num1:
        return num1
    else:
        return num1

k = int(input())

charge = [[0]*3 for i in range(k)]
dp = [[0]*3 for j in range(3)]

for i in range(0, k):
    string = input().split()
    charge[i][0] = int(string[0])
    charge[i][1] = int(string[1])
    charge[i][2] = int(string[2])

#print(charge)


# 뒤에서부터 시작해서 하나씩 골랐을때 이전 집의 선택지 를 고른다
# charge[2][i] = min(charge[1][i-1], charge[1][i+1])
#charge = [[26, 40, 80], [49, 60, 57], [13, 89, 99]]

dp[0][0] = charge[0][0]
dp[0][1] = charge[0][1]
dp[0][2] = charge[0][2]

for i in range(1, k):
    #런타임 에러 발생.. 원인 불명..
    dp[i][0] = my_mini(dp[i-1][1], dp[i-1][2]) + charge[i][0]
    dp[i][1] = my_mini(dp[i-1][0], dp[i-1][2]) + charge[i][1]
    dp[i][2] = my_mini(dp[i-1][0], dp[i-1][1]) + charge[i][2]

res = min(dp[2])

print(res)
