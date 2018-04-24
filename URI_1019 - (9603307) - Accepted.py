# -*- coding: utf-8 -*-

horas=0
minutos=0
segundos=input()
while (segundos>= 3600):
    segundos = segundos-3600
    horas+=1

while (segundos >= 60):
    segundos = segundos-60
    minutos+=1

print '%d:%d:%d' % (horas,minutos,segundos)
