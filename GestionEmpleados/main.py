import gestion_empleados

def main():
    while True:
        gestion_empleados.mostrar_menu()
        opcion = input("Selecciona una opción: ")

        if opcion == "1":
            # Añadir empleado
            nombre = input("Introduce el nombre del empleado: ")
            apellido = input("Introduce el apellido del empleado: ")
            edad = input("Introduce la edad del empleado: ")
            gestion_empleados.añadir_empleados(nombre, apellido, edad, "empleats.txt")
            print("Empleado añadido correctamente.")

        elif opcion == "2":
            # Buscar empleados


        elif opcion == "3":
            # Listar empleados

        elif opcion == "4":
            print("Adios!")
            break

        else:
            print("Opcion no valida. Selecciona una opcion valida.")

if __name__ == "__main__":
    main()
