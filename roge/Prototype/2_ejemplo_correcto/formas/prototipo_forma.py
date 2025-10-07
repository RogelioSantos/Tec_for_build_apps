# 2_ejemplo_correcto/formas/prototipo_forma.py
from abc import ABC, abstractmethod

class Forma(ABC):
    """
    Esta es la interfaz del Prototipo. Declara el método de clonación.
    """
    @abstractmethod
    def clonar(self):
        pass
        
    @abstractmethod
    def info(self):
        pass