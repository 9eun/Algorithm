from itertools import combinations

n,m = map(int,input().split())
chicken=[]
house=[]

for i in range(n):
  arr = list(map(int,input().split()))
  for c in range(n):
    if arr[c]==1:
      house.append((i,c))
    elif arr[c]==2:
      chicken.append((i,c))
combv = list(combinations(chicken,m))
def sum(combv):
  result = 0
  for hx,hy in house:
    temp = 1e9
    for cx, cy in combv:
      temp = min(temp,abs(hx-cx)+abs(hy-cy))
    result+=temp
  return result

result = 1e9
for com in combv:
  result = min(result, sum(com))
print(result)