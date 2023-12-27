n=int(input())
arr=[]
for _ in range(n):
  m=input().split()
  arr.append((m[0],int(m[1]),int(m[2]),int(m[3])))

res = sorted(arr,key=lambda x:(-x[1],x[2],-x[3],x[0]))
for r in res:
  print(r[0])