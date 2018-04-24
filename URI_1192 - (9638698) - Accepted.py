# -*- coding: utf-8 -*-

rep = int(input())

for x in range(rep):
    input = raw_input()
    num1 = int(input[0])
    letra = str(input[1])
    num2 = int(input[2])
    if (num1 == num2):
        print '%d' % (num1**2)
    elif (letra.isupper()):
        print '%d' % (num2-num1)
    elif (letra.islower()):
        print '%d' % (num2+num1)

