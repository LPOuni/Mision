package pe.uni.fiis.lpo1;

public class Simulacion_Pago {
    private Float amortizaci�n;
    Cliente_info cli = new Cliente_info();

    public Float getAmortizaci�n() {
        return amortizaci�n;
    }

    public void setAmortizaci�n(Float amortizaci�n) {
        this.amortizaci�n = amortizaci�n;
    }


    public Double getValor_cuota(){
        Double c=null; //valor_cuota
        Float r; //tasa_anual
        Float p; //pr�stamo
        Integer n;  //n�mero de cuotas
        cli.setTasa_anual(0.36f);
        r=cli.getTasa_anual();
        p=cli.getPrestamo();
        n=cli.getCuotas();

        c=(r*p)/(new Float(1)- Math.pow( new Float(1)+r,new Float(n)));

        return c;
    }

}
