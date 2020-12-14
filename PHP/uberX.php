<?php
    class uberX extends Car{
        public $brand;
        public $model;

//Colocando el constructor de la clase
    public function __construct($license, $driver, $brand, $model){
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
      }

      
    }




?>