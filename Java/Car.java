 class Car {
        Integer id;
        String license;
        Account driver;
        Integer passegenger; 

        //Creando la clase principal.
        public Car(String licence,Account driver){
                this.license = licence;
                this.driver=driver;
        }
        
        //Metodo de impresion.
        void DataCar() {
                System.out.println("License:" + license  +'\n'+ "Name Driver:" + driver.name+'\n'+ "Passegenger:"+ passegenger);
                
        }  
}
