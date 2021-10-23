# -*- coding: utf-8 -*-
c = input()
first = c[:c.find(' ')]
second = c[c.find(' ') + 1:]
print(second+' '+first)