package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public Pria(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void PDKT(Perempuan calon){
        if(this.getTemanKencan() == null){
            this.temanKencan = calon;
        }

    }

    public void MengajakKencan(Perempuan perempuan){
        if(perempuan.equals(this.getTemanKencan()) ){
            this.setJumlahCinta(this.getJumlahCinta()+1);
        }
        else{
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG\nKAU JANGAN TIDAK SETIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!");
        }
    }

    public void MenembakKekasih(){
        if (this.getTemanKencan() != null && this.getJumlahCinta() >= this.getTemanKencan().getStandarJumlahCinta()){
            this.setJodoh(this.getTemanKencan());
            this.setStatus("Pacaran");
            System.out.println("SELAMAT KAMU DITERIMA :D | SELAMAT MENJALANI HIDUP BARU "+this.getNama());
        }
        else{
            System.out.println("SIAPA YANG MAU KAU TEMBAK :') | JANGAN NGAYAK DEH "+this.getNama()+"!!!");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getJumlahCinta() {
        return jumlahCinta;
    }

    public void setJumlahCinta(double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public Perempuan getJodoh() {
        return jodoh;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public Perempuan getTemanKencan() {
        return temanKencan;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }
}
