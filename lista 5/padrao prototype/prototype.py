class Prototype:
    def __init__(self,car):
        self.modelo = car.modelo
        self.cor = car.cor
        self.motor = car.motor
    def clone(self):
        return self
