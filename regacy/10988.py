'''
백준 알고리즘 10988 문제 풀이
작성자 ESENS
작성일 180628

팰린드롬인지 확인하기


입력:

level
------------------------------------------------------------------------------------



출력:

1
'''


origin_word = input()
origin_word = list(origin_word)
reverse_word = list(origin_word)
reverse_word.reverse()

if origin_word == reverse_word:
    print("1")
else:
    print("0")
