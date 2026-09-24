<?php

    //1) Receber os dados do form
    $nome = $_POST['nome'];
    $descricao = $_POST['descricao'];
    $codigo = $_POST['codigo'];
    $modelo = $_POST['modelo'];
    $quantidade = $_POST['quantidade'];
    $status = $_POST['status'];

    //2) Conectando com o BD
    $con = mysqli_connect('localhost','root','','fatequinha');

    //3) Query para inserir
    $consulta = "INSERT INTO equipamento(
      nome,descricao,codigo,modelo,quantidade,situacao)
      VALUES('$nome','$descricao','$codigo','$modelo',
      $quantidade,'$status')";

    //4) Executando a query
    mysqli_query($con,$consulta);

      

?>