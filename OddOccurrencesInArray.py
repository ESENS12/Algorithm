def solution(A):
    if not A:
        return 0
    for i in range(0,len(A)):
        if A.count(A[i]) % 2 != 0:
            return A[i]


'''
위에가 직접 코딩한 결과이지만
시간복잡도에서 점수가 많이 깎여서 60점대를 받음..
구글링 결과 가장 적합한 정답 코드 첨부

def solution(A):
    if not A:
        return 0
    result = 0
    for number in A:
        result ^= number
    return result
    
'''