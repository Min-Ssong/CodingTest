N = int(input())
cards = list(map(int, input().split(' ')))

count = 0
i = 1

for card in cards:
  if card == i:
    i += 1
  else:
    count += 1

print(count)