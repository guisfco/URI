# -*- coding: utf-8 -*-

times = input()
while (times != 0):
    mary = 0
    john = 0
    entrada = raw_input().split()
    winner = map(int,entrada)
    for x in winner:
        if (x == 0):
            mary+=1
        elif (x == 1):
            john+=1
    print "Mary won %d times and John won %d times" % (mary,john)
    times = input()
