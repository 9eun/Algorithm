from collections import deque
import sys
input=sys.stdin.readline

n,m,k,x=map(int,input().split())

graph=[[] for _ in range(n+1)]

for _ in range(m):
	a,b=map(int,input().split())
	graph[a].append(b)

d=[-1]*(n+1)
d[x]=0
q=deque([x])

while q:
	now=q.popleft()

	for x in graph[now]:
		if d[x]==-1:
			d[x]=d[now]+1
			q.append(x)

count=0

for i in range(1,n+1):
	if d[i]==k:
		print(i)
		count+=1

if count==0:
	print(-1)