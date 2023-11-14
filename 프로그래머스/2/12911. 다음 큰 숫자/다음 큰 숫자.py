def solution(n):
    count = bin(n)[2:].count('1')
    num = n + 1
    while True:
        if count == bin(num)[2:].count('1'):
            return num
        num += 1
print(solution(99))