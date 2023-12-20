n = input()
a = len(n) // 2
s = sum(int(x) for x in n[:a])
e = sum(int(x) for x in n[a:])
if s == e:
  print("LUCKY")
else:
  print('READY')
