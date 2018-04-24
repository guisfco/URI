# -*- coding: utf-8 -*-

con1 = raw_input().split()
con2 = raw_input().split()
cont = 0
for x in range(5):
    if (con1[x] != con2[x]):
        cont+=1
    else:
        break

if (cont == 5):
    print 'Y'
else:
    print 'N'

