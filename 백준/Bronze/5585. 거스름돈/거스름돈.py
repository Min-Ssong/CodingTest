n = 1000 - int(input())
data = [500, 100, 50, 10, 5, 1]
count = 0
for i in data:
  count += n // i
  n = n % i
  
print(count)