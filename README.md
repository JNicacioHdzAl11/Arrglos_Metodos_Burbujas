Práctica: Algoritmos de Ordenamiento por Burbuja
Nombre: Juan Nicacio Hernández ALvarado
Grado y Grupo: 4to B
# Práctica: Comparativa de Ordenamiento por Burbuja en Java

Descripción General
Esta práctica consiste en la implementación y análisis comparativo de dos versiones del algoritmo de ordenamiento por Burbuja (Bubble Sort)
en Java: la versión Tradicional y la versión Mejorada (Optimizada) 

El objetivo principal es identificar el impacto en el rendimiento al incorporar una variable de control (*flag* o bandera) que interrumpe la ejecución del algoritmo cuando el arreglo ya se encuentra totalmente ordenado, reduciendo iteraciones innecesarias y optimizando el tiempo de procesamiento.
DESCRIPCIÓN DE LOS ALGORITMOS

1. Burbuja Tradicional (ordenamientoBurbuja):
El algoritmo recorre el arreglo comparando pares de elementos adyacentes 
(posición j y j+1) e intercambiándolos de lugar si el de la izquierda es mayor. 
Su característica principal es que ejecuta todas las iteraciones y pasadas 
programadas sin importar si el arreglo ya quedó ordenado en los primeros pasos, 
manteniendo siempre una complejidad de O(n²).

2. Burbuja Mejorada (ordenamientoBurbujaMejorado):
Mantiene la misma lógica de comparación e intercambio adyacente, pero añade 
una variable de control (bandera / flag tipo boolean). Al iniciar cada pasada 
la bandera se coloca en 'false'; si ocurre al menos un intercambio pasa a 'true'. 
Si finaliza una pasada completa sin ningún intercambio (bandera sigue en 'false'), 
el algoritmo detecta que el arreglo ya está ordenado e interrumpe el ciclo 
anticipadamente. Esto optimiza su rendimiento a O(n) en casos donde los datos 
ya están ordenados.

resultado de las pruebas




<img width="308" height="111" alt="Captura de pantalla 2026-10-20 233035" src="https://github.com/user-attachments/assets/62edf895-be11-42af-b90d-3a6c2b215b62" />
