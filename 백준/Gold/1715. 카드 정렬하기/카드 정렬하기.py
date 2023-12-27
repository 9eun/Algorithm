import sys, heapq
input = sys.stdin.readline

n=int(input())
arr=[]
for i in range(n):
  heapq.heappush(arr,int(input()))

res=0
while len(arr) !=1:
  a = heapq.heappop(arr)
  b = heapq.heappop(arr)
  s = a+b
  res+=s
  heapq.heappush(arr,s)
print(res)