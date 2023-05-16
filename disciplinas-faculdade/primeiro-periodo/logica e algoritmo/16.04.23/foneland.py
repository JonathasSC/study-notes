class LojaSmartphone:
    def __init__(self,nome):
        self.nome = nome
        self.estoque = []
        self.funcionarios = []

    def adicionar_smartphone(self,lista_modelo):
        for modelo in lista_modelo:
            self.estoque.append(modelo)

    def adicionar_funcionario(self,lista_funcionario):
        for funcionario in lista_funcionario:
            self.funcionarios.append(funcionario)

    # funções do estoque ----------------------------------------------------------------------

    def verificar_estoque_modelos(self):
        for modelo in self.estoque:
            print(f'Modelo: {modelo.nome} | Valor: {modelo.valor} | Unid: {modelo.unid}')

    def valor_total_estoque(self):
        valor_estoque = 0
        for modelo in self.estoque:
            valor_estoque += modelo.valor
        print(f'O valor total do estoque é R${valor_estoque}')

    def achar_modelo_por_nome(self, nome_modelo):
        for modelo in self.estoque:
            if modelo.nome == nome_modelo:
                return modelo 
               
    #  referente a funcionarios ----------------------------------------------------------------

    def verificar_todos_funcionarios(self):
        for funcionario in self.funcionarios:
            print(f'Nome: {funcionario.nome} | Cargo: {funcionario.cargo} | Horario do Expediente: {funcionario.horario}')

    def achar_funcionario_por_nome(self, nome_funcionario):
        for funcionario in self.funcionarios:
            if funcionario.nome == nome_funcionario:
                return funcionario

    #  referente a pagamento ----------------------------------------------------------------

    def metodo_pagamento(self,nome_modelo):
        print('1. Pix')
        print('2. Cartão de Crédito')
        print('3. Cartão de Débito')
        print('4. Dinheiro Fisico \n')
        meio_pag = int(input('digite o meio de pagamento: '))

        while meio_pag != 1 and meio_pag != 2 and meio_pag != 3 and meio_pag != 4:
            print('Digite uma opçõa válida!')
            meio_pag = int(input('digite o meio de pagamento:'))

        if meio_pag == 1:
            valor_com_desconto = nome_modelo.valor - (nome_modelo.valor * 0.10)

            print('-'*30)
            print(f'Desconto de 10% recebido!')
            print(f'Gerando QR Code no valor de R$ {valor_com_desconto}')
            print('Obrigado pela sua compra, volte sempre!')
            
        if meio_pag == 2:
            print('Pode parcelar em até 12X')
            parcela = int(input('Quantidade de parcelas: '))

            while parcela > 12 or parcela < 0:
                print('Digite um valor  valido!')
                parcela = int(input('Valor da parcelas: '))
            
            print(f'{parcela} parcelas de R${(nome_modelo.valor / parcela) + (nome_modelo.valor * 0.01):.2f}')
            print('Obrigado pela sua compra, volte sempre!')

        if meio_pag == 3:
            valor_com_desconto = nome_modelo.valor - (nome_modelo.valor * 0.10)

            print('-'*30)
            print(f'Desconto de 10% recebido!')
            print(f'Gerando código no valor de R${valor_com_desconto}')
            print('Obrigado pela sua compra, volte sempre!')

        if meio_pag == 4:
            valor_com_desconto = nome_modelo.valor - (nome_modelo.valor * 0.10)

            print('-'*30)
            print(f'Desconto de 10% recebido!')
            print(f'Pague o valor de R${valor_com_desconto} no caixa.')
            print('Obrigado pela sua compra, volte sempre!')


    def efetur_venda(self,nome_funcionario, nome_modelo, unid_vendida):

        funcionario = self.achar_funcionario_por_nome(nome_funcionario)
        modelo = self.achar_modelo_por_nome(nome_modelo)

        self.metodo_pagamento(modelo)

        modelo.unid -= unid_vendida
        funcionario.venda += 1
        funcionario.comissao += modelo.valor * 0.05

        print('-'*50)
        print(f'O funcionario {funcionario.nome} vendeu {unid_vendida} unid(s) de {modelo.nome}')
        print(f'O estoque de {modelo.nome} agora é {modelo.unid}')

    #  referente a bater ponto ----------------------------------------------------------------

    def bater_ponto(self,nome_funcionario, horario, horario_entrada):
        funcionario = self.achar_funcionario_por_nome(nome_funcionario)
        funcionario.horario_entrada = horario_entrada
        funcionario.horario = horario

        if funcionario.horario_entrada < funcionario.horario:
            print('Entrou antecipadamente')

        elif funcionario.horario_entrada > funcionario.horario:
            funcionario.desconto_atraso = (funcionario.horario_entrada - funcionario.horario)
            print('Entrou atrasado')
            print(f'O funcionario {funcionario.nome} está com R${funcionario.desconto_atraso:.2f} descontado do salário')

        else:
            print('Entrou no horario exato.')
        
        return funcionario

# -----------------------------------------------------------------------------------------                

class ModeloSmartphone:
    def __init__(self,nome,valor,unid):
        self.nome = nome
        self.valor = valor
        self.unid = unid

class Funcionario:
    def __init__(self, nome, cargo, horario, horario_entrada, venda, comissao, desconto_atraso):
        self.nome = nome 
        self.cargo = cargo
        self.horario = horario 
        self.horario_entrada = horario_entrada
        self.venda = venda
        self.comissao = comissao
        self.desconto_atraso = desconto_atraso

loja = LojaSmartphone('FoneLand')

modelos = [
    ModeloSmartphone('Iphone 13',4299.00,120),
    ModeloSmartphone('Iphone 14 pro',7199.00,10),
    ModeloSmartphone('Iphone 12',3699.00,62),
    ModeloSmartphone('Samsung M23',1199.00,43),
    ModeloSmartphone('Samsung S20+',2700.00,3),
    ModeloSmartphone('Samsung A33',2700.00,12),
    ModeloSmartphone('Motorola One Fusion',2700.00,43),
    ModeloSmartphone('Motorola G60',1079.00,30),
    ModeloSmartphone('Motorola G52',1079.00,12),
]

funcionarios = [
    Funcionario('Jonathas','Gerente',0,0,0,0,0),
    Funcionario('Pedro','Caixa',0,0,0,0,0),
    Funcionario('Joao','Caixa',0,0,0,0,0),
    Funcionario('Marcelo','Caixa',0,0,0,0,0),
]

loja.adicionar_smartphone(modelos)
loja.adicionar_funcionario(funcionarios)

loja.efetur_venda('Jonathas','Samsung M23',1) #Exemplo de execução