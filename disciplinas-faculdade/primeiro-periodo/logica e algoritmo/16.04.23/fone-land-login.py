def line(valor):
    print('-'*valor)

def login():
    user = input('Usuário: ')
    password = input('Senha: ')

    while validate_user(user, password) == False:
        line(45)
        print('Usuário ou senha incorretos, tente novamente.')
        line(45)

        user = input('Usuário: ')
        password = input('Senha: ')

        validate_user(user, password)
        
    employee = validate_user(user, password)
	
    line(20)
    print(f"{employee} logado")
    line(20)

    return employee

def validate_user(user, password):
    manager = ['gerente','gerente123']
    cashier = ['caixa','caixa123']
    attendant = ['atendente','atendente123']

    if user == manager[0] and password == manager[1]:
        return 'Gerente'

    elif user == cashier[0] and password == cashier[1]:
        return 'Caixista'

    elif user == attendant[0] and password == attendant[1]:
        return 'Atendente'

    else: 
        return False
    
login() # Execução de sistema de login