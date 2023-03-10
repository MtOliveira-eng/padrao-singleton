class Compras {

    private Compras() {}

    private static Compras instance = new Compras();
    public static Compras getInstance() {
        return instance;
    }

    private String nomeFornecedor;
    private String usuarioLogado;

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
