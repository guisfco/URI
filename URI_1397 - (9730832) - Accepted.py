# -*- coding: utf-8 -*-

pontos = range(2)
rodadas = input()
while (rodadas > 0):
    pontos[0] = 0
    pontos[1] = 0
    for x in xrange(0,rodadas,1):
        entrada = raw_input().split()
        p1 = int(entrada[0])
        p2 = int(entrada[1])
        if (p1 > p2):
            pontos[0] += 1
        elif (p2 > p1):
            pontos[1] += 1
    print '%d %d' % (pontos[0], pontos[1])
    rodadas = input()