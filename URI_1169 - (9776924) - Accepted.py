# -*- coding: utf-8 -*-

for x in xrange(0,input(),1):
    n = input()
    graos = 1
    quantidade = 0
    for y in xrange(0,n,1):
        graos = graos*2
    graos -= 1
    print '%d kg' % (int((graos/12)/1000))
