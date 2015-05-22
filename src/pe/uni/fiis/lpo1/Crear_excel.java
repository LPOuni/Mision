package pe.uni.fiis.lpo1;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;


public class Crear_excel {

    public static void main(String[] args) {

        Workbook wb = new HSSFWorkbook();
        Sheet simulacion = wb.createSheet("hoja_simulacion");
        Row fila;
        Cell celda;
        Font fuente =wb.createFont();
        fuente.setFontHeightInPoints((short) 12);
        fuente.setFontName("Arial");

        Cliente_info informacion = new Cliente_info();
        Simulacion_Pago s= new Simulacion_Pago();
        Float i;    //interes mensual

        fila = simulacion.createRow(3);
        celda = fila.createCell(2);
        celda.setCellType(HSSFCell.CELL_TYPE_STRING);
        celda.setCellValue("Numero de Cuota");
        celda = fila.createCell(4);
        celda.setCellValue("Amortizacion mensual");
        celda = fila.createCell(6);
        celda.setCellValue("Interes mensual");
        celda = fila.createCell(8);
        celda.setCellValue("Valor de cuota mensual");

        s.setAmortización(1000f);

        informacion.setCuotas(24);
        fila = simulacion.createRow(4);
        celda.setCellType(HSSFCell.CELL_TYPE_STRING);
        celda =fila.createCell(2);
        celda.setCellValue(informacion.getCuotas());
        celda = fila.createCell(4);
        celda.setCellValue(s.getAmortización();
        celda = fila.createCell(6);
        i= informacion.getTasa_anual()/ (float) informacion.getCuotas();
        celda.setCellValue(i);
        celda = fila.createCell(8);
        celda.setCellValue(s.getValor_cuota());


        informacion.setCuotas(36);
        fila = simulacion.createRow(4);
        celda.setCellType(HSSFCell.CELL_TYPE_STRING);
        celda =fila.createCell(2);
        celda.setCellValue(informacion.getCuotas());
        celda = fila.createCell(4);
        celda.setCellValue(s.getAmortización();
        celda = fila.createCell(6);
        i= informacion.getTasa_anual()/ (float) informacion.getCuotas();
        celda.setCellValue(i);
        celda = fila.createCell(8);
        celda.setCellValue(s.getValor_cuota());


        informacion.setCuotas(48);
        fila = simulacion.createRow(4);
        celda.setCellType(HSSFCell.CELL_TYPE_STRING);
        celda =fila.createCell(2);
        celda.setCellValue(informacion.getCuotas());
        celda = fila.createCell(4);
        celda.setCellValue(s.getAmortización();
        celda = fila.createCell(6);
        i= informacion.getTasa_anual()/ (float) informacion.getCuotas();
        celda.setCellValue(i);
        celda = fila.createCell(8);
        celda.setCellValue(s.getValor_cuota());
    }

}
