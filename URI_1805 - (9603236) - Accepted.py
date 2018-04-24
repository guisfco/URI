# -*- coding: utf-8 -*-

entrada = raw_input().split()
start = int(entrada[0])
end = int(entrada[1])

resultado = (start + end)*(end - start + 1) / 2

print resultado