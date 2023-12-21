import sys
input=sys.stdin.readline
dx = [-1,0,1,0]
dy = [0,1,0,-1]

def virus(x,y):
  for i in range(4):
    nx = x+dx[i]
    ny = y+dy[i] 
    if nx>=0 and ny>=0 and nx<n and ny<m:
      if temp[nx][ny] == 0:
        temp[nx][ny]=2
        virus(nx,ny)
def score():
  score = 0
  for c in temp:
    score+=c.count(0)
  return score

def dfs(count,start):
  global result
  if count == 3:
    for i in range(n):
      for j in range(m):
        temp[i][j] = arr[i][j]
    for i in range(n):
      for j in range(m):
        if temp[i][j]==2:
          virus(i,j)
    result = max(result,score())
    return
  for i in range(start, n * m):
    x, y = divmod(i, m)
    if arr[x][y] == 0:
        arr[x][y] = 1  # 벽을 세우기
        dfs(count + 1, i + 1)  # 다음 상태로 이동
        arr[x][y] = 0  # 백트래킹: 벽을 제거하여 이전 상태로 돌아감

        
n,m = map(int,input().split())
arr = [list(map(int,input().split()))for _ in range(n)]
temp=[[0]*m for _ in range(n)]

result = 0

dfs(0,0)
print(result)