public class Meta {
    private int id;
    private String descricao;
    private int anoInicio;
    private int anoTermino;
    private int valorDesejado;
    private int valorAlcancado;

    public Meta(int id, String descricao, int anoInicio, int anoTermino, int valorDesejado, int valorAlcancado) {
        this.id = id;
        this.descricao = descricao;
        this.anoInicio = anoInicio;
        this.anoTermino = anoTermino;
        this.valorDesejado = valorDesejado;
        this.valorAlcancado = valorAlcancado;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public int getAnoTermino() {
        return anoTermino;
    }

    public int getValorDesejado() {
        return valorDesejado;
    }

    public int getValorAlcancado() {
        return valorAlcancado;
    }

    public double getProgresso() {
        return (double) valorAlcancado / valorDesejado * 100;
    }

    public double getDiferenca() {
        return valorDesejado - valorAlcancado;
    }
}
