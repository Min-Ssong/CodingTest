import time

start_time = time.time()

# 문제
n = int(input())
road = list(map(int, input().split()))
oil = list(map(int, input().split()))

resultPrice = 0
minPrice = oil[0]
for i in range(n - 1):
  if oil[i] < minPrice:
    minPrice = oil[i]
  resultPrice += minPrice * road[i]

print(resultPrice)
# 문제

end_time = time.time()
print("time_my:", end_time - start_time)
