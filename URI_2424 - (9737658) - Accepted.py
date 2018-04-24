# -*- coding: utf-8 -*-

entrada = raw_input().split()
x = int(entrada[0])
y = int(entrada[1])
if (x >= 0 and x <= 432 and y >= 0 and y <= 468):
    print 'dentro'
else:
    print 'fora'
