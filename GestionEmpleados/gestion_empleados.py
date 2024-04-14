# Añadir empleados
def añadir_empleados(nombre, apellido, edad, archivo):
    with open(archivo, 'a') as file:  # Abrir el archivo en modo de adición ('a')
        file.write(f"{nombre},{apellido},{edad}\n") 

# Buscar empleados
def buscar_empleados(nombre, archivo):
    with open(archivo, 'r') as file: # Abrir el archivo en modo de lectura
        for line in file: # Iterar sobre cada línea del archivo
            empleado = line.strip().split(',')
            if empleado[0] == nombre:
                return empleado
    return None

# Listar empleados
def listar_empleados():

# Mostrar menu
def mostrar_menu():
    print("\n1. Añadir empleado")
    print("2. Buscar empleados")
    print("3. Listar empleados")
    print("4. Salir")
