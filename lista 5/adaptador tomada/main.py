from conector_tres_pinos import ConectorTresPinos
from tomada_duas_entradas import TomadaDuasEntradas
from adapter import Adaptador

def main():
    conector1 = ConectorTresPinos(False,False,False)
    tomada1 = TomadaDuasEntradas(False,False)

    print(f"O conector1 antes de se conectar ao adaptador: Pino 1 = {conector1.p1}, Pino 2 = {conector1.p2}, Pino 3 = {conector1.p3}.")
    print(f"A tomada1 antes de se conectar ao adaptador: Entrada 1 = {tomada1.e1}, Entrada 2 = {tomada1.e2}.")

    Adaptador.conversor(conector1,tomada1)

    print(f"O conector1 após se conectar ao adaptador: Pino 1 = {conector1.p1}, Pino 2 = {conector1.p2}, Pino 3 = {conector1.p3}.")
    print(f"A tomada1 após se conectar ao adaptador: Entrada 1 = {tomada1.e1}, Entrada 2 = {tomada1.e2}.")
    
    if __name__ == "main":
        main()