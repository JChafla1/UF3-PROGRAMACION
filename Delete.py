import os

class BorrarArchivo:
    def __init__(self):
        # Leer ruta
        ruta = self.leer_ruta()
        # Mirar si existe
        if os.path.isfile(ruta):
            # Si existe, eliminar
            os.rename(ruta)
            print("El archivo ha sido eliminado correctamente.")
        else:
            print("El fichero no existe")

    def leer_ruta(self):
        ruta = input("Escribe la ruta del fichero existente: ")
        return ruta


# Instanciar la clase para que se ejecute automáticamente al ser importada
BorrarArchivo()
