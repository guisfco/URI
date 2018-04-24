# -*- coding: utf-8 -*-

c = input()
for y in xrange(c):
    contDivisores = 0
    n = input()
    total = n
    for x in xrange(1,n+1):
        for i in xrange(1,n+1):
            if (x % i == 0):
                contDivisores+=1
        if (contDivisores % 2 != 0):
            total-=1
        contDivisores=0
    print total
