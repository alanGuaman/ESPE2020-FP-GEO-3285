package ec.edu.espe.gps.controller;

import ec.edu.espe.gps.model.GPS;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

public class GPSController {
    public static void save(GPS gps){
        String data = gps.getLatDegrees()+"; "+gps.getLatMinutes()+"; "+gps.getLatSeconds()
                +"; "+gps.getLenDegrees()+"; "+gps.getLenMinutes()+"; "+gps.getLenSeconds()+".";
        FileManager.save(data, "GPS");
    }
    
    public static String readCsv(String direction){
        String text = "";
        try{ 
            BufferedReader bf = new BufferedReader(new FileReader(direction));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead + "\n";
            }
           text = temp;
            
        }catch(Exception e){
            System.out.println("");
        }
    return text;
    }
    
    public static double turnLatitudeDMStoDD(double grados, double minutos, double segundos){
        double dd;
        dd = -(grados + (minutos / 60) + (segundos / 3600));
        return dd;
    }

    public static double turnLongitudDMStoDD(double grados, double minutos, double segundos){
        double dd;
        dd = -(grados + (minutos / 60) + (segundos / 3600));
        return dd;
    }

    public static double turnLatitudDDtoUTM(double x){
        double latitud;
        latitud = -(x * 2261291.013);
        return latitud;
    }

    public static double turnLongitudDDtoUTM(double y){
        double longitud;
        longitud = -(y * 126798.6481);
        return longitud;
    }

    public static double computePerimeter3Points(double px1, double px2, double px3,
            double py1, double py2, double py3){
        double per;
        per = Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                + Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2))
                + Math.sqrt((px1 - px3) * (px1 - px3) + (py1 - py3) * (py1 - py3));
        return per;
    }

    public static double computePerimeter4Points(double px1, double px2, double px3,
            double px4, double py1, double py2, double py3, double py4){
        double per;
        per = Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                + Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2))
                + Math.sqrt((px4 - px3) * (px4 - px3) + (py4 - py3) * (py4 - py3))
                + Math.sqrt((px1 - px4) * (px1 - px4) + (py1 - py4) * (py1 - py4));
        return per;
    }

    public static double computePerimeter5Points(double px1, double px2, double px3,
            double px4, double px5, double py1, double py2, double py3, double py4,
            double py5){
        double per;
        per = Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                + Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2))
                + Math.sqrt((px4 - px3) * (px4 - px3) + (py4 - py3) * (py4 - py3))
                + Math.sqrt((px5 - px4) * (px5 - px4) + (py5 - py4) * (py5 - py4))
                + Math.sqrt((px1 - px5) * (px1 - px5) + (py1 - py5) * (py1 - py5));
        return per;
    }

    public static double computeArea3Points(double px1, double px2, double px3,
            double py1, double py2, double py3){
        double area;
        area = Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                * Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2));
        return area;
    }

    public static double computeArea4Points(double px1, double px2, double px3,
            double px4, double py1, double py2, double py3, double py4){
        double area;
        area = Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                * Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2));
        return area;
    }

    public static double computeArea5Points(double px1, double px2, double px3,
            double px4, double px5, double py1, double py2, double py3, double py4,
            double py5){
        double area;
        area = (Math.sqrt((px2 - px1) * (px2 - px1) + (py2 - py1) * (py2 - py1))
                * Math.sqrt((px3 - px2) * (px3 - px2) + (py3 - py2) * (py3 - py2))) / 2
                + (Math.sqrt((px4 - px3) * (px4 - px3) + (py4 - py3) * (py4 - py3))
                * Math.sqrt((px5 - px4) * (px5 - px4) + (py5 - py4) * (py5 - py4))) / 2;
        return area;
    }
    
}
