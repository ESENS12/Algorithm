# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean

# quest url : https://level.goorm.io/exam/88520/%EB%86%80%EC%9D%B4%EA%B3%B5%EC%9B%90/quiz/1
# 첫줄이 테스트 케이스 갯수
testCaseNum = int(input())
answer = []

for _ in range(testCaseNum):
    n, k = map(int, input().split())
    matrix = []
    for _ in range(n):
        str_split = input().split()
        print(list(map(int, str_split)))
        matrix.append(list(map(int, str_split)))
        
    result = []
    print(matrix)
    for y in range(n-k+1):
        for x in range(n-k+1):
            result.append(sum(sum([row[x:x+k] for row in matrix[y:y+k]], [])))

    answer.append(min(result))
    
for a in answer:
    print(a)
