package Bucles_03.Propuesta_03.Aplicacion_03._3_13;

class AgujaReloj {
    private int posicionAguja;

    public AgujaReloj(int posicionInicial) {
        this.posicionAguja = posicionInicial;
    }

    public void avanceAguja(int avances) {
        this.posicionAguja = avances;
    }

    @Override
    public String toString() {
        return String.format("%02d", this.posicionAguja);
    }
}