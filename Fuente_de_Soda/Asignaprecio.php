<?php
// asignacion de precios
$ensalada=10;
$jugo=13;
$helado=7;
$sandwich=25;
//capturar el nombre del cliente
$cliente = $_POST['txtCliente'];

// capturar las cantidades solicitadas
$cantidadEns = $_POST['txtEnsalada'];
$cantidadJug = $_POST['txtJugo'];
$cantidadHel = $_POST['txtHelado'];
$cantidadSan = $_POST['txtSandwich'];
//calcular subtotales
$subtotalEns=$ensalada*$cantidadEns;
$subtotalJug=$jugo*$cantidadJug;
$subtotalHel=$helado*$cantidadHel;
$subtotalSand=$sandwich*$cantidadSand;
//totales
$total=$subtotalEns+$jugo+$subtotalHel+$subtotalSand;

?>

