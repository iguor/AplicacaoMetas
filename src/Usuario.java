public class Usuario {
    private int idUsuario;
    private String nome;
    private String senha;
    private String cargo;

    public Usuario(int idUsuario, String nome, String senha, String cargo) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.senha = senha;
        this.cargo = cargo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
