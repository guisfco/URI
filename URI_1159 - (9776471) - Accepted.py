# -*- coding: utf-8 -*-

n = input()
while (n != 0):
    cont = 0
    soma = 0
    while (cont < 5):
        if (n%2==0):
            cont+=1
            soma+=n
        if (cont == 5):
            break
        n+=1
        
    print soma
    n = input()
