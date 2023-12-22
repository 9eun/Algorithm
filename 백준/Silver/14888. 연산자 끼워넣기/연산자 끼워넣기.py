from itertools import permutations
from collections import deque
import sys
input = sys.stdin.readline
n = int(input())
arr = list(map(int,input().split()))
p,s,m,d = map(int,input().split())
result_max = -1e9
result_min = 1e9
data=[]
data.extend(['+']*p) 
data.extend(['-']*s)
data.extend(['*']*m)
data.extend(['/']*d)

data1 = list(set(permutations(data)))
q = deque(data1)
while q:
  cal = q.popleft()
  answer = arr[0]
  arr1 = arr[1:]
  for i in range(n-1):
    if cal[i]=='+':
      answer+=arr1[i]

    elif cal[i]=='-':
      answer-=arr1[i]

    elif cal[i]=='*':
      answer*=arr1[i]

    elif cal[i]=='/':
      answer/=arr1[i]
      answer = int(answer)
  
  result_max = max(answer,result_max)
  result_min = min(answer,result_min)

print(result_max)
print(result_min)
