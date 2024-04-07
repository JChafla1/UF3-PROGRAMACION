import os

class BorrarArchivo:
    def __init__(self):
        # Leer ruta
        ruta = self.leer_ruta()
        # Mirar si existe
        if os.path.exists(ruta):
            if os.path.isfile(ruta):
                os.remove(ruta)
                print("El archivo ha sido eliminado correctamente.")
            elif os.path.isdir(ruta):
                self.vaciar_carpeta(ruta)
                print("La carpeta ha sido vaciada correctamente.")
        else:
            print("La ruta especificada no existe.")

    def leer_ruta(self):
        ruta = input("Escribe la ruta del fichero o carpeta existente: ")
        return ruta
    
    def vaciar_carpeta(self, carpeta):
        for root, dirs, files in os.walk(carpeta, topdown=False):
            for file in files:
                os.remove(os.path.join(root, file))
            for dir in dirs:
                os.rmdir(os.path.join(root, dir))


# Instanciar la clase para que se ejecute automáticamente al ser importada
BorrarArchivo()
