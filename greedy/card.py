n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
res = 0
for i in arr:
  a = min(i)
  if a>res:
    res=a
print(res)
