n = int(input())
k = int(input())
arr = [[0]*(n+1) for _ in range(n+1)]
info=[]
for _ in range(k):
  a,b=map(int,input().split())
  arr[a][b] = 1
l = int(input())
for _ in range(l):
  x,c=input().split()
  info.append((int(x),c))

dx = [0,1,0,-1]
dy = [1,0,-1,0]

def turn(direction,c):
  if c == 'L':
    direction = (direction-1)%4
  else:
    direction = (direction+1)%4
  return direction

x,y = 1,1
arr[x][y] = 2
direction = 0
time = 0
index = 0
q = [(x,y)]
while True:
  nx = x+dx[direction]
  ny = y+dy[direction]

  if 1<=nx and nx<=n and 1<=ny and ny<=n and arr[nx][ny]!=2:
  
    if arr[nx][ny] == 0:
      arr[nx][ny] = 2
      q.append((nx, ny))
      px, py = q.pop(0)
      arr[px][py] = 0
    if arr[nx][ny] ==1:
      arr[nx][ny]=2
      q.append((nx, ny))
  else:
    time+=1
    break
  x,y=nx,ny
  time +=1
  if index<l and time==info[index][0]:
    direction = turn(direction, info[index][1])
    index+=1
print(time)