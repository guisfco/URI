# -*- coding: utf-8 -*-

entrada = raw_input().split()
a = int(entrada[0])
b = int(entrada[1])
c = int(entrada[2])
while (a != 0 and b != 0 and c != 0):
    volume = a*b*c
    resultado = int(volume**(1/3.0))
    print resultado
    entrada = raw_input().split()
    a = int(entrada[0])
    b = int(entrada[1])
    c = int(entrada[2])


