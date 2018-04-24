# -*- coding: utf-8 -*-

leitura = raw_input().split()
qtd1 = float(leitura[1])
valor1 = float(leitura[2])
leitura2 = raw_input().split()
qtd2 = float(leitura2[1])
valor2 = float(leitura2[2])


print ('VALOR A PAGAR: R$ %.2f') % ((qtd1*valor1)+(qtd2*valor2))