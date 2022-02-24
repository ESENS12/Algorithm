'''
백준 알고리즘 2490 문제 풀이
작성자 ESENS
작성일 180404

도(배 한 개, 등 세 개), 개(배 두 개, 등 두 개), 걸(배 세 개, 등 한 개), 윷(배 네 개), 모(등 네 개) 중 어떤 것인지를 결정하는 프로그램을 작성하라.
도 = 3 , 개 = 2 , 걸 = 1 , 윷 = 0, 모 = 4
0이 배 , 1이 등

입력:

0 1 0 1
1 1 1 0
0 0 1 1

------------------------------------------------------------------------------------

출력:

B
A
B

'''

def count(data):
    zero_cnt = 0
    one_cnt = 0
    sum = 0
    data = data.split()

    for i in data:
        sum += int(i)
    if sum == 0 : print('D')
    elif sum == 1 : print('C')
    elif sum == 2: print('B')
    elif sum == 3: print('A')
    elif sum == 4: print('E')
    #print(sum)
    #switch ~ case added


for i in range(0,3):
    data = input()
    #print(data)
    count(data)

