package Domain;

public class Venda {
    private String tipoProduto;
    private String produto;
    private double quantidadeVendida;
    private double precoUnitario;

    public Venda(String tipoProduto, String produto, double quantidadeVendida, double precoUnitario) {
        this.tipoProduto = tipoProduto;
        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
        this.precoUnitario = precoUnitario;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public String getProduto() {
        return produto;
    }

    public double getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void exibirDetalhesProduto() {
        System.out.println(this.tipoProduto + "\t| " + this.produto + "\t| " + this.precoUnitario + "€");
    }
}