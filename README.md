# SAP_1

Esta simulacion esta desarrollada en JAVA, utilizando Maven como herramienta de gestion de dependencias y lombok para la generacion de las funciones Getter y Setter


## OBJETIVO

Presentar las actividades que deben realizar usuarios para realizar la ejecución del simulador de SAP-1


## ALCANCE

La presente Guía abarca las actividades que debe realizar el usuario para realizar el cargue de la memoria RAM y ejecutar la simulación.


# MANUAL DE USUARIO

### Cargar memoria

En la ventana de carga inicial de SAP – 1, deberá dar clic en el botón cargar programa, con el fin de realizar el cargue a la memoria RAM como primer paso antes de iniciar la simulación. 

El programa muestra la pantalla de Carga de Memoria, en dónde se dan dos opciones: 

### Cargar memoria Manualmente

La primera opción es cargar la memoria manual, deberá hacer clic en cada una de las posiciones de memoria para seleccionar la instrucción o ingresar el dato.

Cuando se hace clic en cualquier de las posiciones, se despliega la sección que contiene dos pestañas, una que es una instrucción y otra llamada dato:   

### Escoger instrucción

Si desea seleccionar una instrucción, haga clic en la lista desplegable en el campo Seleccione instrucción. Se desplegará la lista, y escoja una opción.

Cada instrucción tiene una función, a continuación, se explica cada una: 

- ADD: Coloca en el registro A, el resultado de la suma entre lo anteriormente almacenado en A con lo que se encuentra almacenado en la posición x de memoria
- SUB: Coloca en el registro A, el resultado de la resta entre lo anteriormente almacenado en A con lo que se encuentra almacenado en la posición x de memoria
- LDA: Coloca en el registro A, el valor que se encuentra almacenado en la posición x de memoria
- STA: Coloca en la posición x de memoria, lo que se encuentra en el registro A, escribiendo en ejecución dentro de la RAM
- LDI: El sistema mostrará la siguiente oración 'Palabra de control' durante la ejecución de un programa de control y que es generada por la unidad de control.
- JMP: Salta a la posición x de memoria
- JC: Salta a la posición x de memoria si y sólo si hay acarreo en la última operación realizada (a >= 0)
- JZ: Salta a la posición x de memoria si y sólo si hay un cero en la última operación realizada (a = 0)
- OUT: Muestra en el registro OUT lo que se encuentra en el registro A
- HLT: Fin del programa en ejecución.

Luego, escoja la posición de memoria que se relaciona con la instrucción seleccionada. 

Realice clic en cargar: 

El sistema carga la instrucción: 

### Agregar dato

La otra opción que e tiene, es insertar un dato numérico, escoja la opción de pestaña Dato: 

Ingrese un valor numérico en el campo ‘Ingrese dato numérico’: 

Realice clic en el botón ‘Cargar’: 

El sistema realiza el cargue de la memoria:

### Cargar programa estándar

Otra opción que el sistema brinda es Cargar un programa estándar, en vez de hacer la carga manualmente, para ello en la pantalla de cargar memoria, haga clic en el botón “Cargar programa estándar”:

~~~
0,LDA,13,0
1,ADD,14,0
2,SUB,15,0
3,JZ,6,0
4,OUT,0,0
5,HLT,0,0
6,LDI,5,0
7,STA,15,0
8,JMP,0,0
13,vacio,0,5
14,vacio,0,10
15,vacio,0,15
~~~

Se muestra otra ventana para que se escoja un programa de los 3: 

Se tienen los siguientes programas: 

Multiplicación
Suma
Suma con salto: Este programa usa un salto con cero, asignación directa al registro A.

El sistema carga la memoria con la representación binaria. 

Luego de cualquier opción realizada, guarde la memoria con el botón ‘Guardar Memoria’ que lo llevará a la pantalla inicial. 

Pantalla inicial con el cargue de la memoria:

### Limpiar memoria

Si requiere cambiar el programa cargado o iniciar el proceso nuevamente, puede limpiar la memoria, presione el botón ‘Limpiar Memoria’

El sistema limpia la memoria para que se haga de nuevo el proceso de cargue de la memoria.

### Ejecutar simulación 

### Play

Luego de cargar la memoria, en la pantalla de inicio realice clic en el botón ‘Play’ para iniciar la simulación y este continuará hasta terminar con todos los ciclos de reloj. 

### Pausar

Mientras la simulación se esté ejecutando, si requiere dar pausa la simulación, realice clic en el botón “Pause”, este finalizará el ciclo de reloj en el que se encuentra, y se detendrá la simulación:

### Reanudar

Si quiere continuar con la simulación, presione el botón “Resume” y la simulación continuará hasta que finalice. 

### Detener

Si requiere detener la simulación, presiona el botón “Stop”, este terminará con la simulación en dónde se encuentra ejecutando.

El sistema detiene el proceso totalmente: 

### Ajustar velocidad simulación

Durante la simulación, puede cambiar la velocidad de la misma, para ello puede mover o desplazar la barra o slide del control de velocidad, aumentando la velocidad hacia la derecha o disminuyendo hacia la izquierda: 
