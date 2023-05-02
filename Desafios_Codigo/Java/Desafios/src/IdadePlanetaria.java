import java.util.Scanner;

public class IdadePlanetaria {
    public static void main(String[] args) {
        /*
        Marte: 1 ano marciano dura aproximadamente 1,88 anos terrestres;
        Venus: 1 ano venusiano dura aproximadamente 0,62 anos terrestres;
        Jupiter: 1 ano jupiteriano dura aproximadamente 11,86 anos terrestres.
         */
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();
        planeta = planeta.toLowerCase();
        double idadeEquivalente = idadeTerrestre;
        switch (planeta){
            case "marte":
            idadeEquivalente /= 1.88;
                System.out.println("Idade equivalente em Marte: "+String.format("%.2f", idadeEquivalente)+" anos");
                break;
            case "venus":
                idadeEquivalente /= 0.62;
                System.out.println("Idade equivalente em Venus: "+String.format("%.2f", idadeEquivalente)+" anos");
                break;
            case "jupiter":
                idadeEquivalente /= 11.86;
                System.out.println("Idade equivalente em Jupiter: "+String.format("%.2f", idadeEquivalente)+" anos");
                break;
            default:
                System.out.println("Planeta invalido.");
        }
        scanner.close();
    }
}
