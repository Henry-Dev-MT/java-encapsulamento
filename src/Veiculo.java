public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int ano, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null) {
            this.placa = placa;
        } else {
            System.out.println("Erro: A placa não pode estar vazia");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1990 && ano <= 2026) {
            this.ano = ano;
        } else {
            System.out.println("Erro: Ano incorreto para o veiculo" + "(" + ano + "ano).");
        }
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        if (quilometragem >= 0) {
            this.quilometragem = quilometragem;
        } else {
            System.out.println("Erro: A quilometragem está negativa");
        }
    }
    public void exibir(){
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Quilometragem " + quilometragem);
        System.out.println("Ano " + ano);
    }
}
