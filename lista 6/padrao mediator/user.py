class UserImpl:
    def __init__(self,nome):
        self.username = nome

    def enviar_mensagem(self):
        return "Mensagem enviada pelo usuário."
    
    def caixa_de_mensagem(self):
        return "Mensagem enviada para usuário."
    
class User: #abstrata
    def enviar_mensagem():
        UserImpl.enviar_mensagem()