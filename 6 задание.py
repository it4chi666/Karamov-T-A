# -- coding: utf-8 --

from tkinter import *
from tkinter import scrolledtext
def z1():
    pos1= Tk()
    pos1.title("задание 1")
    pos1.geometry("600x400")
    def z1r():
        m=int(l1.get())
        i=1
        while i**2<m:
            print(i**2)
            i=str(i)+" "
            g.insert(INSERT, i)
            i+=1
    u1=Label(pos1, text="введите число: ")
    u1.grid(column=0, row=0)
    l1=Entry(pos1, width=10)
    l1.grid(column=1, row=0)
    btn1=Button(pos1, text="вычислить", command=z1r)
    btn1.grid(column=2, row=0)
    g = scrolledtext.ScrolledText(pos1, width=60, height=15)
    g.grid(column=0, row=1)
    pos1.mainloop()
def z2():
    pos2=Tk()
    pos2.title("задание 2")
    pos2.geometry("600x400")
    def z2r():
        m=int(l2.get())
        i=2
        while m%i !=0:
            i += 1
        print(i)
        i=str(a)+" "
        g2.insert(INSERT, i)
    u2=Label(pos2, text="введите число: ")
    u2.grid(column=0, row=0)
    l2=Entry(pos2, width=10)
    l2.grid(column=1, row=0)
    btn2=Button(pos2, text="вычислить", command=z2r)
    btn2.grid(column=2, row=0)
    g2 = scrolledtext.ScrolledText(pos2, width=50, height=15)
    g2.grid(column=0, row=1)
    pos2.mainloop()
def z3():
    pos3=Tk()
    pos3.title("Задание 3")
    pos3.geometry("600x400")
    def z3r():
        step=1
        pok=0
        n=int(l3.get())
        while step<n:
            step*=2
            pok+=1
        else:
            step=int(step/2)
            pok-=1
            ppk="показ. степени: " + str(pok) + "   "
            step="степень: " + str(step)
            g3.insert(INSERT, pok)
            g3.insert(INSERT, step)      
    u3=Label(pos3, text="введите число: ")
    u3.grid(column=0, row=0)
    l3=Entry(pos3, width=10)
    l3.grid(column=1, row=0)
    btn3=Button(pos3, text="вычислить", command=z3r)
    btn3.grid(column=2, row=0)
    g3 = scrolledtext.ScrolledText(pos3, width=50, height=15)
    g3.grid(column=0, row=1)
    pos3.mainloop()
def z4():
    pos4=Tk()
    pos4.title("задание 4")
    pos4.geometry("600x400")
    def z4r():
        i=1
        a=int(l4.get())
        b=int(l41.get())
        while a<=b:
            if a==b:
                break
            a=a+(a/10)
            i+=1
        else:
            g4.insert(INSERT, i)
    u4=Label(pos4, text="введите значения: ")
    u4.grid(column=0, row=0)
    l4=Entry(pos4, width=10)
    l4.grid(column=1, row=0)
    l41=Entry(pos4, width=10)
    l41.grid(column=3, row=0)
    btn4=Button(pos4, text="вычислить", command=z4r)
    btn4.grid(column=4, row=0)
    g4 = scrolledtext.ScrolledText(pos4, width=60, height=15)
    g4.grid(column=0, row=1)
    pos4.mainloop()
def z5():
    global a
    pos5=Tk()
    pos5.title("задание 5")
    pos5.geometry("600x400")
    a=0
    def z5r(): 
        global a 
        m=int(l5.get())
        while m!=0:
            a+=1
            l5.delete(0, "end")
            break   
        else:
            a="кол-во членов : " + str(a)
            g5.insert(INSERT, a)
    u5=Label(pos5, text="вводите число пока не появится результат: ")
    u5.grid(column=0, row=0)
    l5=Entry(pos5, width=10)
    l5.grid(column=1, row=0)
    btn5=Button(pos5, text="вычислить", command=z5r)
    btn5.grid(column=4, row=0)
    g5 = scrolledtext.ScrolledText(pos5, width=60, height=10)
    g5.grid(column=0, row=1)
    pos5.mainloop()
