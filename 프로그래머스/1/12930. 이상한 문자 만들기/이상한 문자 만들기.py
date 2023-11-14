def solution(s):
    answer = []
    tempStr = s.split(" ")
    for str in tempStr:
        temp = ''
        for i in range(0, len(str)):
            if i % 2 == 0:
                temp += str[i].upper()
            else:
                temp += str[i].lower()
        answer.append(temp)
    return ' '.join(s for s in answer)