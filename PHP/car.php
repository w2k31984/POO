<?php
class Car{
    public $id;
    public $license;
    public $drive;
    public $passenger;
  //Colocando el constructor de la clase
    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }
    public function DataCar () {
        echo "License: $this->license Driver:".$this->driver->name;
    }
}
?>