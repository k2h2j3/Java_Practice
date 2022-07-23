public class Car {
    private String color;
    private String vehecle;
    private int number;
    private static final String company = "현대자동차";

    //생성자
    public Car(String color, String vehecle, int number){
        this.color = color;
        this.vehecle = vehecle;
        this.number = number;
    }

    public static void main(String[] args){

        Car car1 = new Car("빨강", "스포츠카", 1111);
        Car car2 = new Car("파랑", "오토바이", 2222);
        Car car3 = new Car("노랑","트럭", 3333);

        System.out.println(car1.color + ","+ car1.vehecle + "," + car1.number + "," +car1.company);
        System.out.println(car2.color + ","+ car2.vehecle + "," + car2.number + "," + car2.company);
        System.out.println(car3.color + ","+ car3.vehecle + "," + car3.number + "," +car3.company);
    }
}


