'''
코딜리티 알고리즘 문제 풀이
작성자 ESENS
작성일 180628

'''


def solution(X, A):

# 1부터 x위치까지 모두 나타난 배열의 인덱스 (if x = 5 -> a[i] 가 1,2,3,4,5 모두를 가졌을 때 의 i를 return
# 만약 x위치를 갖지 않으면 -1 을 리턴

    if not A:
        return -1
    if not X:
        return -1

    res = list()

    for i in range(1, X+1):
        res.append(i)

    res = set(res)
    #print(res)
    for i in A:
        if i in res:
            res.remove(i)
        if not res:
            return A.index(i)
    return -1


#print(solution(5,[1,3,2,2,4,6,4,1,5,6,7,5,2,5]))
