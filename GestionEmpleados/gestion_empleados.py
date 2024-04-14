# Añadir empleados
def añadir_empleados(nombre, apellido, edad, archivo):
    with open(archivo, 'a') as file:  # Abrir el archivo en modo de adición ('a')
        file.write(f"{nombre},{apellido},{edad}\n") 

# Buscar empleados
def buscar_empleados():

# Listar empleados
def listar_empleados():

