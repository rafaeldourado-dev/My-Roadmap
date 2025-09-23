nome = str(input("Qual seu nome? "))
cpf = str(input("Insira seu cpf: "))
idade = int(input("Sua idade: "))

dados = {"nome", "cpf", "idade"}

if not nome and cpf and idade in dados:
    try:
        if isinstance(nome, str) and (cpf, str) and (idade, int):
            dados.append(nome, cpf, idade)
        else:
            raise TypeError('Tipo invalido.')
    except ValueError as e:
        print(f'Ocorreu um erro inesperado no sistema. {e} ')

for dado in dados:
    print(dado)