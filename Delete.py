import os

# Codigo reciclado del primer ejercico
class BorrarArchivo:
    def __init__(self):
        # Leer ruta
        ruta = self.leer_ruta()
        # Mirar si existe
        if os.path.isfile(ruta):
            # Si existe, quitar extension
            ruta_sin_extension = quitar_extension(ruta)
            os.rename(ruta, ruta_sin_extension)
        else:
            print("El fichero no existe")

    def leer_ruta(self):
        ruta = input("Escribe la ruta del fichero existente: ")
        return ruta
    

# Instanciar la clase para que se ejecute automáticamente al ser importada
BorrarArchivo()
