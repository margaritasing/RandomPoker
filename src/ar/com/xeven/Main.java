package ar.com.xeven;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // numeros aleatorios con Math.random()
        int aleatorio = (int) Math.floor(Math.random()*100);
        System.out.println("Aleatorio: "+aleatorio);

        /*
        // elegir una carta al azar:
        Random objetoAleatorio = new Random();
        int numeroRandom = objetoAleatorio.nextInt(52)+1;
        System.out.println("Carta elegida: "+numeroRandom);
        */
        /*
               Crear un sistema que reparta las 52 cartas del mazo en pantalla.
         */
        // cartas es una lista de enteros que guarda las 52 cartas
        List<Integer> cartas = new ArrayList<>();
        for(int i=1;i<53;i++)
            cartas.add(i);

        // objetoAleatorio es nuestro generador de nros aleatorios
        Random objetoAleatorio = new Random();

        /*
            Reglas de PókerPablo

            Cantidad de jugadores: 2-5 (preguntar al inicio).
            Cantidad de cartas por jugador: 5.
            Al inicio, repartir las cartas y mostrarlas en pantalla.
            Nota: se deben guardar las cartas de cada jugador (no sólo mostrarlas en pantalla).
         */
        Scanner sc = new Scanner(System.in);
        int cantidadJugadores;
        do{
            System.out.print("Ingrese cantidad de jugadores (2-5): ");
            cantidadJugadores = sc.nextInt();
            System.out.println("");
        }while(cantidadJugadores<2 || cantidadJugadores>6);

        List<int[]> cartasJugadores = new ArrayList<>();
        int cartaElegida;
        for(int i=0;i<cantidadJugadores;i++){
            int[] cartasJugador = new int[5];
            for(int laCarta=0;laCarta<5;laCarta++){
                cartaElegida = objetoAleatorio.nextInt(cartas.size());
                cartasJugador[laCarta] = cartas.remove(cartaElegida);
            }
            cartasJugadores.add(cartasJugador);
        }

        int contador = 0;
        for(int[] lasCartas:cartasJugadores){
            contador++;
            System.out.println("Jugador "+contador);
            for(int i=0;i<5;i++)
                System.out.println("Cartas: "+lasCartas[i]);
        }
    }
}
