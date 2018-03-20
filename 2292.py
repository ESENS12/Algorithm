'''

백준 알고리즘 1932 문제 풀이
작성자 ESENS
작성일 180320
6각형 모양의 벌집에서 주어진 n까지의 최소 이동 회수 찾기
1
7  = 1 + 6
19 = 7 + 6 + 6
37 = 19 + 6 + 6 + 6
61 = 37 + 6 + 6+ 6+ 6

'''
import sys
sys.setrecursionlimit(1000000001)
step = 0
data = int(input())
if(data == 1 ) : print(data)
else:
    max = 1
    cnt = 0
    while True:
        max = max + step
        step += 6
        cnt += 1
        #print(mydata)
        if(max>=data) :
            print(cnt)
            break





