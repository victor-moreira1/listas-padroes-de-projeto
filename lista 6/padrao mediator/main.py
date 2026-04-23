from chat_mediator import ChatMediator
from user import User


user_number = -1
while user_number < 0:
    user_number = int(input("Digite o número de usuários: "))
    if user_number < 0:
        print("Número de usuários inválido.")
    else:
        break

user_list = []
for i in range(user_number):
    nickname = input(f"Digite o apelido do usuário nº {i+1}: ")
    user = User(nickname)
    user_list.append(user)

mensagem = "Hello world."
while user.enviar_mensagem() != "":
    ChatMediator.mostra_mensagem()