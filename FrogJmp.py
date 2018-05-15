'''
코딜리티 알고리즘 문제 풀이
작성자 ESENS
작성일 180515


입력:
10

------------------------------------------------------------------------------------



출력:
'''


def solution(X, Y, D):
    if(not (X or Y or D)):
        return 0
    distance = D
    curr_pos = X
    final_pos = Y
    if int(final_pos-curr_pos) % distance != 0 :
        return int( (final_pos-curr_pos) / distance ) + 1
    else:
        return int( (final_pos-curr_pos) / distance)