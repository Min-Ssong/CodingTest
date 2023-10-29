N = int(input())
status = []
rank = [1 for i in range(N)]
for i in range(N):
	status.append(list(map(int, input().split(' '))))
	
for i in range(N):
	for j in range(N):
		if status[i][0] < status[j][0] and status[i][1] < status[j][1]:
			rank[i] += 1
			
print(' '.join(map(str, rank)))