from flyweight import FlyweightFactory
from flyweight import FlyweightAbstrato

class Cliente:
    caractere = "Nada"
    while caractere != "":
        caractere = FlyweightFactory.digita_caractere()
        FlyweightFactory.move_para_proximo()
        FlyweightAbstrato.setter_carac_abs()