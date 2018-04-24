# -*- coding: utf-8 -*-

rep = int(input())

for x in range(rep):
    input = raw_input().split()
    l1 = int(input[0])
    l2 = int(input[1])
    print '%d cm2' % (int((l1*l2)/2))