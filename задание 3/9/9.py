# -*- coding: utf-8 -*-
f1 = 1
f2 = 1
n = input("Номер элемента ряда Фибоначчи: ")
n = int(n)
i = 0
while i < n - 2:
    fsum = f1 + f2
    f1 = f2
    f2 = fsum
    i = i + 1
print(f2)