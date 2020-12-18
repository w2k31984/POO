<?php
//Llamando nuestras clases.
require_once('car.php');
require_once('uberX.php');
require_once('account.php');

//creando un objeto para uberX
$uberX = new uberX("CVB2345",new account("Carlos Valle Barrios","CVB080984123-6"),"Chevrolet", "Spark 2015");

//Imprimiendo en pantalla.
$uberX->DataCar();

//include_once ('Account.php');
//include_once ('Car.php');

//$car = new Car("LIC21", new Account("Jorge García","INE21"));
//$car->imprimeAuto();

?>