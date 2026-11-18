# Gestor de tareas en Java

Aplicación de consola desarrollada en **Java 21** que permite gestionar tareas mediante un menú interactivo. El proyecto utiliza programación orientada a objetos, colecciones y persistencia de datos en archivos.

## Funcionalidades

- Mostrar todas las tareas.
- Añadir tareas con nombre y descripción.
- Marcar tareas como completadas.
- Eliminar tareas.
- Guardar automáticamente los cambios en un archivo local.
- Recuperar las tareas guardadas al iniciar el programa.

## Tecnologías y conceptos utilizados

- Java 21.
- Programación orientada a objetos (POO).
- Clases, objetos, atributos y métodos.
- Colecciones mediante `ArrayList`.
- Manejo de excepciones (`try-catch`).
- Lectura y escritura de archivos.
- Persistencia de datos mediante archivos de texto.

## Estructura del proyecto

```text
gestor-de-tareas/
├── .gitignore
├── README.md
└── src/
    ├── Main.java
    ├── Tarea.java
    ├── pruebatrycatch/
    └── PruebaArchivos.java
```

## Ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en un entorno compatible con Java 21.
3. Ejecutar la clase `Main`.
4. Utilizar el menú de consola para gestionar las tareas.

## Persistencia de datos

Las tareas se almacenan en el archivo `tareas.txt`. Cada tarea guarda su nombre, descripción y estado de finalización.

Al iniciar el programa, se recuperan automáticamente las tareas almacenadas. Los cambios se guardan en el archivo al añadir, completar o eliminar una tarea.

## Objetivo del proyecto

Este proyecto forma parte de mi aprendizaje progresivo de Java. Su objetivo es poner en práctica los fundamentos del lenguaje, la programación orientada a objetos, las colecciones, el manejo de excepciones y la persistencia de datos.