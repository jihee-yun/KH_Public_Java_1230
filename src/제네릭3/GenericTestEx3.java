package 제네릭3;

public class GenericTestEx3 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder()); // Powder 타입의 객체를 만들어서 주입
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic);

        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
        waterPrinter.setMaterial(new Water());
        Water water = waterPrinter.getMaterial();
        System.out.println(water);

    }
}
