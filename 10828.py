'''
백준 알고리즘 10828 문제 풀이
작성자 ESENS
작성일 180328

정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
문제에 나와있지 않은 명령이 주어지는 경우는 없다.

입력:

14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top

------------------------------------------------------------------------------------

출력:

2
2
0
2
1
-1
0
1
-1
0
3
'''

stack = []

def push(i):
    global stack
    stack.append(i)
def top():
    global stack
    if stack.__len__() == 0:
        print(-1)
    else:
        print(stack[-1])
def size():
    global stack
    print(str(stack.__len__()))
def empty():
    global stack
    if stack.__len__() == 0:
        print(1)
    else:
        print(0)
def pop():
    global stack
    if stack.__len__() == 0:
        print(-1)
    else:
        var = stack[-1]
        stack = stack[:-1]
        print(var)

count = int(input())

for i in range(0, count):
    order = input()
    if "push" in order:
        value = order.split()
        push(int(value[1]))
    elif "top" == order:
        top()
    elif "pop" == order:
        pop()
    elif "empty" == order:
        empty()
    elif "size" == order:
        size()
    else:
        break









