a = input()
x = ord(a[0])-96
y = int(a[1])
move = [(-2,-1),(-1,-2),(2,-1),(1,-2),(-2,1),(-1,2),(2,1),(1,2)]

count = 0
for m in move:
  nx = x + m[0]
  ny = y + m[1]
  if nx>=1 and ny>=1 and nx<=8 and ny<=8:
    count+=1
print(count)
