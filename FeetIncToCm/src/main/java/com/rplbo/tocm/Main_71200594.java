package com.rplbo.tocm;

public class Main_71200594 {
    public static void main(String[] args) {
        System.out.println("Nilai dalam centimeter : "+FeetIncToCm(1,3)+" cm");
        System.out.println("Nilai dalam centimeter : "+FeetIncToCm(15)+" cm");

        System.out.println("\n");

        System.out.println("Nilai dalam centimeter : "+FeetIncToCm(12,5)+" cm");
        System.out.println("Nilai dalam centimeter : "+FeetIncToCm(30)+" cm");
    }

    public static double FeetIncToCm(int angkaInc){
        if(angkaInc > 0){
            int incToFeet = angkaInc / 12;
            int sisaIncToFeet = angkaInc - (incToFeet*12);
            System.out.println(angkaInc + " inc = "+ (double)incToFeet + " feet " + (double)sisaIncToFeet + " inc");
            return FeetIncToCm(incToFeet,sisaIncToFeet);
        }
        else{
            return -1.0;
        }
    }

    public static double FeetIncToCm(double angkaFeet, double angkaInc){
        if(angkaFeet > 0 && angkaInc > 0 && angkaInc <= 12){
            double feetCm = (angkaFeet * 12) * 2.54;
            double incCm =  angkaInc * 2.54;
            return feetCm + incCm;
        }
        else{
            return -1.0;
        }
    }
}
