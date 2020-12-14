class UberPool extends Car {
    String brand;
    String model;

    //Colocando el constructor con la clase padre Car
    public UberPool(String license,Account driver,String brand,String model){
        super(license, driver);
        this.brand=brand;
        this.model=model;


    }
}
