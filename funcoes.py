#Definindo a função
#def é a palavra reservada para definir funções em Python

def funcaoOi():
    print("Oi, essa é minha querida função")

funcaoOi() #Chamando a função

#DocString é uma área reservada para descrição sobre a função, seus parâmetros e funcionalidades

def docString ():
    """
    Função criada por Maria Eduardinha
    """

print((docString()))

#Função com passagem de parametro
def imprimirNome(nome):
    print((f"O seu nome é: {nome}"))

imprimirNome("Steve Jobs;")
imprimirNome("Maria Eduarda;")
imprimirNome("Michelle Veras;")

#Função com valor default
def professor(nome = 'Junior Santos', idade = 40):
    print(f"O professor(a) {nome}, de idade: {idade}")

professor() #Função sem passagem de parâmetro, nesse caso a função vai utilizar os valores padrão

professor('Aline Mendonça', '59')

def carro (modelo = '', placa= 0, anoFabricacao = 0):
    print(f'\t - Veiculo: {modelo}; \n\t - Placa: {placa}; \n\t - Ano de Fabricação: {anoFabricacao};')

carro('L200','EZK 2223', 2012)


#Parametro Args
#O parametro args é usado para receber uma lista de argumentos de comprimento variavel sem palavra chave (keyboard) dentro da função

def decParaOctal(*args):
    num = 0
    for num in args:
        octal = oct(num)[2:]
        print(octal)

decParaOctal(7, 9, 22, 74, 108, 300, 1200, 1024, 512, 128)


#Parâmetros **Kwargs
# os "*" indica que a função deve descompactar os dados que estão sendo passados na função

def funcaokw(**kwargs):
    """
     Função que utiliza kwargs (dicionario como entrada de parâmetros);
     : param kwargs:
     :return:
    """

    for itens in kwargs:
        print(itens, '-', kwargs[itens])

funcaokw(Volkswagem = 'Gol', Ford = 'Corsa', Fiat = 'Palio', Renault = '')

#Funções com retorno

def soma(num1, num2):
    soma = num1 + num2
    return soma

somaTotal = soma(20, 10)
print(somaTotal)

print(soma(100,100))