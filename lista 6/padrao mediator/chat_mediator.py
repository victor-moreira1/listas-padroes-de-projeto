class ChatMediator: #abstrata
    def mostra_mensagem():
        ChatMediatorImpl.mostra_mensagem()

class ChatMediatorImpl:
    def mostra_mensagem(self,usuario):
        print(f"Mensagem enviada pelo {usuario}.")
