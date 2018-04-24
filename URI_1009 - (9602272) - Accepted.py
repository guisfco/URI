# -*- coding: utf-8 -*-

name = raw_input()
salary = input()
vendas = input()
print ('TOTAL = R$ %.2f') % (salary+  ((vendas*15)/100))