from car import Car
if __name__ =="__main__":
    print('Hola Mundo')
    car = Car()
    car.license = "CMP234"
    car.drive = "Christian Parada"

    #Imprimiendo los datos en pantalla
    print(vars(car))

    car2 = Car()
    car2.license = "EYCF235"
    car2.drive = "Evelyn Yamileth Chamul Flores"
    print(vars(car2))