# -*- coding: utf-8 -*-

maiorNumero = -99999
h = input()
while (h != 0):
    numAnterior = h
    resultado = 0
    maiorNumero = h
    while (resultado != 1):
        if (h == 1 or h == 2):
            print h
            break
        else:
            if (numAnterior % 2 == 0):
                resultado = 0.5*numAnterior
                numAnterior = resultado
                if (resultado > maiorNumero):
                    maiorNumero = resultado
            elif (numAnterior % 2 != 0):
                resultado = (3*numAnterior)+1
                numAnterior = resultado
                if (resultado > maiorNumero):
                    maiorNumero = resultado
        if (resultado == 1):
            print int(maiorNumero)
            break
    h = input()
