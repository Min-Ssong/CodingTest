from itertools import combinations

def solution(number):
    answer = 0
    comb = list(combinations(number, 3))  # 중복되지 않은 조합 생성
    
    for num in comb:
        if sum(num) == 0:
            answer += 1
    return answer
