'''
코딜리티 PermCheck 문제 풀이
작성자 ESENS
작성일 180628

'''

def solution(A):

    # 정렬된 값의 시작이 1 이고 끝이 사이즈와 같을때 순열임
    # 하지만 배열에 중복이 허용되므로 중복을 체크하거나, 다른 방식을 사용(증가값 확인)

    A.sort()
    check = list(set(A))

    # 중복이 있는 경우 순열이 아님
    if len(A) != len(check):
        return 0

    #시작이 1이 아니면 순열이 아님
    if A[0] != 1:
        return 0

    #정렬된 배열의 마지막 값과 배열의 사이즈가 다르면 순열이 아님
    if A[-1] != len(A):
        return 0

    return 1

    # 증가값을 확인하는 풀이법 (시간복잡도가 O**log(n) 인 경우가 있어 사용하지 않음)
    '''    
    for i in range(0, len(A)-1):
        if A[i]+1 != A[i+1]:
            return 0
    return 1
    '''