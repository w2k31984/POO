
class Main {
  public static void main(String[] args) {
    //System.out.println("Hola Mundo soy Christian");
//Creando metodo constructor de clase car.
     Car car = new Car(); 
     car.license="PJQ34-21";
     car.driver="Christian Parada";
     car.passegenger=4;
//Imprimiendo datos de car con el metodo en la clase.
    car.DataCar();
    /*
     * System.out.println("Car License:"+ car.license);
     * System.out.println("Car Driver:"+ car.driver);
     * System.out.println("Car Passegenger capacity:"+ car.passegenger);
     */

    // Creando metodo constructor de clase car2.
    Car car2 = new Car();
    car2.license = "QWE567";
    car2.driver = "Andrea Herrera";
    car2.passegenger = 3;
    // Imprimiendo datos de car2.
    car2.DataCar();
     /*System.out.println("Car License:"+ car2.license);
     System.out.println("Car Driver:"+ car2.driver);
     System.out.println("Car Passegenger capacity:"+ car2.passegenger); */     
    }  
}