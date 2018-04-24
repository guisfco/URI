# -*- coding: utf-8 -*-

entrada = raw_input().split()
a = int(entrada[0])
b = int(entrada[1])
volta = 1
faltando = 0
while (faltando < a):
    faltando = volta * (b-a)
    volta+=1
print volta
