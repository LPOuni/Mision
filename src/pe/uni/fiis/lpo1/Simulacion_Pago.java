package pe.uni.fiis.lpo1;

public class Simulacion_Pago {
    private Float amortización;
    Cliente_info cli = new Cliente_info();

    public Float getAmortización() {
        return amortización;
    }

    public void setAmortización(Float amortización) {
        this.amortización = amortización;
    }


    public Double getValor_cuota(){
        Double c=null; //valor_cuota
        Float r; //tasa_anual
        Float p; //préstamo
        Integer n;  //número de cuotas
        cli.setTasa_anual(0.36f);
        r=cli.getTasa_anual();
        p=cli.getPrestamo();
        n=cli.getCuotas();

        c=(r*p)/(new Float(1)- Math.pow( new Float(1)+r,new Float(n)));

        return c;
    }

}
