# Informe-teor-a-del-movimiento-
teoría del movimiento armónico simple 


## 1. Introducción
El Movimiento Armónico Simple  es un tipo de movimiento oscilatorio periódico en el que un objeto se mueve hacia adelante y hacia atras en torno a una posicion de equilibrio. Este tipo de movimiento ocurre cuando una fuerza restauradora es directamente proporcional al desplazamiento del objeto, pero con signo contrario.   
—por ejemplo;
resortes, péndulos de pequeña amplitud, circuitos eléctricos LC, entre otros.

## 2. Ecuación diferencial y solución
Para una partícula de masa \(m\) sometida a una fuerza restauradora \(F = -k x\) (resorte ideal), la segunda ley de Newton da:

\[ m\ddot{x} = -k x \]

Reescribiendo:

\[ \ddot{x} + \omega_0^2 x = 0, \quad \text{con } \omega_0 = \sqrt{\dfrac{k}{m}} \]

La solución general (movimiento libre, sin amortiguamiento ni forzado) es:

\[ x(t) = A\cos(\omega_0 t + \phi) \]

Donde:
- \(A\) es la amplitud (máximo desplazamiento).
- \(\omega_0\) es la frecuencia angular (rad/s).
- \(\phi\) es la fase inicial (radianes).

También puede escribirse como combinación de seno y coseno:

\[ x(t) = C_1\cos(\omega_0 t) + C_2\sin(\omega_0 t) \]

## 3. Velocidad y aceleración
Derivando la posición:

\[ v(t) = \dot{x}(t) = -A\omega_0\sin(\omega_0 t + \phi) \]
\[ a(t) = \ddot{x}(t) = -A\omega_0^2\cos(\omega_0 t + \phi) = -\omega_0^2 x(t) \]

La aceleración es proporcional a la posición y opuesta en signo, característica clave del MAS.

## 4. Energía en el MAS
Para un sistema masa-resorte (constante de resorte \(k\)) la energía mecánica total es constante (sin fricción):

Energía cinética:
\[ T = \tfrac{1}{2} m v^2(t) \]
Energía potencial elástica:
\[ U = \tfrac{1}{2} k x^2(t) \]
Energía total:
\[ E = T + U = \tfrac{1}{2} k A^2 \]

En particular, cuando \(x=0\) la energía es toda cinética; cuando \(v=0\) (extremos) la energía es toda potencial.

## 5. Período y frecuencia
Período (tiempo de una oscilación completa):
\[ T = \dfrac{2\pi}{\omega_0} = 2\pi\sqrt{\dfrac{m}{k}} \]

Frecuencia (ciclos por segundo):
\[ f = \dfrac{1}{T} = \dfrac{\omega_0}{2\pi} \]

## 6. Ejemplos físicos
- Masa-resorte horizontal: fuerza restauradora \(F=-kx\), se cumple la ecuación estándar.
- Péndulo simple (pequeñas oscilaciones): para ángulos pequeños \(\theta\), \(\sin\theta \approx \theta\), y la ecuación del péndulo linealiza a la forma del MAS con \(\omega_0 = \sqrt{g/L}\).
- Circuito LC ideal: la carga eléctrica o la corriente oscilan de forma análoga al MAS (matemáticamente similar).

## 7. Variantes y notas
- Amortiguamiento (no conservativo): si hay fricción proporcional a la velocidad (coeficiente \(b\)), la ecuación es \( m\ddot{x} + b\dot{x} + kx = 0 \) (oscilador amortiguado).
- Forzado: con una fuerza externa periódica \(F_0\cos(\omega t)\) aparece la resonancia cuando \(\omega\) se aproxima a \(\omega_0\).

## 8. Apéndice: Bibliografía recomendada (para citar en trabajos)
- Tipler & Mosca — Physics for Scientists and Engineers.
- Marion & Thornton — Classical Dynamics of Particles and Systems.

## 9. Notas finales
Se trata de un movimiento oscilatorio en el que la fuerza restauradora es directamente proporcional y opuesta al desplazamiento desde la posicion de equilibrio. 
Este documento resume la teoría fundamental del MAS, sus ecuaciones, energía, ejemplos y variantes (amortiguamiento y forzado). Para cualquier uso académico cita las fuentes originales recomendadas.