def z6():
    global n
    global d
    global a
    pos6=Tk()
    pos6.title("задание 6")
    pos6.geometry("600x400")
    n=0
    d=0
    def z6r(): 
        global n
        global d
        global a
        a=int(l6.get())
        while a!=0:
            d+=1
            n+=a
            l6.delete(0, "end")
            break   
        else:
            a="ср. значение: " + str(n/d)
            g6.insert(INSERT, a)
    u6=Label(pos6, text="ведите число: ")
    u6.grid(column=0, row=0)
    l6=Entry(pos6, width=10)
    l6.grid(column=1, row=0)
    btn6=Button(pos6, text="вычислить", command=z6r)
    btn6.grid(column=4, row=0)
    g6 = scrolledtext.ScrolledText(pos6, width=50, height=15)
    g6.grid(column=0, row=1)
    pos6.mainloop()
def z7():
    global k
    global j
    global a
    pos7=Tk()
    pos7.title("задание 7")
    pos7.geometry("600x400")
    k=0
    j=0
    def z7r(): 
        global k
        global j
        global a
        a=int(l7.get())
        while a!=0:
            if int(k)<int(a):
                if k==0:
                    k=a
                    l7.delete(0, "end")
                    break  
                else:
                    j+=1
                    k=a
                    l7.delete(0, "end")
                    break    
            else:
                a=str(j)
                g7.insert(INSERT, a)
    u7=Label(pos7, text="введите число: ")
    u7.grid(column=0, row=0)
    l7=Entry(pos7, width=10)
    l7.grid(column=1, row=0)
    btn7=Button(pos7, text="вычислить", command=z7r)
    btn7.grid(column=4, row=0)
    g7 = scrolledtext.ScrolledText(pos7, width=50, height=15)
    g7.grid(column=0, row=1)
    pos7.mainloop()
def z8():
    global n
    global d
    global a
    global x
    pos8=Tk()
    pos8.title("задание 8")
    pos8.geometry("600x400")
    n=0
    d=0
    x=0
    def z8r(): 
        global n
        global d
        global a
        global x
        a=int(l8.get())
        while a!=0:
            if int(n)==int(a):
                d+=1
            else:
                n=a
                x=max(x,d)
                d=1
            l8.delete(0, "end")
            break  
        else:
            x=max(x,d)
            x=str(x)
            g8.insert(INSERT, x)
    u8=Label(pos8, text="введите число: ")
    u8.grid(column=0, row=0)
    l8=Entry(pos8, width=10)
    l8.grid(column=1, row=0)
    btn8=Button(pos8, text="вычислить", command=z8r)
    btn8.grid(column=4, row=0)
    g8 = scrolledtext.ScrolledText(pos8, width=50, height=15)
    g8.grid(column=0, row=1)
    pos8.mainloop()
wind = Tk()
wind.title("")
wind.geometry("600x500")
lbl=Label(wind, text="выберите номер задания: ")
lbl.grid(column=0, row=0)
btn=Button(wind, text="задание 1", bg="pink", command=z1)
btn.grid(column=0, row=1)
btn2=Button(wind, text="задание 2", bg="pink", command=z2)
btn2.grid(column=0, row=2)
btn3=Button(wind, text="задание 3", bg="pink", command=z3)
btn3.grid(column=0, row=3)
btn4=Button(wind, text="задание 4", bg="pink", command=z4)
btn4.grid(column=0, row=4)
btn5=Button(wind, text="задание 5", bg="pink", command=z5)
btn5.grid(column=0, row=5)
btn6=Button(wind, text="задание 6", bg="pink", command=z6)
btn6.grid(column=0, row=6)
btn7=Button(wind, text="задание 7", bg="pink", command=z7)
btn7.grid(column=0, row=7)
btn8=Button(wind, text="задание 8", bg="pink", command=z8)
btn8.grid(column=0, row=8)
wind.mainloop()