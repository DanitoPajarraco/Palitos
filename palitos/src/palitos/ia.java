package palitos;
import java.util.Scanner;
import java.util.Random;

public class ia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int palitos = 21;

        System.out.println("Juego 21 palitos");
        System.out.println("Cada vez que te toque podrás quitar 1, 2, 3 o 4 palitos.");

        while (palitos > 0) {
            int palitosJugador = pedirPalitosJugador(palitos, scanner);
            palitos -= palitosJugador;
            if (palitos <= 0) {
                System.out.println("Gano la IA, no quedan más palitos.");
                break;
            }

            int palitosIA = quitarPalitosIA(palitos);
            System.out.println("La IA ha quitado " + palitosIA + ".");
            palitos -= palitosIA;
            if (palitos <= 0) {
                System.out.println("Ganaste, no quedan palitos.");
                break;
            }

            System.out.println("Palitos restantes: " + palitos);
        }

        scanner.close();
    }

    private static int pedirPalitosJugador(int palitos, Scanner scanner) {
        int palitosJugador;
        do {
            System.out.print("Escribe cuántos palitos quieres quitar del 1 al 4: ");
            palitosJugador = scanner.nextInt();
        } while (palitosJugador < 1 || palitosJugador > 4 || palitosJugador > palitos);
        return palitosJugador;
    }

    private static int quitarPalitosIA(int palitosRestantes) {
        int palitosIA = (palitosRestantes - 1) % 5;
        if (palitosIA == 0) {
            palitosIA = 1; 
        }
        return palitosIA;
    }
}

/*
public class ia {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int palitos = 21;

    System.out.println("Juego 21 palitos");
    System.out.println("Cada vez que te toque podrás quitar 1, 2, 3 o 4 palitos.");

    while (palitos > 0) {
        int palitosJugador = pedirPalitosJugador(palitos, scanner);
        palitos -= palitosJugador;
        if (palitos <= 0) {
            System.out.println("Ganaste, no quedan palitos");
            break;
        }

        int palitosIA = quitarPalitosIA(palitos, random);
        System.out.println("La IA ha quitado " + palitosIA + ".");
        palitos -= palitosIA;
        if (palitos <= 0) {
            System.out.println("Gano la IA no quedan más palitos.");
            break;
        }

        System.out.println("Palitos restantes: " + palitos);
    }

    scanner.close();
}

private static int pedirPalitosJugador(int palitos, Scanner scanner) {
    int palitosJugador;
    do {
        System.out.print("Escribe cuántos palitos quieres quitar del 1 al 4: ");
        palitosJugador = scanner.nextInt();
    } while (palitosJugador < 1 || palitosJugador > 4 || palitosJugador > palitos);
    return palitosJugador;
}

private static int quitarPalitosIA(int palitosRestantes, Random random) {
    return random.nextInt(4) + 1;
}
}*/