'''
백준 알고리즘 2750 문제 풀이
작성자 ESENS
작성일 180406


N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
첫째 줄에 수의 개수 N(1<=N<=1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

입력:

5
5
2
3
4
1

------------------------------------------------------------------------------------

출력:

1
2
3
4
5

52341
23415
13425

'''

#num = int(input())
sort = []

# 병합 정렬(오름차순)
def merge(left, right):
    result = []

    while len(left) > 0 or len(right) > 0:
        if len(left) > 0 and len(right) > 0:
            if left[0] <= right[0]:
                result.append(left[0])
                left = left[1:]
            else:
                result.append(right[0])
                right = right[1:]

        elif len(left) > 0:
            result.append(left[0])
            left = left[1:]

        elif len(right) > 0:
            result.append(right[0])
            right = right[1:]

    return result


def merge_sort(sort):
    if len(sort) <= 1:
        return sort

    mid = int(len(sort) / 2)

    leftList = sort[:mid]
    rightList = sort[mid:]

    leftList = merge_sort(leftList)
    rightList = merge_sort(rightList)

    return merge(leftList, rightList)


# 버블정렬 ..(오름차순)
# 자기자신보다 큰 수를 만나면 switch
def bubble_sort(sort):
    print("bubble_sort start ------")
    sort = list(sort)
    temp = 0
    if sort.__len__() == 0: return -1
    for i in range(0, sort.__len__()):
        temp = sort[i]
        for j in range(0, sort.__len__() - 1):
            if sort[i] < sort[j]:
                temp = sort[j]
                sort[j] = sort[i]
                sort[i] = temp
    print(sort)
    print("bubble_sort end ------")
    #print_sorted(sort)


# 선택 정렬 ..(오름차순)
# 가장 작은 수의 인덱스를 기억했다가 switch
def select_sort(sort):
    print("select_sort start ------")
    sort = list(sort)
    temp = 0
    min = 0
    if sort.__len__() == 0: return -1

    for i in range(0, sort.__len__()-1):
        min = i
        for j in range(i+1, sort.__len__()):
            if sort[min] > sort[j]:
                min = j
        temp = sort[min]
        sort[min] = sort[i]
        sort[i] = temp

    print(sort)
    #print_sorted(sort)
    print("select_sort end ------")

def print_sorted(sort):
    for i in sort:
        print(i)

#for i in range(0, num):
#    #data = int(input())
#    data = [5,2,3,4,1]
#    sort.append(data)

sort = [5,2,3,4,1]
#print(sort)
#bubble_sort(sort)
#select_sort(sort)
print(merge_sort(sort))