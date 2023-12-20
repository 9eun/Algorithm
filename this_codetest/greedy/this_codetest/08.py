s= input()
res = []

sm=0
for i in s: 
  if i.isalpha()==1:
    res.append(i)
  else:
    sm+=int(i)
res.sort()

if sm!=0:
  res.append(str(sm))

print("".join(res))
  
