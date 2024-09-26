SELECT Datanasc, Endereco
FROM Funcionario
WHERE Pnome = 'João' AND Minicial = 'B' AND Unome = 'Silva';

SELECT Salario 
FROM Funcionario
ORDER BY Salario;

SELECT Pnome, Cpf
FROM funcionario
WHERE endereco LIKE '%São Paulo%';

SELECT Pnome, Cpf
FROM funcionario
WHERE Dnr = 6 AND salario BETWEEN 30000 AND 40000;

SELECT Pnome, Unome
FROM funcionario
