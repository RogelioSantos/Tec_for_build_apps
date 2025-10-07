# 2_ejemplo_correcto/main.py
from formas.implementaciones import Circulo, Rectangulo # Importamos las clases concretas

# El Registro de Prototipos puede vivir aquí o en su propio archivo.
class PaletaDeFormas:
    def __init__(self):
        self._prototipos = {}
    
    def agregar_prototipo(self, nombre, prototipo):
        self._prototipos[nombre] = prototipo
        
    def obtener_clon(self, nombre):
        prototipo = self._prototipos.get(nombre)
        return prototipo.clonar()

# --- Código Cliente ---
if __name__ == "__main__":
    print("--- Inicializando paleta de prototipos ---")
    paleta = PaletaDeFormas()
    
    # Creamos los prototipos una sola vez
    paleta.agregar_prototipo("circulo_azul", Circulo(10, "azul"))
    paleta.agregar_prototipo("rectangulo_rojo", Rectangulo(20, 15, "rojo"))
    
    print("\n--- Paleta lista. Iniciando clonación ---")
    
    # Clonamos los objetos de forma eficiente
    c1 = paleta.obtener_clon("circulo_azul")
    c2 = paleta.obtener_clon("circulo_azul")
    r1 = paleta.obtener_clon("rectangulo_rojo")
    
    print("\nFormas creadas por clonación:")
    print(c1.info())
    print(c2.info())
    print(r1.info())