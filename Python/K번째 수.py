def solution(array, commands):
    answer = []
    for i in commands:
        slicedArr = array[i[0]-1:i[1]]
        slicedArr.sort()
        answer.append(slicedArr[i[2]-1])

    return answer