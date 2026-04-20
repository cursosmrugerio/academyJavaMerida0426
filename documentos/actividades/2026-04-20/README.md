# Actividades — 20 de abril de 2026

## Temas cubiertos

1. **Fundamentos de Java y OOP** (proyecto `Inicio/`)
2. **Referencias de objetos y Garbage Collection** (proyecto `garbageCollection/`)

---

## 1. Fundamentos de Java (`Inicio/`)

Evolución incremental del mismo ejemplo (`Ave` / `Pato`) en paquetes `v0` → `v4`.

| Versión | Archivo | Concepto |
|---------|---------|----------|
| v0 | [`Principal.java`](../../../Inicio/src/com/curso/v0/Principal.java) | Estructura mínima: `public static void main`, `System.out.println` |
| v0 | [`Principal1.java`](../../../Inicio/src/com/curso/v0/Principal1.java) | Primer uso de `StringBuilder`, clase `Pato` con constructor parametrizado |
| v1 | [`Principal.java`](../../../Inicio/src/com/curso/v1/Principal.java) | Constructor default vs parametrizado, valor `null` de atributos sin inicializar |
| v2 | [`Principal.java`](../../../Inicio/src/com/curso/v2/Principal.java) | Herencia con `extends`, `super(name)` para delegar al padre |
| v3 | [`Principal.java`](../../../Inicio/src/com/curso/v3/Principal.java) | Herencia sin constructor parametrizado en el padre (`super()` implícito) |
| v4 | [`Principal.java`](../../../Inicio/src/com/curso/v4/Principal.java) | **Polimorfismo** (`Ave ave2 = new Pato()`), referencia `Object`, inmutabilidad de `String` vs mutabilidad de `StringBuilder` |

### Conceptos clave
- Un **constructor** no tiene tipo de retorno (ni `void`).
- Si defines un constructor parametrizado, **ya no se genera** el default automático.
- `String` es **inmutable**: reasignar una variable no cambia el objeto original.
- `StringBuilder` es **mutable**: `.append()` modifica el mismo objeto.
- Polimorfismo: una referencia del tipo padre puede apuntar a un objeto hijo.

---

## 2. Referencias y Garbage Collection (`garbageCollection/`)

### v0 — Primitivos, autoboxing y bloques de instancia

| Archivo | Concepto |
|---------|----------|
| [`Principal.java`](../../../garbageCollection/src/com/curso/v0/Principal.java) | Diferencia entre primitivos (`int`) y referencias (`String`). `null` libera la referencia |
| [`Chicken.java`](../../../garbageCollection/src/com/curso/v0/Chicken.java) | **Autoboxing**: `Integer eggs = 2` (primitivo → objeto) |
| [`Chicken1.java`](../../../garbageCollection/src/com/curso/v0/Chicken1.java) | **Bloques de instancia** `{ ... }`: se ejecutan antes del constructor |
| [`Chicken2.java`](../../../garbageCollection/src/com/curso/v0/Chicken2.java) | Conteo de objetos, `var`, comparación de referencias con `==` en `Integer` |

### v1 — Referencias entre objetos

| Archivo | Concepto |
|---------|----------|
| [`Principal.java`](../../../garbageCollection/src/com/curso/v1/Principal.java) | Reasignación de referencias `String`: ¿cuántos objetos quedan elegibles para GC? |
| [`Bear.java`](../../../garbageCollection/src/com/curso/v1/Bear.java) | Un objeto referencia a otro vía atributo (`pandaBear`) |
| [`Buddy.java`](../../../garbageCollection/src/com/curso/v1/Buddy.java) | Constructor que crea objetos adicionales internamente — clave para contar instancias |

### v2 — Referencias circulares

| Archivo | Concepto |
|---------|----------|
| [`Bear.java`](../../../garbageCollection/src/com/curso/v2/Bear.java) | Cadena circular de 3 objetos: `brownBear.pandaBear.pandaBear.pandaBear == brownBear` → `true` |

### Conceptos clave
- El **Garbage Collector** libera objetos cuando ya no hay referencias accesibles hacia ellos.
- Asignar `null` o reasignar una variable puede dejar objetos huérfanos.
- Un objeto con referencias circulares entre sí **también puede ser recolectado** si no hay ninguna referencia externa viva hacia el ciclo.
- `var` (Java 10+) infiere el tipo — solo funciona en variables locales.

---

## Diagramas y ejercicios

Ver los PDFs en [`documentos/diagramas/`](../../diagramas/):
- `diagramaInicio.pdf` — diagrama del flujo del proyecto `Inicio`
- `qGc.pdf`, `qGc01.pdf` — preguntas sobre Garbage Collection
- `q03_24.pdf`, `q03_114.pdf` — ejercicios tipo examen

---

## Tarea / práctica sugerida

1. Ejecutar cada `Principal.java` y predecir la salida **antes** de correrlo.
2. En `Chicken2.java`, justificar por qué el conteo de objetos es 6.
3. En `v2/Bear.java`, dibujar el diagrama de referencias y verificar la igualdad.
4. Resolver las preguntas de los PDFs en `documentos/diagramas/`.
