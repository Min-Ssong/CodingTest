import time
start_time = time.time()

# 문제
N = int(input())
result = 0
for i in range(1, N + 1):
    tempNum = list(map(int, str(i)))
    result = i + sum(tempNum)
    if result == N:
        print(i)
        break

    if i == N:
        print("0")
	
# 문제

end_time = time.time()
print("time_my:", end_time - start_time)