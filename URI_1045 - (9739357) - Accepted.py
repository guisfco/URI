# -*- coding: utf-8 -*-

lado = range(3)
entrada = raw_input().split()
        
lado[0] = float(entrada[0])
lado[1] = float(entrada[1])
lado[2] = float(entrada[2])
lado.sort()
a=lado[2]
b=lado[1]
c=lado[0]   
        
if (a >= b+c):
    print "NAO FORMA TRIANGULO"
else:
    if ((a*a)==(b*b+c*c)):
        print "TRIANGULO RETANGULO"
    if (a*a > b*b+c*c):
        print "TRIANGULO OBTUSANGULO"
    if (a*a < b*b+c*c):
        print "TRIANGULO ACUTANGULO"
    if (a == b and a == c):
        print "TRIANGULO EQUILATERO"
    if (a == b and a != c or a == c and a != b or b == c and b != a or b == a and b != c or c == a and c != b or c == b and c != a):
        print "TRIANGULO ISOSCELES"

