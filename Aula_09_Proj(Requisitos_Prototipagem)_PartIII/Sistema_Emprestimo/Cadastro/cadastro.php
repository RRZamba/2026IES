<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Listinha</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>

<body>

<div class="container">

    <!-- Painel  -->
    <div class="bg-light rounded-3 shadow-sm">
        <div class="container-fluid">
            <h1>Listagem de Equipamentos</h1>
            <p>Equipamentos fofos!!!</p>
        </div>
    </div>

    <!-- Navegação -->
    <ul class="nav nav-tabs mb-3">
       <li class="nav-item">
            <a class="nav-link" href="#">
                Listagem
            </a>
       </li> 

       <li class="nav-item">
            <a class="nav-link active" href="#">
                Cadastro
            </a>
       </li> 

       <li class="nav-item">
            <a class="nav-link" href="#">
                ADM
            </a>
       </li>        
    </ul>

    <!-- Formulário -->
    <form action="_cadastro.php" method="POST">
        <div class="form-group">
            <label>
                Nome
            </label>
            <input type="text" name="nome" class="form-control">
        </div>    

       <div class="form-group">
            <label>
                Descrição
            </label>
            <input type="text" name="descricao" class="form-control">
        </div>   

        <div class="form-group">
            <label>
                Código
            </label>
            <input type="text" name="codigo" class="form-control">
        </div>  

        <div class="form-group">
            <label>
                Modelo
            </label>
            <input type="text" name="modelo" class="form-control">
        </div>  

        <div class="form-group">
            <label>
                Quantidade
            </label>
            <input type="text" name="quantidade" class="form-control">
        </div>  

        <div class="form-group">
            <label>
                Status
            </label>
            <input type="text" name="status" class="form-control">
        </div>  

        <a href="../Lista/lista.php" class="btn btn-primary">
            Cancelar
        </a>

        <button class="btn btn-primary" type="submit">
            Cadastrar
        </button>

        
        
    
    

    </form>


</div>

</body>
</html>