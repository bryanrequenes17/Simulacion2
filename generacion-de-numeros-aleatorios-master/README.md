# Algoritmos de Generación de Números Aleatorios 
###### [![Sello UNL](https://upload.wikimedia.org/wikipedia/commons/d/df/UNL3.png)]([https://unl.edu.ec/](https://unl.edu.ec/))
Este proyecto fue desarrollado para la clase de *Simulación*, de la Carrera de Ingeniería en Sistemas, de la Universidad Nacional de Loja. Su propósito es, el de permitir la generación de números aleatorios a través de los métodos:

 - Congruencial Mixto
 - Congruencial Multiplicativo

Para un mejor manejo de los algoritmos de generación; se desarrolló un programa en **JAVA** usando la librería gráfica **Swing** para generar ventanas y componentes, útiles para este propósito.   

> El código está comentado; tratando de explicar lo mejor posible el funcionamiento de los métodos y las líneas de código más importantes.

![Método comentado, Congruencial Mixto](https://lh3.googleusercontent.com/CF4u52RyDPlT7YwK_sXQXmYfr5fbTUNoBaZ9zT8AETkdzDCug7GYcW2UVR3JfeAQNbhrBUiN2kKl "Congruencial mixto comentado")
![Método Congruencial Multiplicativo](https://lh3.googleusercontent.com/oz93eg28rgHgrRssfnRky-fkIEvPqNEgA4QZtLGGD8xhINhF5dkaZ3zRI9nQjq8JigZiiq_46b45 "Congruencial Multiplicativo comentado")

Se puede acceder al JavaDoc desde la carpeta *dist*, en la misma carpet se encuentra el ejecutable .jar 

## Uso del Programa
El programa inicia con una ventana principal, la cual permite abrir las ventanas que ejecutan los Métodos de Generación. 

![index](https://lh3.googleusercontent.com/OI6VGwBcbuifwGzZfVWOFC8lWXWYg_f14mr-qj5EUbFHvT-fXE5E4hdL5U9GdY5nAUAYZZl0MYmI "index")

En la parte superior hay manus de acción, que realizan las mismas funciones que los botones centrales. 

![menus de metodos](https://lh3.googleusercontent.com/Q5MOaXU6gtV6deQVMlMfJ06Gqohw_D3GMSwneZmaYchhaCshyrwYrv3ubsXJlLHsIEY3NY940WIF "menús metodos")![menú opciones](https://lh3.googleusercontent.com/lAGb920GZTEnXMcB_Fi3Nqg5ib5GDVtSXF3mSUQ9jYawfzXjWK8kCOtybJ-UC0lPSu4yzPntH9kk "menú opciones")

En cada Método se deben cumplir con ciertas reglas que permiten la correcta ejecución de los algoritmos. Para lo cual el programa solicita cambios en los datos de entrada, para ajustar sus parámetros y obtener los resultados correctos.
### Ventana del Método Congruencial Mixto
Ventana Inicial.

![Congruencial Mixto, vetana inicial](https://lh3.googleusercontent.com/Ae6N6BkUzEM_lVSyswgJV_XgezdtGhm01DrGKSsmVDcWd8tddmo9BJjFqEId4D7bGKqjrBqvabeR "Congruencial Mixto")

Verificación de datos Ingresados.

![Validación de datos numéricos](https://lh3.googleusercontent.com/xmEU-s_woSkzsGfGKirY6kivviu59aTvM5vpMNi75FPtcg6Q2yRrwp9-2_6EraasFJVqx2dvis3k "Validación de datos numéricos")
#### A continuación se presentan ventanas que resultan cuando los datos ingresados no cumplen con los requisitos y los valores se deben reajustar. 
![El valor de m es menor al resto](https://lh3.googleusercontent.com/YW9TvT6c9zL-_TcxOi-xpXO9DWeeSWwOMVNcxoJEDhWpDEa1rr3GlpdgJ1pHLOne1ejHBM14X4Wb)
![Cambio del valor de d](https://lh3.googleusercontent.com/pv0rLvu2yLZm0pdDXzL55_5_6skO6FI0wiDdWJS8fkwt1Y6WT1ABnp8oSzj8vq9PJHOJ_UaTrS7S)
![El un valor calculado no cumple con los parámetros](https://lh3.googleusercontent.com/ueP-O6MyrOpLoXk0At5uSrc_cRSK1xJ9Yk6iVGTntQYCgTgPwMCxcfjtxI47rzd88PNjKmMbRZeV)
#### Cuando los datos cumplen con los requerimientos, se presentan los resultados en la tabla, ademas de los valores con los que los cálculos se pudieron realizar, en la parte inferior.
![Resultados Congruencial Mixto](https://lh3.googleusercontent.com/7feK6MtFlrLjcqvcIc8mpMNlPCfvoz5IAN85VM0Q7yjoTHtey9MblbDGG2h38Gx6qo5AQxNsK2kh "Tabla de resultados")
### Ventana del Método Congruencial Multiplicativo
Ventana Inicial, existen dos formas de obtener el valor del multiplicador (*a*):
  - 8k + 3
  - 8k - 3
El programa por defecto, usa (8k + 3), pero el usuario puede cambiar esta fórmula,  con el botón junto al campo *k*. 

![Ventana Inicial del Metodo Congruencial Multiplicativo](https://lh3.googleusercontent.com/4NWPv9USzRW0_9VvpvB9vHLcFERtyQBHGxkCuTAQUnVc6D9Ynx2-1GHjkIMWaaz0CM-KeEoFx7r9)
![Ventana Inicial del Metodo Congruencial Multiplicativo con la ecualcion seleccionada 8k-3](https://lh3.googleusercontent.com/qtDK9mRl6sLxavUR3lK4s2l0hBoEES7Exkqvwho1Mii1eBJ77E6Orhdq6zylramb14ZAiE0jCN9J)
#### Ventana de Resultados, los resultados se ajustan de acuerdo al método de obtención de *a*.
![Resultados 8k+3](https://lh3.googleusercontent.com/XsrNdrbpRWDHd0z37qwWutuYFHY3p59TIOka8Nd7Xbj58yTRsrFX3H3__H42Caa72iOtJDUP0KDi)
![resultados 8k-3](https://lh3.googleusercontent.com/4d1F8TlE6GwYptaWyIxpD9S0dNMogMy2A5JxbCJcVS74TFgrTU_pf_c5zkARoM-wM87F4kSiTA2V)
#### Los resultados se pueden reducir si el usuario desea únicamente los resultados dentro del periodo.
![Todos los resultados](https://lh3.googleusercontent.com/mCytpbuxfBgQvQrsa4icQLUpiOfyIUDC7oV-X145xquf3W8L_uTV2zvlq6M1CrjrFJ3gX9o0QfLn)
![Resultado dentro del periodo](https://lh3.googleusercontent.com/kiF-m8pW51VqXgRVMsN37ERvbsoKbIhCe5Ua-9PUlYTvAg27biCj_lZccMmTCS8hD36woyZ7rNp9)

**NOTA:** Todas las capturas de pantalla se pueden ver en el siguiente enlace: [Capturas de Pantalla](https://photos.app.goo.gl/SyvUD9MjNpYaFXgD7). 

## Licencia
Esta obra está bajo una [licencia de Creative Commons Reconocimiento 4.0 Internacional](http://creativecommons.org/licenses/by/4.0/).