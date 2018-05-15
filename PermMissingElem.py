'''
코딜리 PermMissingElem 문제 풀이
작성자 ESENS
작성일 180515


입력:


------------------------------------------------------------------------------------



출력:
'''

def solution(A):
    max = len(A) + 1
    num = 0
    for i in range(1, max):
        num = num + i
    num = num + max

    # max = A[0]
    sum = 0
    for i in A:
        sum += i
    return num - sum