# -*- coding: utf-8 -*-

entrada1 = input()
entrada2 = raw_input().split()
soma = 0
for x in xrange(0,len(entrada2)):
    soma = soma + int(entrada2[x])
print soma-entrada1


