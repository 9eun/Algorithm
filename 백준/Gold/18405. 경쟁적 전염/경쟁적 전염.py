from collections import deque
import sys

input = sys.stdin.readline
virus = []

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
s, x, y = map(int, input().split())

for i in range(n):
  for j in range(n):
    if arr[i][j] != 0:
      virus.append((arr[i][j], 0, i, j))

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
virus.sort()

q = deque(virus)

while q:
  v, ts, tx, ty = q.popleft()
  if ts == s:
    break
  for i in range(4):
    nx = tx + dx[i]
    ny = ty + dy[i]
    if 0 <= nx and 0 <= ny and nx < n and ny < n:
      if arr[nx][ny] == 0:
        arr[nx][ny] = v
        q.append((v, ts + 1, nx, ny))

print(arr[x - 1][y - 1])
