// paso 1 crear la variable
var xhr = new XMLHttpRequest();

window.onload = function() {
	document.querySelector("#btnMensaje").addEventListener("click",
			enviarPeticionAsincrona);
}

function enviarPeticionAsincrona() {
	var miMensaje = document.getElementById("txtMensaje");
	console.log(miMensaje);
	// paso 2 abrir conexion
	xhr.open("GET", "MostrarMensajeServlet?txtMensaje=" + miMensaje.value);
	xhr.onload = functionCallBack;
	// paso 3 mandar info
	xhr.send(null);
}
// paso 4 crear funcion call back
function functionCallBack() {
	if (xhr.status == 200) {
		document.getElementById("divRes").innerHTML += xhr.responseText;
	}
}