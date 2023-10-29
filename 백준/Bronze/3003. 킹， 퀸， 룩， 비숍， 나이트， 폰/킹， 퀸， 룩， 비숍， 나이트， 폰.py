chess = [1, 1, 2, 2, 2, 8]
haveChess = list(map(int, input().split(' ')))

for i in range(0, 6):
  print(chess[i] - haveChess[i], end = ' ')