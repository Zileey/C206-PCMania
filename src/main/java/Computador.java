public class Computador {
    String marca;
    float preco;
    MemoriaUSB USB;
    SistemaOperacional SO;
    HardwareBasico HB[];

    public Computador(){ //Construtor
        this.marca = marca;
        this.preco = preco;
        SO = new SistemaOperacional();
        HB = new HardwareBasico[3];
    }

    void mostraPCConfigs(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Preço: "+ this.preco);
        System.out.println("Processador: "+this.HB[0].nome);
        System.out.println("RAM: "+this.HB[1].capacidade+ " GB");
        System.out.println("HD: "+this.HB[2].capacidade+ " GB");
        System.out.println("Memória extra: "+this.USB.nome+"\n");
    }

    void addMemoriaUSB(MemoriaUSB musb){
        USB = musb;
    }
}
