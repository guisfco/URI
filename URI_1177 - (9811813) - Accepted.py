# -*- coding: utf-8 -*-

n = []
t = input()
cont = 0
for x in xrange(1000):
    if (cont == t):
        cont = 0
    n.append(cont)
    cont+=1
for x in xrange(1000):
    print 'N[%d] = %d' % (x,n[x])
