package InterfaceGrafica.Poupanca;

public class Poupanca {
    private double capitalInicial, taxaJurosMesal;
    private int quantMeses;

    public void setCapitalInicial(double capitalInicial) {this.capitalInicial = capitalInicial;}
    public void setTaxaJurosMesal(double taxaJurosMesal) {this.taxaJurosMesal = taxaJurosMesal/100;}
    public void setQuantMeses(int quantMeses) {this.quantMeses = quantMeses;}

    public String retornaInvestimento(){
        double valorAplicado = 0;
        for(int i = quantMeses; i >= 1; i--){
            valorAplicado += this.capitalInicial*this.taxaJurosMesal;
        } return("Retorno Total: R$"+(this.capitalInicial+valorAplicado)+"\nRendimento Liquido: R$"+valorAplicado);
    }
}
