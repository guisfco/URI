# -*- coding: utf-8 -*-

entrada = raw_input().split()
x1 = int(entrada[0])
y1 = int(entrada[1])
x2 = int(entrada[2])
y2 = int(entrada[3])

while (not(x1 == 0 and y1 == 0 and x2 == 0 and y2 == 0)):
    qtdMovimentos = 0

    if (x1 == x2 and y1 == y2):
        qtdMovimentos = 0
    elif ((x1 == x2) or (y1 == y2) or (abs(x1 - x2)) == (abs(y1 - y2))):
        qtdMovimentos = 1
    else:
        qtdMovimentos = 2
    print qtdMovimentos
    entrada = raw_input().split()
    x1 = int(entrada[0])
    y1 = int(entrada[1])
    x2 = int(entrada[2])
    y2 = int(entrada[3])
    
