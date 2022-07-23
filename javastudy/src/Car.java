public class Car {
    private String color;
    private String vehecle;

    private static final String company = "현대자동차";
    private int number;

    public static void main(String[] args){

        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "빨강";
        car1.vehecle = "스포츠카";
        car1.number = 1111;

        car2.color = "파랑";
        car2.vehecle = "오토바이";
        car2.number = 2222;

        System.out.println(car1.color + ","+ car1.vehecle + "," + car1.number + "," +car1.company);
        System.out.println(car2.color + ","+ car2.vehecle + "," + car2.number + "," + car2.company);
    }


}


