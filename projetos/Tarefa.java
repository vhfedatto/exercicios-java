public class Tarefa {
    private String titulo;
    private String descricao;
    private String data;
    private String status;

    public Tarefa(String titulo, String descricao, String data, int statusCode) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.status = converterStatus(statusCode);
    }

    private String converterStatus(int statusCode) {
        return switch (statusCode) {
            case 1 -> "A fazer";
            case 2 -> "Fazendo";
            case 3 -> "Feito";
            default -> "Desconhecido";
        };
    }

    public String getTitulo() {
        return titulo;
    }

    public void setStatus(int statusCode) {
        this.status = converterStatus(statusCode);
    }

    @Override
    public String toString() {
        return "Tarefa: " + titulo + "\nDescrição: " + descricao + "\nData: " + data + "\nStatus: " + status;
    }
}
