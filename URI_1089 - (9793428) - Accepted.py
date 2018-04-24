# -*- coding: utf-8 -*-

n = input()
while (n != 0):
    contPicos = 0
    status = None ##True = subindo // False = descendo
    picos = map(int,raw_input().split())
    
    if (picos[0] > picos[1]):
        status = False
    elif (picos[0] < picos[1]):
        status = True
    ##print status
    mod = []
    
    for x in xrange(0,n,1):
        if (x != (n-1)):                
            if (status == True and picos[x] > picos[x+1]):
                status = False
                mod.append(status)
            elif (status == True and picos[x] < picos[x+1]):
                mod.append(status)
            elif (status == False and picos[x] < picos[x+1]):
                status = True
                mod.append(status)
            elif (status == False and picos[x] > picos[x+1]):
                mod.append(status)
        elif (x == (n-1)):
            if (status == True and picos[x] > picos[0]):
                status = False
                mod.append(status)
            elif (status == True and picos[x] < picos[0]):
                mod.append(status)
            elif (status == False and picos[x] < picos[0]):
                status = True
                mod.append(status)
            elif (status == False and picos[x] > picos[0]):
                mod.append(status)

    ##for x in mod:
    ##    print x
        
    for x in xrange(0,len(mod),1):
        if (x != (len(mod)-1)):  
            if (mod[x] != mod[x+1]):
                contPicos+=1
        if (x == (len(mod)-1)):
            if (mod[x] != mod[0]):
                contPicos+=1
    print contPicos
    n = input()
