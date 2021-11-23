# -*- coding: utf-8 -*-
a = int(input())
max1 = a
max2 = 0
n = 1
while a != 0:
    a = int(input())
    if a > max1:
        max2 = max1
        max1 = a
        n = 1
    elif max1 > a > max2:
        max2 = a
    elif a == max1 :
        n += 1
print(n)