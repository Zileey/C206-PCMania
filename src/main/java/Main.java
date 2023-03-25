import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente1 = new Cliente();

        cliente1.nome = "CriseGreg";
        cliente1.CPF = 12345678;

        MemoriaUSB armz1 = new MemoriaUSB();
        armz1.capacidade = 16;
        armz1.nome = "Kingston";
        MemoriaUSB armz2 = new MemoriaUSB();
        armz2.capacidade = 32;
        armz2.nome = "Multilaser";
        MemoriaUSB armz3 = new MemoriaUSB();
        armz3.capacidade = 1024;
        armz3.nome = "Não sei po";


        HardwareBasico HB1 = new HardwareBasico("Pentium Core i3",2200);
        HardwareBasico HB2 = new HardwareBasico("Pentium Core i5",3370);
        HardwareBasico HB3 = new HardwareBasico("Pentium Core i7",4500);
        HardwareBasico HB4 = new HardwareBasico("RAM",8);
        HardwareBasico HB5 = new HardwareBasico("RAM",16);
        HardwareBasico HB6 = new HardwareBasico("RAM",32);
        HardwareBasico HB7 = new HardwareBasico("HD",500);
        HardwareBasico HB8 = new HardwareBasico("HD",1000);
        HardwareBasico HB9 = new HardwareBasico("HD",2000);


        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        computador1.marca = "Positivo";
        computador1.preco = 2300.00f;
        computador1.HB[0] = HB1;
        computador1.HB[1] = HB4;
        computador1.HB[2] = HB7;
        computador1.SO.nome = "Linux Ubuntu";
        computador1.SO.tipo = 32;
        computador1.addMemoriaUSB(armz1);

        computador2.marca = "Acer";
        computador2.preco = 5800.00f;
        computador2.HB[0] = HB2;
        computador2.HB[1] = HB5;
        computador2.HB[2] = HB8;
        computador2.SO.nome = "Windows 8";
        computador2.SO.tipo = 64;
        computador2.addMemoriaUSB(armz2);

        computador3.marca = "Vaio";
        computador3.preco = 1800.00f;
        computador3.HB[0] = HB3;
        computador3.HB[1] = HB6;
        computador3.HB[2] = HB9;
        computador3.SO.nome = "Windows 10";
        computador3.SO.tipo = 64;
        computador3.addMemoriaUSB(armz3);

        int op,confirm;
        int cont = 0;

        do {
            System.out.println("Qual PC você quer comprar?");
            System.out.println("1 - Comprar PC da promoção 1");
            System.out.println("2 - Comprar PC da promoção 2");
            System.out.println("3 - Comprar PC da promoção 3");
            System.out.println("0 - Encerrar o programa e mostrar o carrinho de compras\n");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    computador1.mostraPCConfigs();
                    System.out.println("Confirmar compra do PC 1?\n");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO\n");
                    confirm = sc.nextInt();
                    if (confirm == 1) {
                        cliente1.pc[cont] = computador1;
                        cont++;
                    }
                    else if (confirm == 2) {
                        break;
                    }

                    break;

                case 2:

                    computador2.mostraPCConfigs();
                    System.out.println("Confirmar compra do PC 2?");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO");
                    confirm = sc.nextInt();
                    if (confirm == 1) {
                        cliente1.pc[cont] = computador2;
                        cont++;
                    }
                    else if (confirm == 2) {
                        break;
                    }
                    break;

                case 3:
                    computador3.mostraPCConfigs();
                    System.out.println("Confirmar compra do PC 3?");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO");
                    confirm = sc.nextInt();
                    if (confirm == 1) {
                        cliente1.pc[cont] = computador3;
                        cont++;
                    }
                    else if (confirm == 2) {
                        break;
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }while (op != 0);

        System.out.println("Nome do Cliente: "+ cliente1.nome);
        System.out.println("CPF: "+ cliente1.CPF);
        System.out.println("PC's comprados: ");
        for (int i = 0; i < cliente1.pc.length; i++){
            if(cliente1.pc[i] != null)
            cliente1.pc[i].mostraPCConfigs();
            else{
                break;
            }
        }
        System.out.println("Preço total: R$"+cliente1.CalcularTotal());
        System.out.println("MADE IN BRAZIL, BY JOAO AND GABRIEL");
    }

}
