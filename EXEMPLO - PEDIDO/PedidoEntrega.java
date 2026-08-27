class PedidoEntrega extends Pedido{
    String endereco;
    double taxaFrete;

    public PedidoEntrega (int numero, String prato, double valorPrato, String endereco, double taxaFrete){
        super(numero,prato,valorPrato);
        this.endereco = endereco;
        this.taxaFrete = taxaFrete;
    }

    
    @Override
    public double calcularTotal(){
        return valorPrato + taxaFrete;
    }

    @Override
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Entrega Em: " + endereco + "(Frete: R$" + taxaFrete +")" );
        System.out.println("Total: R$" + calcularTotal());

    }
}
