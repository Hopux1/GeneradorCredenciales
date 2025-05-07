# Generador de Credenciales de Evento

### Estudiantes:  
- André Piffaut y Jeús Vidal – Patrones de Diseño (Sección 2)

---

## 🎯 Objetivo del Proyecto

El objetivo del proyecto es implementar un sistema que permita emitir credenciales personalizadas para un evento, a partir de una plantilla base clonable.  
Se utilizan los patrones de diseño **Prototype** y **Singleton** para estructurar el código de manera eficiente y reutilizable.

---

## 🚀 Cómo ejecutar

1. Clonar el repositorio:
```bash
git clone https://github.com/usuario/repositorio.git
cd repositorio
```

2. Compilar y ejecutar (desde NetBeans o terminal):
```bash
javac src/credenciales/*.java
java credenciales.Main
```

> ⚠️ Asegúrate de tener Java 11 o superior instalado.

---

## 🧬 Patrón Prototype – Aplicación

- La clase `Credencial` implementa la interfaz `Cloneable`.
- Se utiliza el método `clone()` para generar credenciales nuevas basadas en una plantilla.
- Se realiza un **deep copy** al clonar la credencial para que los datos no se compartan entre instancias.

### Ejemplo:
```java
Credencial clon = plantillaBase.clone();
clon.setNombre("Tulio Triviño");
clon.setRut("12.345.678-9");
clon.setCargo("Presentador");
```

---

## 🔒 Patrón Singleton – Aplicación

- La clase `GestorCredenciales` implementa el patrón Singleton.
- Se asegura de que exista **una sola instancia global** que maneja la lista de credenciales.
- Utiliza constructor privado y método `getInstancia()`.

### Ejemplo:
```java
GestorCredenciales gestor = GestorCredenciales.getInstancia();
gestor.agregarCredencial(clon);
```

---

## 🖥️ Menú por consola

```
=== GENERADOR DE CREDENCIALES ===
1. Agregar credencial personalizada
2. Ver credenciales
3. Salir
```

- El sistema permite ingresar nombre, RUT y cargo.
- Las credenciales generadas se almacenan y pueden visualizarse en cualquier momento.

---

## 📊 Diagrama de Clases (UML)

![image](https://github.com/user-attachments/assets/fff3700e-c57a-42d0-abe3-f24b10c00358)



> 📌 Agrega aquí una imagen del diagrama UML donde se muestren claramente los patrones aplicados.

---

## 📸 Captura del sistema funcionando

![image](https://github.com/user-attachments/assets/452394c8-e7f9-49d9-8d00-ebca49fe64c9)


---


```

---

## ✅ Conclusión

El proyecto demuestra la correcta aplicación de los patrones **Prototype** y **Singleton** en una situación práctica. La implementación permite una gestión organizada y extensible de credenciales personalizadas a partir de una plantilla base reutilizable.
