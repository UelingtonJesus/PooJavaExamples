package br.com.dio.poo;

public class Carro {
    private String cor, modelo;
    private double capacidadeTanque;

    Carro(){

    }

    Carro(String cor, String modelo, double capacidadeTanque){

        this.cor=cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setCapacidadeTanque(double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    double getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totlaValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
