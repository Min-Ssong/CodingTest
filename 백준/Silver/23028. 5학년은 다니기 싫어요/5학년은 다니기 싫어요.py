N, A, B = map(int, input().split(' '))
subs = []
for i in range(0, 10):
  subs.append(input())  

count = 8 - N
if A >= 66 and B >= 130:
  print("Nice")
else:
  for i in range(0, count):
    X = int(subs[i].split(' ')[0])
    Y = int(subs[i].split(' ')[1])
    A += X * 3
    B += X * 3
    score = 6 - X
    if score <= Y:
      B += score * 3
    else:
      B += Y * 3
    score = 6

  if A >= 66 and B >= 130:
    print("Nice")
  else:
    print("Nae ga wae")