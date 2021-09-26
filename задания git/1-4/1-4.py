# -*- coding: utf-8 -*-
x=int(input())
d=x//84000
h=(x%84000)%3600
m=(x%3600)%60
s=x%60
print (d,h,m,s)