n,m,k = map(int,input().split())
arr = list(map(int,input().split()))
arr.sort(reverse=True)
a = arr[0]
b = arr[1]

res=0

while True:
  for i in range(k):
    if m ==0:
      break
    res += a
    m -= 1
  if m == 0:
    break
  res += b
  m -=1 

print(res)
