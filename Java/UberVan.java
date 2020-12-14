import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String>seatsMaterial;

    //Colocando el constructor con la clase padre Car
    public UberVan(String license,Account driver,Map<String, Map<String, Integer>> typeCarAccepted,ArrayList<String>seatsMaterial){
        super(license, driver);
        this.typeCarAccepted= typeCarAccepted;
        this.seatsMaterial= seatsMaterial;

       
    }
}