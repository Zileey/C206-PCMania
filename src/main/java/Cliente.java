public class Cliente {
    String nome;
    long CPF;
    Computador pc[];
    float total = 0;
    public Cliente() {
        this.nome = nome;
        this.CPF = CPF;
        pc = new Computador[999];
    }

    float CalcularTotal(){

        for(int i = 0; i < pc.length;i++){
            if(pc[i] != null){
                total = total + pc[i].preco;
            } else if (pc[i] == null) {
                break;
            }
        }
        return total;
    }
}
