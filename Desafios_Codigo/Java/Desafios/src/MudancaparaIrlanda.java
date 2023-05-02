import java.util.Scanner;

public class MudancaparaIrlanda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Leitura do salário e dos benefícios
        double salarioBruto = input.nextDouble();
        double beneficios = input.nextDouble();

        double imposto = calcularImposto(salarioBruto);
        // Cálculo do salário líquido
        double salarioLiquido = salarioBruto - imposto + beneficios;
        System.out.println(String.format("%.2f", salarioLiquido));

        input.close();
    }

    public static double calcularImposto(double salarioBruto){
       double imposto = 0.0;
        if (salarioBruto <=1100.0){
            imposto = salarioBruto*0.05;
        } else if (salarioBruto <=2500) {
            imposto = salarioBruto*0.10;
        } else {
            imposto = salarioBruto*0.15;
        }
        return imposto;
    }
}
