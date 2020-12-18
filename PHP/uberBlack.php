<?php
    require_once('car.php');
    class uberBlack extends Car{
        public $typeCarAccepted;
        public $seatsMaterial;

//Colocando el constructor de la clase
    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
      }

      
    }




?>