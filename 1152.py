#The Curious Case of Benjamin Button
'''
예제들..
유의사항 널체크, 공백만 있는경우, 공백이 없는경우, 단어가 하나만 들어왔을 때
3 : "   The Good day"
2 : "       what the   "
0 : "   "
4 : "hi my name gosu  "
4 : "   good day to die    "
3 : "nothing is important "
'''
import sys
sys.setrecursionlimit(1000001)
data = input()
separate = " "
count = 0
#널체크
if not data :
    print("0")
else:
    #문장 앞뒤 공백 제거
    data = data.strip()
    #만약 앞뒤 공백 제거 후 사이즈가 0 이면 공백만 있는 경우이므로
    if len(data) == 0 : print("0")
    else:
        # 공백이 아예 없을 때
        if separate not in data:
            print("1")

        else:
            #문장 사이에 공백이 있는 경우
            for i in range(0,len(data)):
                #i가 공백일 때
                if data[i] == separate:
                    #앞뒤가 공백이 아닌경우 카운트 증가
                    if i==0 and data[i+1] != separate : count +=1
                    if i>0 and data[i-1] != separate and data[i+1] != separate:
                        #print("found!")
                        count += 1
            if(count!=0): count += 1
            print(count)