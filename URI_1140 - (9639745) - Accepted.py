# -*- coding: utf-8 -*-

sentence = raw_input().split()
letter = str(sentence[0][0])
stop = '*'

while (letter != stop):
    condition = 1
    for x in range(len(sentence)):
        temp = sentence[x][0]
        if (letter.lower() != temp.lower()):
            condition = 0
            break

    if (condition == 1):
        print 'Y'
    else:
        print 'N'
    sentence = raw_input().split()
    letter = str(sentence[0][0])
