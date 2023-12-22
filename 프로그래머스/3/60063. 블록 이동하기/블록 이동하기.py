from collections import deque

def next_pos(pos,board):
    npos = []
    pos = list(pos)
    x1 = pos[0][0]
    y1 = pos[0][1]
    x2 = pos[1][0]
    y2 = pos[1][1]
    
    dx = [-1,0,1,0]
    dy = [0,1,0,-1]
    
    for i in range(4):
        nx1 = x1+dx[i]
        ny1 = y1+dy[i]
        nx2 = x2+dx[i]
        ny2 = y2+dy[i]
        
        if board[nx1][ny1] == 0 and board[nx2][ny2]==0:
            npos.append({(nx1,ny1),(nx2,ny2)})
    if x1==x2:
        for i in [-1,1]:
            if board[x1+i][y1]==0 and board[x2+i][y2]==0:
                npos.append({(x1,y1),(x1+i,y1)})
                npos.append({(x2,y2),(x2+i,y2)})
    elif y1==y2:
        for i in [-1,1]:
            if board[x1][y1+i]==0 and board[x2][y2+i]==0:
                npos.append({(x1,y1),(x1,y1+i)})
                npos.append({(x2,y2),(x2,y2+i)})
    return npos
def solution(board):
    n = len(board)
    new = [[1]*(n+2) for _ in range(n+2)]
    for i in range(n):
        for j in range(n):
            new[i+1][j+1] = board[i][j]
    q = deque()
    visited=[]
    pos = {(1,1),(1,2)}
    q.append((pos,0))
    visited.append(pos)
    
    while q:
        pos,result =q.popleft()
        if (n,n) in pos:
            return result
        for next in next_pos(pos,new):
            if next not in visited:
                q.append((next,result+1))
                visited.append(next)
    return 0