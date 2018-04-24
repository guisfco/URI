# -*- coding: utf-8 -*-

cont = 0
c = input()
for y in xrange(0,c,1):
    n = input()
    for x in xrange(1,n+1,1):
        if (n % x == 0):
            cont+=1
    if (cont == 2):
        print "%d eh primo" % (n)
    else:
        print "%d nao eh primo" % (n)
    cont = 0
