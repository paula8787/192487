## 🌶️ Ejercicio 1 – **El Club Casi Secreto™**

> En una ciudad donde la lógica es opcional y las contraseñas son más seguras que una puerta sin cerradura, existe un club llamado “Club Casi Secreto™”. El acceso es otorgado solo si:
> 
1. Tienes más de 18 años.
2. Conoces la ultra secreta clave: `"1234"`.
3. Dices correctamente la frase secreta: `"la matrix vive"`.
4. El sistema debe verificar **3 intentos consecutivos**.
5. Si alguien falla una condición, no se le deja entrar, pero se sigue preguntando a los demás.


empezamos definiendo nuestras variables, como lo son
edad, clave y frase secreta
dejamos un mensaje el cual nos preguntara nuestra edad para aplicar un if el cual nos dejara o no pasar dependiendo de esta, si somos mayores de 18, podremos pasar a la siguiente pregunta que en este caso seria nuestra super clave secreta, si la dices bien pasas al siguente que seria nuestra frase secreta, para estas dos ultimas abra un bucle con 3 intentos si fallas en ellos no entras, al igual que con tu edad, si no cumples con la edad establecida