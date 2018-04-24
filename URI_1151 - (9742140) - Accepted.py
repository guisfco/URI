# -*- coding: utf-8 -*-

fibonacci = []

for x in xrange(0,input(),1):
    if (x == 0):
        fibonacci.append(0)
    elif (x == 1):
        fibonacci.append(1)
    else:
        fibonacci.append(fibonacci[x-2]+fibonacci[x-1])
string = ''
for x in xrange(0,len(fibonacci)):
    if (x == (len(fibonacci)-1)):
        string += str(fibonacci[x])
    else:
        string += str(fibonacci[x]) + ' '
print string
