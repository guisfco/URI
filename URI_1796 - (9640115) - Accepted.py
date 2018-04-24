# -*- coding: utf-8 -*-

sim = 0
nao = 0
pop = input()
voto = raw_input().split()
for x in range(pop): 
    if (int(voto[x]) == 0):
        sim+=1
    elif (int(voto[x]) == 1):
        nao+=1

if (nao >= sim):
    print 'N'
else:
    print 'Y'
