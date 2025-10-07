import time

class Circulo:
    def __init__(self, radio, color):
        self.radio = radio
        self.color = color
        
        # --- SIMULACIÓN DE UNA OPERACIÓN COSTOSA ---
        # Imagina que esto es cargar texturas, calcular vértices, etc.
        print(f"Creando un círculo de color {self.color} (operación costosa)...")
        time.sleep(1) # Simulamos un retardo de 1 segundo

    def info(self):
        return f"Círculo de radio {self.radio} y color {self.color}"

class Rectangulo:
    def __init__(self, ancho, alto, color):
        self.ancho = ancho
        self.alto = alto
        self.color = color
        
        # --- SIMULACIÓN DE UNA OPERACIÓN COSTOSA ---
        print(f"Creando un rectángulo de color {self.color} (operación costosa)...")
        time.sleep(1)

    def info(self):
        return f"Rectángulo de {self.ancho}x{self.alto} y color {self.color}"


# --- CÓDIGO CLIENTE ---
if __name__ == "__main__":
    formas = []
    
    print("--- Iniciando creación de formas (método ineficiente) ---")
    start_time = time.time()
    
    # Necesitamos 3 círculos azules
    print("\nCreando 3 círculos azules...")
    for _ in range(3):
        formas.append(Circulo(10, "azul"))
        
    # Y 2 rectángulos rojos
    print("\nCreando 2 rectángulos rojos...")
    for _ in range(2):
        formas.append(Rectangulo(20, 15, "rojo"))
    
    end_time = time.time()
    
    print(f"\n--- Creación finalizada en {end_time - start_time:.2f} segundos ---")
    
    print("\nFormas creadas:")
    for forma in formas:
        print(f"- {forma.info()}")