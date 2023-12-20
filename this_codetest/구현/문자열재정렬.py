n = input()
s = []
m = 0
for i in n:
  if i.isalpha():
    s.append(i)
  else:
    m += int(i)
s.sort()
s.append(str(m))
print(''.join(s))
