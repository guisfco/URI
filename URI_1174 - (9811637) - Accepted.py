# -*- coding: utf-8 -*-

a = []
for x in xrange(100):
    a.append(float(input()))
for x in xrange(100):
    if (a[x] <= 10):
        print 'A[%d] = %.1f' % (x,a[x])
        
