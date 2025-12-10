# practicaPrueba

practicaPrueba es una aplicación de Android desarrollada en Kotlin que muestra indicadores financieros. La interfaz de usuario está construida con Jetpack Compose y sigue los principios de diseño de Material Design.

## Características

*   **Autenticación de usuario:** La aplicación cuenta con un flujo de inicio de sesión para autenticar a los usuarios.
*   **Visualización de indicadores financieros:** Muestra indicadores económicos clave, como el valor de la UF, el Dólar y el Euro.
*   **Interfaz de usuario moderna:** La interfaz de usuario está construida con Jetpack Compose, lo que proporciona una experiencia de usuario fluida y moderna.
*   **Arquitectura MVVM:** La aplicación sigue el patrón de arquitectura Model-View-ViewModel (MVVM) para separar las preocupaciones y mejorar la mantenibilidad del código.

## Estructura del proyecto

El proyecto está organizado de la siguiente manera:

*   **`app`:** El módulo principal de la aplicación.
    *   **`src/main/java/com/example/practicaprueba`:** El código fuente de la aplicación.
        *   **`components`:** Componentes reutilizables de Jetpack Compose.
        *   **`network`:** Lógica de red para obtener los indicadores financieros.
        *   **`pages`:** Pantallas de la aplicación.
        *   **`viewmodel`:** ViewModels que exponen los datos a la interfaz de usuario.
        *   **`MainActivity.kt`:** La actividad principal y punto de entrada de la aplicación.
*   **`build.gradle.kts`:** El archivo de compilación de la aplicación, que define las dependencias y la configuración de compilación.

## Dependencias

El proyecto utiliza las siguientes dependencias clave:

*   **Jetpack Compose:** Para construir la interfaz de usuario.
*   **Coil:** Para cargar y mostrar imágenes.
*   **Retrofit y OkHttp:** Para realizar solicitudes de red.
*   **Lifecycle y ViewModel:** Para gestionar el ciclo de vida de la aplicación y el estado de la interfaz de usuario.
*   **Navigation Compose:** Para la navegación entre pantallas.

## Cómo empezar

Para compilar y ejecutar el proyecto, necesitarás Android Studio. Una vez que hayas clonado el repositorio, abre el proyecto en Android Studio y sincroniza los archivos de Gradle. Luego, puedes ejecutar la aplicación en un emulador o en un dispositivo físico.
