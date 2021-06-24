fun main(){
   saludar()
   sesion()
   //opcionesIniciales()
   //menuServicios()

}
var user: String = ""
var pass: String = ""
var correo: String = ""

val usuario: MutableList<String> = mutableListOf()
val contrasena: MutableList<String> = mutableListOf()
val email: MutableList<String> = mutableListOf()

fun saludar(){
   println("------------------------------------------------------------")
   println("----------------Bienvenido a BeatyFinder--------------------")
   println("------------------------------------------------------------")
}

fun sesion(){
   println("Selecciona una opción: ")
   println("1 - Iniciar Sesión")
   println("2 - Registrarse")
   val x= readLine()!!.toInt()
   when(x){
       1->{
           iniciarSesion()
           validarusuario()
           println("##### Hola $user has iniciado sesión #####")
       }
       2->{
           registarUsuario()
           verifyAge()
           sesion()
       }
       else->sesion()

   }
}

fun iniciarSesion(){
   println("Iniciar Sesión")
   println("Favor de ingresar tus datos para iniciar sesión.")
   println("Usuario:")
   user=readLine()?.toString() as String
   println("Contraseña:")
   pass=readLine()?.toString() as String
}

fun registarUsuario(){
   println("Registrarse")
   println("Usuario:")
   user=readLine()?.toString() as String
   usuario.add("$user")

   println("Correo electrónico:")
   correo=readLine()?.toString() as String
   email.add("$correo")

   println("Contraseña:")
   pass=readLine()?.toString() as String
   contrasena.add("$pass")
   usuario
   email
   contrasena
}

fun verifyAge(){
   println("Ingresa tu edad (escribe sólo el número):")
   val age= readLine()!!.toInt()
   if (age >= 18){
       println(" ----¡Felicidades! Has creado tu cuenta ----")
   } else {
       println("---- Debes ser mayor de edad para crear una cuenta ----")
   }
}

fun validarusuario(){
   if(usuario == usuario.filter{it == "$user"}){
   }
   if(contrasena == contrasena.filter{it == "$pass"}){
   }else{
       println("Datos incorrectos")
       sesion()
   }
}


 













fun main(){
	saludar()
	opcionesIniciales()
menuServicios()	

}

fun saludar(){
    println("------------------------------------------------------------")
    println("------------------------Bienvenidx--------------------------")
    println("------------------------------------------------------------")
    println("")
}

fun opcionesIniciales(){
	   println("####Usuario ingresó al menú principal####")
	   println("1 - Iniciar Sesión")
   println("2 - Registrarse") 
   println("Selecciona una opción: ")   
   val option= readLine()!!.toInt()
   println("")
   if (option == 1){ 
	println("#### Usuario seleccionó opción 1 - Iniciar Sesión####")
	iniciarSesion()
   } else {
	println("#### Usuario seleccionó opción 2 - Registrarse####")
	usuarioIngresar()
println("Ingresa tu correo electrónico:")
val correo=readLine()
passwordIngresar()
verifyAge()
   } 
}

fun usuarioIngresar(){
	println("Ingresa tu nombre de usuario:")
 	val user=readLine()
}

fun passwordIngresar(){
	println("Ingresa tu contraseña:")
val pass = readLine()
}
		
	fun verifyAge(){
		println("Ingresa tu edad (escribe sólo el número):")
		val age= readLine()!!.toInt()
		if (age >= 18){

		println(" ----¡Felicidades! Has creado tu cuenta ----")
		iniciarSesion()
		print
		} else {
			println(“---- Debes ser mayor de edad para crear una cuenta ----”)
			opcionesIniciales()
}
}


fun iniciarSesion(){
	println("Favor de ingresar tus datos para iniciar sesión.")
usuarioIngresar()
	passwordIngresar()
}

	// Seleccionar opción 
	fun menuServicios(){
		println("")
println("--------------------------------")
println("1 - Buscar Servicio")
println("2 - Ofrecer Servicio")
println("---- Selecciona una opción: ----")
val a = readLine()!!.toInt()
when(a){
			1-> println(“-----Busco servicio----”)
				if(a == 1){
					println(“Selecciona el servicio que estás buscando”)
					when(n){
	1-> println(“Deporte”)
	2-> println(“Ropa”)
	3-> println(“Manicure”)
	3-> println(“”)
	else-> println(“Selecciona una opción válida”){
	retorno
}
}
			2->print(“Ofrezco Servicio”)
				when(n){
	1-> print(“Deporte”)
	2-> print(“Ropa”)
	3-> print(“Manicure”)
	3-> print(“Otro”)
		if(n == 3){
		println(“Escribe el tipo de categoría”)
	val categoria= readLine()
		}
	else-> println(“Regreso a seleccionar opción”)
		retorno
}

}						

}

fun

-------------------------


fun totalServiceCost (){ // sacarlo de la Sesión1)


Iniciar sesión
Usuario
			val user= readLine()
			
		Contraseña
			val pass= readLine()


	Registrarse
		Usuario
			val user= readLine()

		Correo
			val correo=readLine()
		
		Contraseña
			val pass= readLine()



fun buscoServicio(){
println(“Selecciona el servicio que estás buscando y da enter:”)
//¿Aquí podríamos tener una lista? 
val a = readLine()?.toInt()

when(a) { 
}
}
-------

		Busco servicio
		Ofrezco servicio
		val a = int
		val n = int

		val a, n = readLine()?.toInt()

		when(a){
			1-> print(“Busco servicio”)
				if(a == 1){
					println(“Selecciona el servicio que está buscando”)
					when(n){
	1-> print(“Deporte”)
	2-> print(“Ropa”)
	3-> print(“Manicure”)
	3-> print(“”)
	else-> print(“Regreso a seleccionar opción”){
	retorno
}
}
			2->print(“Ofrezco Servicio”)
				when(n){
	1-> print(“Deporte”)
	2-> print(“Ropa”)
	3-> print(“Manicure”)
	3-> print(“Otro”)
		if(n == 3){
		println(“Escribe el tipo de categoría”)
	val categoria= readLine()
		}
	else-> println(“Regreso a seleccionar opción”)
		retorno
}

}						

	Prender Ubicación
		var op = 1
		println(“¿Desea encender su ubicación?”)
			while(op < 2){
	if (op  == 1) {
		println(“Se activó correctamente su ubicación”)
}
op++
}
		println(“No ha sido posible conectar su dispositivo”)


	Categorías
	println(“Selecciona el servicio que estás buscando”)
