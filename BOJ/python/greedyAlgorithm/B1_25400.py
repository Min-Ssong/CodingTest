import time
start_time = time.time()

# 문제
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
# 문제

end_time = time.time()
print("time_my:", end_time - start_time)