def solution(arr):
    answer = []
    # [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    temp = arr[0]
    answer.append(arr[0])
    for i in arr:
        if(i != temp):
            temp = i
            answer.append(i)
        
    return answer