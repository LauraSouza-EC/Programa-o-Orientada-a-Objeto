public class Main {
    public static void main(String[] args) {
        
        //Prato 1: Para comer no restaurante
        
        PedidoSalao p1 = new PedidoSalao(101, "Lasanha Bolonhesa", 50.00,4);

        System.out.print("-- Salão --");
        p1.exibirResumo();

        //Prato 2: Para entrega em domicílio

        PedidoEntrega p2 = new PedidoEntrega(04, "Pizza Portuguesa", 45.00, "Rua das Flores, 120", 7.00);

        System.out.print("--- Entrega ---");
        p2.exibirResumo();
    }

}
