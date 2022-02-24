'''

코딜리티 1번 문제 풀이
작성자 ESENS
작성일 180509


'''


def solution(N):
    return len(max(format(N, 'b').strip('0').split('1')))

print(solution(1041))