n ,m = map(int,input().split())

graph = [list(map(int,input()))for _ in range(m)]

def dfs(x,y):
  if x<=-1 or x>=n or y<=-1 or y>=m:
    return False
  if graph[x][y]==0:
    graph[x][y]=1
    dfs(x-1,y)
    dfs(x+1,y)
    dfs(x,y-1)
    dfs(x,y+1)
    return True
  return False

res = 0
for i in range(n):
  for j in range(m):
    if dfs(i,j) == True:
      res+=1
print(res)
