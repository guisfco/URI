# -*- coding: utf-8 -*-

k = input()
while(k > 0):
    entradaDivisa = raw_input().split()
    divisaX = int(entradaDivisa[0])
    divisaY = int(entradaDivisa[1])
    for x in xrange(0,k,1):
        entradaCoord = raw_input().split()
        x = int(entradaCoord[0])
        y = int(entradaCoord[1])


        if (x == divisaX or y == divisaY):
            print 'divisa'
        else:
            if (x > divisaX and y > divisaY):
                print 'NE'
            elif (x < divisaX and y > divisaY):
                print 'NO'
            elif (x < divisaX and y < divisaY):
                print 'SO'
            elif (x > divisaX and y < divisaY):
                print 'SE'
    
    k = input()
