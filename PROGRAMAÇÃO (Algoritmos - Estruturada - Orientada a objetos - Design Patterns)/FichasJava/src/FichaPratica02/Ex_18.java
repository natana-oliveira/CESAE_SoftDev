package FichaPratica02;

import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double codFunc, diasTrab, vencBase = 0, subAlim = 0, segSocFunc = 0, segSocPatronal = 0, retIRS, valorIliqVenc, totalSubsAlim, totalRetIRS = 0, totalSegSoc = 0, valorLiqFunc = 0;
        String cargoFunc;

        // Ler código do Funcionário
        System.out.print("Insira o código do funcionário: ");
        codFunc = input.nextDouble();

        // Ler cargo do Funcionário
        System.out.print("Insira o cargo do funcionário sendo E - Empregado / C - Chefe / A - Administrador: ");
        cargoFunc = input.next();

        // Ler dias de trabalho
        System.out.print("Insira o número de dias de trabalho: ");
        diasTrab = input.nextDouble();

        //Calcular retenção IRS
        retIRS = vencBase * diasTrab;

        if (retIRS <= 1000) {
            totalRetIRS = retIRS * 0.1;
        } else {
            totalRetIRS = retIRS * 0.2;
        }

        switch (cargoFunc) {
            case "E":
                vencBase = 40;
                subAlim = 5;
                segSocFunc = 0.11;
                segSocPatronal = 0.2375;
                break;

            case "C":
                vencBase = 60;
                subAlim = 7.5;
                segSocFunc = 0.11;
                segSocPatronal = 0.2375;
                break;

            case "A":
                vencBase = 80;
                subAlim = 7.5;
                segSocFunc = 0.9;
                segSocPatronal = 0.21;
                break;

            default:
                System.out.println("\nERRO\nCódigo ou cargo do funcionário incorretos\n");
        }

        // Calcular valor ilíquido vencimento
        valorIliqVenc = vencBase * diasTrab;
        //Apresentar valor ilíquido vencimento
        System.out.println("Valor ilíquido do vencimento: " + valorIliqVenc);
        // Calcular subsidio alimentação
        totalSubsAlim = subAlim * diasTrab;
        //Apresentar valor do subsidio alimentação
        System.out.println("Valor do subsídio alimentação: " + totalSubsAlim);
        //Apresentar valor da retenção IRS
        System.out.println("Valor da retenção de IRS: " + totalRetIRS);
        // Calcular Segurança Social
        totalSegSoc = valorIliqVenc * (segSocFunc + segSocPatronal);
        //Apresentar valor da segurança social
        System.out.println("Valor entregue a Segurança Social (ambos encargos): " + totalSegSoc);
        // Calcular valor Liquido a receber
        valorLiqFunc = valorIliqVenc + totalSubsAlim - totalRetIRS - valorIliqVenc * segSocFunc;
        //Apresentar valor Liquido a receber
        System.out.println("Valor líquido a receber: " + valorLiqFunc);

    }
}
