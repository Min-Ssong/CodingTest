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