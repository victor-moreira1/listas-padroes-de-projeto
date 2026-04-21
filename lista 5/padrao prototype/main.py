from carro_basico import CarroBasico
from prototype import Prototype

def main():

    carro = CarroBasico("SUV","rosa","1.0")
    carroCopia = Prototype.clone(carro)

    print(f"Carro original: Modelo = {carro.modelo}, Cor = {carro.cor}, Motor = {carro.motor}")
    print(f"Carro prototipo: Modelo = {carroCopia.modelo}, Cor = {carroCopia.cor}, Motor = {carroCopia.motor}")

    if __name__ == "main":
        main()