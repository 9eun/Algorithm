import sys
from collections import deque

input = sys.stdin.readline

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def virus():
    queue = deque([(i, j) for i in range(n) for j in range(m) if temp[i][j] == 2])
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and temp[nx][ny] == 0:
                temp[nx][ny] = 2
                queue.append((nx, ny))

def count_safe_zone():
    return sum(row.count(0) for row in temp)

def dfs(count, start):
    global result
    if count == 3:
        for i in range(n):
            for j in range(m):
                temp[i][j] = arr[i][j]
        virus()
        result = max(result, count_safe_zone())
        return

    for i in range(start, n * m):
        x, y = divmod(i, m)
        if arr[x][y] == 0:
            arr[x][y] = 1
            dfs(count + 1, i + 1)
            arr[x][y] = 0

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
temp = [[0] * m for _ in range(n)]

result = 0
dfs(0, 0)
print(result)
