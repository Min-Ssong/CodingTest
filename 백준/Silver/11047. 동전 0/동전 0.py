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