package FichaPratica01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double vencBase = 40, subAlim = 5, retIRS = 0.1, segSocFunc = 0.11, SegSocEmpresa = 0.2375, codFunc, diasTrab, valorIliqVenc, totalSubsAlim, totalRetIRS, totalSegSoc, valorLiqFunc;

        // Ler código do Funcionário
        System.out.print("Insira o código do funcionário: ");
        codFunc= input.nextDouble();

        // Ler dias de trabalho
        System.out.print("Insira o número de dias de trabalho: ");
        diasTrab= input.nextDouble();

        // Calcular valor ilíquido vencimento
        valorIliqVenc = vencBase * diasTrab;

        //Apresentar valor ilíquido vencimento
        System.out.println("Valor ilíquido do vencimento: " + valorIliqVenc);

        // Calcular subsidio alimentação
        totalSubsAlim = subAlim * diasTrab;

        //Apresentar valor do subsidio alimentação
        System.out.println("Valor do subsídio alimentação: " + totalSubsAlim);

        // Calcular retenção de IRS ao Estado
        totalRetIRS = valorIliqVenc * retIRS;

        //Apresentar valor da retenção IRS
        System.out.println("Valor da retenção de IRS: " + totalRetIRS);

        // Calcular Segurança Social
        totalSegSoc = valorIliqVenc * (segSocFunc + SegSocEmpresa);

        //Apresentar valor da segurança social
        System.out.println("Valor entregue a Segurança Social (ambos encargos): " + totalSegSoc);

        // Calcular valor Liquido a receber
        valorLiqFunc = valorIliqVenc + totalSubsAlim - totalRetIRS - valorIliqVenc * segSocFunc;

        //Apresentar valor Liquido a receber
        System.out.println("Valor líquido a receber: " + valorLiqFunc);


    }
}
