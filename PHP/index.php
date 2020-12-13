<?php
include_once ('Account.php');
include_once ('Car.php');

$car = new Car("LIC21", new Account("Jorge García","INE21"));
$car->imprimeAuto();

?>