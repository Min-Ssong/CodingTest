import time
start_time = time.time()

# 문제
n = 1000 - int(input())
data = [500, 100, 50, 10, 5, 1]
count = 0
for i in data:
  count += n // i
  n = n % i
  
print(count)
# 문제

end_time = time.time()
print("time_my:", end_time - start_time)