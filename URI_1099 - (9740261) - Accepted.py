# -*- coding: utf-8 -*-

for x in xrange(0,input(),1):
    soma = 0
    inicio = 0
    fim = 0
    entrada = raw_input().split()
    x = int(entrada[0])
    y = int(entrada[1])
    if (x > y):
        inicio = y
        fim = x
    else:
        inicio = x
        fim = y
    for i in xrange(inicio+1,fim,1):
        if (i % 2 != 0):
            soma += i

    print soma
