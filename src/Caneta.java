public class Caneta {
    public String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;

//    public String getModelo() {
//        return modelo;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;

//    public Caneta(String m, String c, double p)
//    //metodo construtor
//    {
//        this.modelo = m;
//        this.cor = c;
//        this.ponta = p;
//        this.tampar();
//    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo (String m) {
        this.modelo = m;
    }

    public double getPonta(){
        return this.ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar(){
        this.tampada =false;

    }

    public void status () {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}

