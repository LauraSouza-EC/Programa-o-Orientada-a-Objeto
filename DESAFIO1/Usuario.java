//atributos que incluem nome e ID do usuário. Métodos para 
//exibir informações do usuário.

public class Usuario {
    private String nome;
    private int id;
    
    public Usuario(String nome, int id){
        this.nome = nome;
        this.id = id;
    }
    
    public void exibirUsuario(){
        System.out.println("Usuário: " + nome + "ID: " + id);
    }
}