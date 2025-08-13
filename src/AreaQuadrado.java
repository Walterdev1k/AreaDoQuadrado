/*
Forma 1: Tradicional (com Scanner)
Mais comum .
 */



import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}


/*

interface grafica
//Forma 2: Usando JOptionPane (Interface Gráfica)
//Para quem prefere janelas gráficas ao invés do terminal.

import javax.swing.JOptionPane;

public class AreaQuadrado {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite o lado do quadrado:");
        double lado = Double.parseDouble(entrada);

        double area = lado * lado;

        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
    }
}

*/

//Forma 3: Função Separada (abordagem modular)
//Mais profissional e reutilizável, com função dedicada ao cálculo.
/*

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = calcularArea(lado);
        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }

    public static double calcularArea(double lado) {
        return lado * lado;
    }
}
*/