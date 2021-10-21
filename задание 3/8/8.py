# -*- coding: utf-8 -*-
n=int(input())
def f(n):
    for i in range(1, n+1):
        for x in range(1,i):
            print(x,end='') 
    print(i+1)
f(n)    