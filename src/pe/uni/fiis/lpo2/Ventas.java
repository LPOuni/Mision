package pe.uni.fii.lpo2;

public class Ventas {
    private Float venta_dia;    //se incluye el igv
    private Integer cant_dia;
    public Float getBono (Float venta_dia, Integer cant_dia){
        Float monto=venta_dia*new Float(1-0.18);//descontando el IGV
        Float bono=0f;
        if (monto>1500f){
            bono = monto*0.07f;
        }else {
            if (monto > 1000f) {
                bono = monto * 0.05f;
            } else{if (monto < 500f) {
                bono = monto * 0.03f;
                  }else {bono= monto * 0.03f;}
            }
        }
        if (cant_dia>100){
            bono=bono+100;
        }else {
            if (cant_dia>40){
                bono=bono+50;
            }else {if (cant_dia<30){
                bono=bono+20;
                }   else{
                    bono=bono+20;}
            }
        }
        return bono;
    }

    public Float getVenta_dia() {
        return venta_dia;
    }

    public void setVenta_dia(Float venta_dia) {
        this.venta_dia = venta_dia;
    }

    public Integer getCant_dia() {
        return cant_dia;
    }

    public void setCant_dia(Integer cant_dia) {
        this.cant_dia = cant_dia;
    }

    public static void main(String[] args) {
        Ventas v=new Ventas();
        v.setCant_dia(35);
        v.setVenta_dia(700f);
        System.out.println("cantidad de ventas: "+v.getCant_dia()+
                "\nmonto de las ventas(incluye IGV): "+v.getVenta_dia()+
                "\nbono: "+v.getBono(v.getVenta_dia(),v.getCant_dia()));
    }
}
