# -*- coding: utf-8 -*-

teste = 0
n = input()
while (n != 0):
    ganhador = 0
    teste +=1
    entrada = raw_input().split()
    num = map(int,entrada)
    for x in xrange(len(num)):
        if ((x+1) == num[x]):
            ganhador = x+1;
    print 'Teste %d\n%d\n' % (teste,ganhador)
    n = input()
