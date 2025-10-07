# 2_ejemplo_correcto/formas/implementaciones.py
import time
import copy
from .prototipo_forma import Forma # Importamos la clase base del mismo directorio

class Circulo(Forma):
    def __init__(self, radio, color):
        self.radio = radio
        self.color = color
        print(f"Creando prototipo de círculo color {self.color} (operación costosa)...")
        time.sleep(1)

    def clonar(self):
        print(f"Clonando círculo color {self.color} (operación rápida)...")
        return copy.deepcopy(self)

    def info(self):
        return f"Círculo de radio {self.radio} y color {self.color}"

class Rectangulo(Forma):
    def __init__(self, ancho, alto, color):
        self.ancho = ancho
        self.alto = alto
        self.color = color
        print(f"Creando prototipo de rectángulo color {self.color} (operación costosa)...")
        time.sleep(1)

    def clonar(self):
        print(f"Clonando rectángulo color {self.color} (operación rápida)...")
        return copy.deepcopy(self)

    def info(self):
        return f"Rectángulo de {self.ancho}x{self.alto} y color {self.color}"