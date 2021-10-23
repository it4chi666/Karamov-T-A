# -*- coding: utf-8 -*-
c=input()
h1=c.find('h')
h2=c.rfind('h')
print(c[:h1+1] + c[h2-1:h1:-1] + c[h2:])