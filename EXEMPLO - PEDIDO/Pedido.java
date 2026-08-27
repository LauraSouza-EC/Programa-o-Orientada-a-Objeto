//superclasse - Restaurante

class Pedido {
    int numero;
    String prato;
    double valorPrato;

//metodo construtor this
    
    public Pedido(int numero, String prato, double valorPrato){
        this.numero = numero;
        this.prato = prato;
        this.valorPrato = valorPrato;
    }

//metodo

    public double calcularTotal(){
        return valorPrato;
    }

    public void exibirResumo(){
        System.out.println("Pedido #" + numero + "|Prato:" + prato);
    }

}
