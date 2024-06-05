public class Meta {
    private int idMeta;
    private String descricao;
    private int anoInicio;
    private int anoTermino;
    private int valorDesejado;
    private int valorAlcancado;

    public Meta(int idMeta, String descricao, int anoInicio, int anoTermino, int valorDesejado, int valorAlcancado) {
        this.idMeta = idMeta;
        this.descricao = descricao;
        this.anoInicio = anoInicio;
        this.anoTermino = anoTermino;
        this.valorDesejado = valorDesejado;
        this.valorAlcancado = valorAlcancado;
    }

    public int getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(int idMeta) {
        this.idMeta = idMeta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getAnoTermino() {
        return anoTermino;
    }

    public void setAnoTermino(int anoTermino) {
        this.anoTermino = anoTermino;
    }

    public int getValorDesejado() {
        return valorDesejado;
    }

    public void setValorDesejado(int valorDesejado) {
        this.valorDesejado = valorDesejado;
    }

    public int getValorAlcancado() {
        return valorAlcancado;
    }

    public void setValorAlcancado(int valorAlcancado) {
        this.valorAlcancado = valorAlcancado;
    }

    public double getProgresso() {
        return (double) valorAlcancado / valorDesejado * 100;
    }

    public double getDiferenca() {
        return valorDesejado - valorAlcancado;
    }
}
