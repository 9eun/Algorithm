n=int(input())
arr=[list(input().split()) for _ in range(2)]
arr.sort(key=lambda x:x[1])
for i in arr:
  print(i[0], end=' ')
