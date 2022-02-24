'''
코딜리티 CyclicRotation 문제 풀이
작성자 ESENS
작성일 180510

A 리스트에서 마지막 원소를 찾아서
K번 만큼 앞자리로 가져와 주면 됨
A = 1234 , K = 3 일때

step 1 = 4123
step 2 = 3412
step 3 = 2341

'''

def solution(A, K):
    for i in range(0,K):
        num = A.pop(-1)
        A.insert(0,num)
    return A
