import time
start_time = time.time()

##### 코드
N, K = map(int, input().split(' '))
count = 0
arr = []
for i in range(0, N):
  num = int(input())
  if K % num != K:
    arr.append(num)

arr.sort(reverse=True)

for i in arr:
  if K % i != K:
    count += K // i
    K = K % i
    
print(count)
##### 코드

end_time = time.time()
print("time_my:", end_time - start_time)