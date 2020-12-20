
class Main {
  public static void main(String[] args) {
    //System.out.println("Hola Mundo soy Christian");
//Creando metodo constructor de clase car.
     UberX uberX = new UberX("PJQ34-21", new Account("Christian Parada", "CMP1243"), "Chevrolet","Sonic"); 
     uberX.setPassenger(4);
     //uberX.passegenger=4;
//Imprimiendo datos de car con el metodo en la clase.
    uberX.DataCar();
     
    /*
     * System.out.println("Car License:"+ car.license);
     * System.out.println("Car Driver:"+ car.driver);
     * System.out.println("Car Passegenger capacity:"+ car.passegenger);
     */

    // Creando metodo constructor de clase car2.
    //Car car2 = new Car("QWE567", new Account( "Andrea Herrera", "AND123"));
    //car2.passegenger = 3;
    // Imprimiendo datos de car2.
    //car2.DataCar();
     /*System.out.println("Car License:"+ car2.license);
     System.out.println("Car Driver:"+ car2.driver);
     System.out.println("Car Passegenger capacity:"+ car2.passegenger); */     
    }  
}