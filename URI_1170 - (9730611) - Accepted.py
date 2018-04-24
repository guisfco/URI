# -*- coding: utf-8 -*-

for x in xrange(0,input(),1):
    comida = float(input())
    dias = 0
    while (comida > 1):
        comida = float(comida/2)
        dias+=1
    print '%d dias' % (dias)
        
