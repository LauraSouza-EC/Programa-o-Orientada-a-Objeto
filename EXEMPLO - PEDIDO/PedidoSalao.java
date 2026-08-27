//subclasse

class PedidoSalao extends Pedido{
    
//atributo para subclasse
  
    int mesa;

    //trazer atributos da superclasse para metodo construtor da subclasse
    public PedidoSalao(int numero, String prato, double valorPrato, int mesa){
        super(numero,prato,valorPrato);

        this.mesa = mesa; 

    }
    
    //modificar comportamento que veio da superclasse

    @Override
    public double calcularTotal(){
        return valorPrato * 1.10;
    }

    @Override
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Local: Mesa " + mesa + " Taxa de serviço inclusa");
        System.out.println("Total: R$" + calcularTotal());

    }

}
