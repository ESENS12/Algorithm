'''
백준 알고리즘 2455 문제 풀이
작성자 ESENS
작성일 180327

알고리즘 분류 : 시뮬레이션
지능형 기차
기차에 탄 사람과 내린 사람의 수가 주어질 때, 기차에 사람이 가장 많을 때의 사람 수를 계산하는 문제

기차는 역 번호 순서대로 운행한다.
출발역에서 내린 사람 수와 종착역에서 탄 사람 수는 0이다.
각 역에서 현재 기차에 있는 사람보다 더 많은 사람이 내리는 경우는 없다.
기차의 정원은 최대 10,000명이고, 정원을 초과하여 타는 경우는 없다.

내린 사람 수와 탄 사람 수 순서로 출발역 부터 종착역까지 순서대로 입력됨

입력:
0 32
3 13
28 25
39 0

------------------------------------------------------------------------------------

출력:
42

'''

index = 0
data = [[0]*2 for i in range(4)]
passanger = 0
max_pass = 0

#print(max_pass)
for i in range(4):
    string = input().split()
    data[i][0] = int(string[0])
    data[i][1] = int(string[1])

#print(data)

for i in range(4):
    add = data[i][1]
    mul = data[i][0]
    passanger = (passanger - mul) + add
    if max_pass < passanger:
        max_pass = passanger
print(max_pass)