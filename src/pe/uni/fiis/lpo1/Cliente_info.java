package pe.uni.fiis.lpo1;

/**
 * Created by Junior Raúl on 22/05/2015.
 */
public class Cliente_info {
    private Float prestamo;
    private Float tasa_anual;    //tasa anual
    private Integer cuotas;    //total de cuotas

    public Float getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Float prestamo) {
        this.prestamo = prestamo;
    }

    public Float getTasa_anual() {
        return tasa_anual;
    }

    public void setTasa_anual(Float tasa_anual) {
        this.tasa_anual = tasa_anual;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    /*
    pago=(r*prestamo)/(1-(1+r)^(-n))
    r=tasa_mensual  n=total de meses
     */

}
