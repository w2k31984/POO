 class Car {
        Integer id;
        String license;
        Account driver;
       //Colocando modificador de acceso de la clase Car
        private Integer passegenger; 
      
        
        //Creando la clase principal.
        public Car(String licence,Account driver){
                this.license = licence;
                this.driver=driver;
                //passegenger=4;
               // System.out.println("Passenger:"+ passegenger);
        }
        
        //Metodo de impresion.
        void DataCar() {
                //Vamos a mostrar solo cuando el dato sea 4 caso contrario solo mostrara el mensaje.
               if(passegenger != null){
                System.out.println("License:" + license  +'\n'+ "Name Driver:" + driver.name+'\n'+ "Passegenger:"+ passegenger);
               }
        }  

        //Creando los metodos constructores, primero se crea el metodo Getters
        public Integer getPassenger(){
                return passegenger;
        }

        public void setPassenger(Integer passeger){
        //Validando para que se pueda cambiar el dato de la variable.
        if(passeger==4){
           this.passegenger= passeger;
          }else{
                   System.out.println("Necesita asignar 4 pasajeros.");
          }
        }
}
