from medidor_temperatura import MedidorTemperatura
from observer import Observers

def main():
    medidor = -1
    while medidor < 0:
        medidor = MedidorTemperatura()
        medidor.mudanca_temp()
        Observers.busca_mudanca(medidor)
        if __name__ == "main":
            main()