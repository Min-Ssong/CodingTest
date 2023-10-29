N = int(input())
P = list(map(int, input().split()))
P.sort()
num = 0

for i in range(1, N + 1):
  num += sum(P[0:i])

print(num)