public class celular {
    public String modelo;

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String mod) {
         this.modelo = mod;
    }
    public String marca;

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String mar){
        this.marca = mar;
    }
    public int ano;

    public int getAno(){
        return this.ano;
    }

    public void setAno(int an) {
        this.ano = an;
    }
    public double polegadas;

    public double getPolegadas(){
        return this.polegadas;
    }

    public void setPolegadas (double pol) {
        this.polegadas = pol;
    }
    public boolean touch_id;

    public boolean getTouch_id(){
        return this.touch_id;
    }

    public void setTouch_id(boolean touch) {
        this.touch_id = touch;
    }
    public boolean face_id;

    public boolean getFace_id() {
        return this.face_id;
    }

    public void setFace_id(boolean face) {
        this.face_id = face;
    }


    public void status(){
        System.out.println("Um pouco sobre esse telefone: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Face id: " + this.getFace_id());
        System.out.println("Touch id: " + this.getTouch_id());
    }

    public void destravar(){
        if(this.touch_id == true) {
            System.out.println("Via touch id");
        } if(this.face_id == true) {
            System.out.println("Via face id");
        }
    }


}
