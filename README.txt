Configuración del Proyecto:

Framework: Serenity BDD
Build Tool: Gradle
IDE: IntelliJ IDEA
Java Version: 1.8

Archivos del Proyecto:
build.gradle para configurar las dependencias.
src/test/java para los tests en Serenity.
src/test/resources para archivos de configuración y datos de prueba.

Pasos para Ejecutar el Proyecto
1. Clona el repositorio en tu máquina local.
2. Navega a la carpeta raíz del proyecto.
3. Ejecuta el siguiente comando para compilar y correr las pruebas con gradle: gradlew clean test
4. Una vez finalizado, abre el reporte de Serenity ubicado en:
   build/reports/serenity/index.html
   (Haz doble clic y ábrelo con tu navegador, preferiblemente Chrome).