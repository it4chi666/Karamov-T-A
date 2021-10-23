# -*- coding: utf-8 -*-
c = input()
n = c.count('f')
if n == 0:
    print(-2)
elif n == 1:
    print(-1)
else:
    k = c.find('f') + 1
    print(c[k:].find('f') + k)
