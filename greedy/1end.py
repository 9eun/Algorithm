n, m = map(int, input().split())
res = 0
while True:
  t = (n // m) * m
  res += (n - t)
  n = t
  if n < m:
    break
  res += 1
  n //= m
res -= 1
print(res)
