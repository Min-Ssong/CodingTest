n = int(input())
h = list(map(int, input().split()))

ans = 0
maxHill = 0
count = 0

for hill in h:
  if maxHill < hill:
    maxHill = hill
    count = 0
  else:
    count += 1
  ans = max(ans, count)
print(ans)