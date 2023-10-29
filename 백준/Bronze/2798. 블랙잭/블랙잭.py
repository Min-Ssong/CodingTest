N, M = map(int, input().split(' '))
cards = list(map(int, input().split(' ')))
result = 0

for i in range(N):
  for j in range(i + 1, N):
    for k in range(j + 1, N):
      num = cards[i] + cards[j] + cards[k]
      
      if num > M:
        continue
      else:
        result = max(result, num)

print(result)