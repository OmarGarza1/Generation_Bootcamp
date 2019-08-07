// paso 1 crear la variable
let xhr = new XMLHttpRequest();

window.onload = function()
{
	console.log("Estamos dentro del function");
	var miBoton = document.querySelector("#btnPotencia").addEventListener("click", enviarAjax);
	//miBoton.onclick = enviarAjax;
}

function enviarAjax() {
	console.log("Estamos dentro del enviarAjax");
	// paso 2 abrir la conexion
	xhr.open("POST", "CalcularPotenciaServlet");
	var miFormita = new FormData();
	var miBase = document.getElementById("txtBase").value;
	var miPotencia = document.getElementById("txtPotencia").value;
	miFormita.append("txtBase", miBase);
	miFormita.append("txtPotencia", miPotencia);
	
	// paso 3 cargamos la funcion en el metodo on load
	xhr.onload = funcionCallBack;
	
	// paso 4 enviar el ajax
	xhr.send(miFormita);
}


function funcionCallBack()
{
	console.log("Estamos dentro del call back");
	if(xhr.status == 200)
	{
		document.getElementById("divRes").innerHTML += xhr.responseText; 
	}	
}
