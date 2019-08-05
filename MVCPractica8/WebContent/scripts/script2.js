// paso 1 crear la variable
var xhr = new XMLHttpRequest();

window.onload = function() {
	document.querySelector("#btnMensaje").addEventListener("click",
			enviarPeticionAsincrona);
}

function enviarPeticionAsincrona() {
	var miNum1 = document.getElementById("number1");
	var miNum2 = document.getElementById("number2");
	console.log(miNum1);
	console.log(miNum2);
	// paso 2 abrir conexion
	xhr.open("GET", "SumaServlet?number1=" + miNum1.value + "&number2="+miNum2.value);
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