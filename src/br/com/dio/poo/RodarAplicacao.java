package br.com.dio.poo;

public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Palio");
        carro1.setCapacidadeTanque(25.5);

        System.out.println(carro1.getCor()+" - "+carro1.getModelo()+" - "+ carro1.getCapacidadeTanque());
        System.out.println("Valor tanque cheio: R$"+carro1.totlaValorTanque(6.49));

        Carro carro2 = new Carro("Cinza","Mazda",35d);
        System.out.println(carro2.getCor()+" - "+carro2.getModelo()+" - "+ carro2.getCapacidadeTanque());
        System.out.println("Valor tanque cheio: R$"+carro2.totlaValorTanque(6.49));


    }
}
