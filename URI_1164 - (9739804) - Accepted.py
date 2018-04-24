# -*- coding: utf-8 -*-

c = input()
for x in xrange(0,c,1):
    soma = 0
    n = input()
    for i in xrange(1,n,1):
        if (n % i == 0):
            soma+=i
    if (soma == n):
        print "%d eh perfeito" % (n)
    else:
        print "%d nao eh perfeito" % (n)
