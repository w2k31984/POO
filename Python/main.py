from car import Car
from account import Account

if __name__ =="__main__":
    print('Hola Mundo')
    car = Car("AMS234",Account("Andrea Medina","ANND23345753"))
    #car.license = "CMP234"
    #car.drive = "Christian Parada"

    #Imprimiendo los datos en pantalla
    print(vars(car.driver))

    #car2 = Car()
    #car2.license = "EYCF235"
    #car2.drive = "Evelyn Yamileth Chamul Flores"
    #print(vars(car2))