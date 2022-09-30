const user = "AudreyL"
const pw = 1234

function verificar () {
    let usuario = document.getElementById("nombre").value
    let clave = document.getElementById("clave").value
    if (user == usuario && pw == clave){
        alert("Login Exitoso")
    }else{
        alert("Verifique los datos ingresados")
    }

}