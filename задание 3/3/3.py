# -*- coding: utf-8 -*-
a=int(input())
b=int(input())
def f(a,b):
    for i in range (a -(a-1)%2, b -b%2,-2):
        print(i,end=' ')
f(a,b)           