import java.time.LocalDate;

public class Meta {
    private int idMeta;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private int valorDesejado;
    private int valorAlcancado;

    public Meta(int idMeta, String descricao, LocalDate dataInicio, LocalDate dataTermino, int valorAlcancado) {
        this.idMeta = idMeta;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorDesejado = 100; // Valor desejado padrão para simplificar
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
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
        return 100 - getProgresso();
    }
}
