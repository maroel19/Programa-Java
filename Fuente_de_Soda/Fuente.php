 <!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link href="estilo.css" rel="stylesheet">
        
    </head>
    <body>
        <?php
        // put your code here
        ?>
    </body>
    <header>
        <?php                include('encabezado.php');?>
    </header>
    <section> 
    <?php
    //omitir los errores de advertencia e incluir el archivo asignarPrecio.php
    error_reporting(0);
    include 'AsignaPrecio.php';
    ?>
        <form name="frmHelados" action="helados.php"method="POST">
            <table border="1" widht="770" cellspacing="1" cellpadding="1">
                <tr>Cliente</tr>
                <td colspan="3">
                    <input type="text" name="txtcliente" size="104"
                           value="<?php                               echo $cliente;?>"/>
                    
                </td>
                <tr>
                <td id="fila">Lista de productos</td>  
                <td id="fila">Cantidad </td>
                <td id="fila">Precio </td>
                <td id="fila">Subtotal </td>


                </tr>  
                <tr>
                    <td>Ensalada</td>
                    <td><input type="text" name="txtEnsalada"
                               value="<?php                                   echo $cantidadEns;?>"/>
                    </tr>
                    <td><?php echo '$'. number_format($ensalada,2);?></td>
                    <td><?php echo '$'. number_format($subtotalEns,2);?></td>
                </tr>
                <tr>
                    <td>Jugo</td>
                    <td><input type="text" name="txtJugo"
                               value="<?php                                   echo $cantidadJug;?>"/>
                    </tr>
                    <td><?php echo '$'. number_format($jugo,2);?></td>
                    <td><?php echo '$'. number_format($subtotalJug,2);?></td>
                </tr>
                <tr>
                    <td>Helado</td>
                    <td><input type="text" name="txtHelado"
                               value="<?php                                   echo $cantidadHel;?>"/>
                    </tr>
                    <td><?php echo '$'. number_format($helado,2);?></td>
                    <td><?php echo '$'. number_format($subtotalHel,2);?></td>
                </tr>
                <tr>
                    <td>Sandwich</td>
                    <td><input type="text" name="txtSandwich"
                               value="<?php                                   echo $cantidadEns;?>"/>
                    </tr>
                    <td><?php echo '$'. number_format($sandwich,2);?></td>
                    <td><?php echo '$'. number_format($subtotalSand,2);?></td>
                </tr>
            </table>
            
        </form>
    </section>
</html>
