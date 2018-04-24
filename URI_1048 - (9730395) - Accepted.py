# -*- coding: utf-8 -*-

salario = input()
reajuste = 0

if (salario >= 0 and salario <= 400):
    reajuste = float((salario*15)/100)
    salario += reajuste
    print "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%" % (float(salario),float(reajuste))
elif (salario <= 800):
    reajuste = float((salario*12)/100)
    salario += reajuste
    print "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%" % (float(salario),float(reajuste))
elif (salario <= 1200):
    reajuste = float((salario*10)/100)
    salario += reajuste
    print "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%" % (float(salario),float(reajuste))
elif (salario <= 2000):
    reajuste = float((salario*7)/100)
    salario += reajuste
    print "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%" % (float(salario),float(reajuste))
else:
    reajuste = float((salario*4)/100)
    salario += reajuste
    print "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%" % (float(salario),float(reajuste))

