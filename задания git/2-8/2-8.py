# -*- coding: utf-8 -*-
z = int(input())
x = int(input())
c = int(input())
if z==x==c:
    print(3)
elif z==x or x==c or z==c:
    print(2)
else:
    print(0)