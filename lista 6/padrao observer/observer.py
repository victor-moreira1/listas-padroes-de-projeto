class Observers:
    def __init__(self):
        # armazena usuários interessados nessa mudança
        pass

    def busca_mudanca(self,medidor):
        if medidor.mudanca_temp() == True:
            print("Houve mudança na temperatura.")
        else:
            # nada acontece
            pass
