# -*- coding: utf-8 -*-

for x in xrange(0,input(),1):
    menorDiferenca = 99999
    vencedor = -1
    entrada = raw_input().split()
    qtdAlunos = int(entrada[0])
    numSorteado = int(entrada[1])
    aluno = range(qtdAlunos)
    entrada = raw_input().split()
    aluno = map(int,entrada)
    for n in aluno:
        diferenca = abs(n-numSorteado)
        if (diferenca < menorDiferenca):
            menorDiferenca = diferenca
            vencedor = aluno.index(n)
    print vencedor+1
