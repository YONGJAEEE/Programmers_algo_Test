def isEnd(list):
    temp = -1
    for i in list:
        if i == temp:
            return True
        else :
            temp = i
    return False

def solution(board, moves):
    answer = 0
    bucket = []
    
    for i in moves:
        for j in board:
            if j[i-1] != 0:
                bucket.append(j[i-1])
                j[i-1] = 0
                break
    while isEnd(bucket):
        temp = -1
        for i in range(0,len(bucket)):
            if(temp == bucket[i]):
                del bucket[i-1]
                del bucket[i-1]
                answer += 2
                break
            else:
                temp = bucket[i]
    return answer