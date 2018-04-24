# -*- coding: utf-8 -*-

entrada = raw_input().split()
h = int(entrada[0])
m = int(entrada[1])
while (h != 0 and m != 0):
    print h+m
    entrada = raw_input().split()
    h = int(entrada[0])
    m = int(entrada[1])

