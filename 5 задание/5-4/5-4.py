# -*- coding: utf-8 -*-
a=int(input())
b=int(input())
i=1
while a<=b:
    if a==b:
        break
    a+=a/10
    i+=1
print(i)