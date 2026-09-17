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
            <a class="nav-link active" href="#">
                Listagem
            </a>
       </li> 

       <li class="nav-item">
            <a class="nav-link" href="#">
                Cadastro
            </a>
       </li> 

       <li class="nav-item">
            <a class="nav-link" href="#">
                ADM
            </a>
       </li>        
    </ul>


    <!-- Visualização do equipamento -->
    <div class="card shadow-sm">
        <div class="card-header">
            <h4>Editar: DataShow</h4>
        </div>

        <div class="row">
            <div class="col-md-5" text-center>
                <img src="../imagens/datashow.jpg" 
                    class="img-fluid rounded"></img>
            </div>  
            <div class="col-md-7">
                <form action="_editar.php" method="POST">
                    
                    <!-- Código -->
                    <label>
                        Código
                    </label>  
                    <input type="text" class="form-control"
                     value="123456" name="codigo">

                     <!-- Nome -->
                    <label>
                        Nome
                    </label>  
                    <input type="text" class="form-control"
                     value="Datashow" name="nome">
                    

                </form>
                
            </div> 



        </div>    
    </div>
</div> 










</div>

</body>
</html>