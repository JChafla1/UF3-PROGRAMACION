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
            nombre = input("Introduce el nombre del empleado a buscar: ")
            empleado_encontrado = gestion_empleados.buscar_empleados(nombre, "empleats.txt")
            if empleado_encontrado:
                print(f"Empleado: {', '.join(empleado_encontrado)}")
            else:
                print(f"No se encuentra al empleado: {nombre}")


        elif opcion == "3":
            # Listar empleados
            print("\nLlistat d'empleats:")
            empleados = gestion_empleados.listar_empleados("empleats.txt")
            for empleado in empleados:
                print(', '.join(empleado))

        elif opcion == "4":
            print("Adios!")
            break

        else:
            print("Opcion no valida. Selecciona una opcion valida.")

if __name__ == "__main__":
    main()
