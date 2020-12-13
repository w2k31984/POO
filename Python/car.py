class Car:
     id = int
     license = str
     driver = str
     passegenger = str

     #Metodo constructor para car.
     def __init__(self,license,driver):
          self.license =license
          self.driver =driver 