import gestion_empleados

def main():
    while True:
        gestion_empleados.mostrar_menu()
        opcion = input("Selecciona una opción: ")

        if opcion == "1":
            # Añadir empleado


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
