# -*- coding: utf-8 -*-

alt = ['A','B','C','D','E']
n = input()
while (n > 0):
    for x in xrange(0,n,1):
        cont = 0
        entrada = raw_input().split()
        numeros = map(int,entrada)
        for y in numeros:
            if (y <= 127):
                cont+=1
        if (cont == 1):
            n_min = min(numeros)
            print alt[numeros.index(n_min)]
        else:
            print '*'
    n = input()
            
