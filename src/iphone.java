public class iphone {
    public static void main(String[] args) {
        celular i14 = new celular();
        i14.setModelo("iPhone 14");
        i14.setMarca("Apple");
        i14.setAno(2022);
        i14.setFace_id(true);
        i14.setTouch_id(false);
        i14.setPolegadas(12.5);

        i14.status();
        i14.destravar();

    }
}
