[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/mWHhzJDI)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=12873890&assignment_repo_type=AssignmentRepo)

# README de Tarea 3-Calculadora
## Felipe Ramirez Alondra Navila. Correo: alondrafrz@ciencias.unam.mx No. de Cuenta: 320220618
## Mendiola Montes Víctor Manuel. Correo: victor_mendiola@ciencias.unam.mx No. de Cuenta: 320197350

### Compilación y ejecución del programa.

Primero debemos clonar o descargar la carpeta "tarea-3-calculadora-haku-y-chihiro". Al ingresar a la carpeta, nos
vamos a dirigir hacia la carpeta "src" y adentro vamos a compilar el archivo "CalculadoraIG.java" con el 
siguiente comando `$ javac CalculadoraIG.java`. El siguiente paso para ejecutar el programa será escribir
`$ java CalculadoraIG`, lo cual nos abrirá la ventana con la calculadora con Interfaz Grafica (IG). 

### Modificaciones en los archivos.

Lo primero que hicimos fue crear (de manera un tanto analoga) 4 archivos nuevos para agregar las cuatro nuevas operaciones
que teniamos como requerimiento en la tarea : "NodoSeno.java", "NodoCoseno.java", "NodoTangente.java" y "NodoRaiz.java". 
Estos vienen con mayor precedencia que los operadores que ya estaban creados, pero menores que los parentesis.

Al archivo "NodoParentesis.java" le modificamos la precedencia para que tuviera la mayor precedencia de toda la calculadora.

En el archivo "NodoOperador.java" agregamos en el método factoryMethod las 4 clases que acabamos de agregar.

En "Compilador.java" también hicimos algunos cambios para que aceptará nuestros nuevos 4 archivos.

Por último, agregamos la clase "CalculadoraIG.java" que es la que tiene toda la Interfaz Grafica de la calculadora e incluye
todas sus funciones.

### Uso de la calculadora.

Podemos compilar también la clase "Calculadora.java" y modificar el método main cada vez que quisieramos cambiar de 
función, pero sería poco practico ya que el programa no es robusto. Si compilamos y ejecutamos como dice en la parte de 
arriba nos saldrá una ventana con una calculadora convencional. 

Tendremos botones y una linea blanca donde se irá  escribiendo nuestra operación y saldrá el resultado. Se siguen las 
jerarquias de operaciones y podemos escribir cualquier operación con nuestros operadores basicos. La sintaxis correcta para
hacer uso de las razones trigonometricas es "cos(n)", sin"(n) y "tan(n)", siendo 'n' el valor que queremos evaluar. Para la 
raiz cuadrada tenemos dos sintaxis: 

1- Si tenemos solo un valor a evaluar usaremos "√n".

2- si tenemos una expresión mas compleja 'm', es decir, de mas de un valor, escribimos "√(m)"

Por último. El boton "C" borrará absolutamente todo lo que se encuentre en la línea de texto superior y el boton
"CE" borrará solo un caracter de nuestra función escrita.

