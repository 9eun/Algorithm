import sys
input = sys.stdin.readline

n=int(input())
data = []
teacher = []
space = []
answer=False
for i in range(n):
  data.append(list(input().split()))
  for j in range(n):
    if data[i][j]=='T':
      teacher.append((i,j))
    elif data[i][j]=='X':
      space.append((i,j))

dx = [-1,0,1,0]
dy = [0,1,0,-1]

def check():
  for x,y in teacher:    
    for p in range(4):
      nx=x+dx[p]
      ny=y+dy[p]
      while 0<=nx<n and 0<=ny<n:
        if data[nx][ny]=='O':
          break
        elif data[nx][ny]=='S':
          return False
        nx+=dx[p]
        ny+=dy[p]
  return True
def process(count):
  global answer
  if count==3:
    if check():
      answer=True
      return
  else:
    for i in range(n):
      for j in range(n):
        if data[i][j]=='X':
          data[i][j]='O'
          process(count+1)
          data[i][j]='X'

process(0)
if answer:
  print('YES')
else:
  print('NO')