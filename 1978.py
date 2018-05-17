'''
백준 알고리즘 1978 문제 풀이
작성자 ESENS
작성일 180517

주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.


입력:

4
1 3 5 7

------------------------------------------------------------------------------------
출력:

3

'''


sosu = 0
# 1보다 크면서, 1또는 자기자신외의 다른 수로 나눠떨어지지 않는 수
def findSosu(num):
    global sosu
    if num == 2:
        #print("sosu :" + str(num))
        sosu += 1
    elif not num <= 1:
        for i in range(2,num):
            if num % i == 0:
                return
        #print("sosu :" + str(num))
        sosu += 1

cnt = int(input())
val = input()
num = list()

for i in range(0, cnt):
    num.append(int(val.split()[i]))
    findSosu(num[i])
print(sosu)

