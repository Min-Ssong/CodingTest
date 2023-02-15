import time
start_time = time.time()

# 문제
N = int(input())
P = list(map(int, input().split()))
P.sort()
num = 0

for i in range(1, N + 1):
  num += sum(P[0:i])

print(num)
# 문제

end_time = time.time()
print("time_my:", end_time - start_time)