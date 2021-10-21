# -*- coding: utf-8 -*-
n=int(input())
x=1
s=0
def f(n):
  for i in range(1, n+1):
    x*=i
    s+=x
print(s)
f(n)