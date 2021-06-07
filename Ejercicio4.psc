Algoritmo Ejercicio4
	Definir edad, mayor, menor, auxiliar Como Entero
	mayor <- 0
	menor <- 0
	i <- 1
	Mientras i <= 20 Hacer
		Escribir "Ingrese edad: " i
		Leer auxiliar
		Si i == 1 Entonces
			mayor <- auxiliar
			menor <- auxiliar
		SiNo
			Si auxiliar > mayor Entonces
				mayor <- auxiliar
			FinSi
			Si auxiliar < menor Entonces
				
				menor <- auxiliar
			Fin Si
		Fin Si
		i <- i+1
	Fin Mientras
	Escribir "La persona de mayor edad tiene = " mayor " años."
	Escribir "La persona de menor edad tiene = " menor " años."
FinAlgoritmo
