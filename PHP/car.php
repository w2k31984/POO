<?php
class Car{
    public $id;
    public $license;
    public $drive;
    public $passenger;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }
    public function imprimeAuto () {
        print_r($this);
    }
}
?>