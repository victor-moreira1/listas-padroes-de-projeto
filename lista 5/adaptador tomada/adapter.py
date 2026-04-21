class Adaptador:
    def conversor(self,conector1,tomada1):

        # chamando os métodos da classe ConectorTresPinos para "conectar" os pinos
        conector1.setterp1(True)
        conector1.setterp2(True)

        # chamando os métodos da classe TomadaDuasEntradas para "conectar" os pinos
        tomada1.settere1(True)
        tomada1.settere2(True)
