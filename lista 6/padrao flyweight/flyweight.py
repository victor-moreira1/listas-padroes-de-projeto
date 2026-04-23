class FlyweightFactory:
    def digita_caractere(self,carac):
        carac.digitar_caractere()
    def move_para_proximo(self,carac):
        carac.movimento()
        print("Também fica responsável por salvar a posição do caractere.")
    
class FlyweightConcreto:
    def __init__(self,simbolo_carac):
        print("Armazena aqui o símbolo do caractere.")
    
    def setter_carac(self,simbolo):
        print("Executa o método de armazenar o caractere.")

class FlyweightAbstrato:
    def setter_carac_abs(self):
        FlyweightConcreto.setter_carac()
