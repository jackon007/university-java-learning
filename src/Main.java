class Main {
    public  static void main(String[] args) {
        Car car1 = new Car("Camry", "Toyota", 2024, 30000, "Black", 5);
        System.out.println(car1.toString());

        car1.setYear(2026);
        System.out.println(car1.toString());

        car1.sell();
        System.out.println(car1.toString());

        car1.delivery();
        car1.delivery();
        System.out.println(car1.toString());




        System.out.println(car1.getModel());
        System.out.println(car1.getBrand());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        System.out.println(car1.getPrice());
        System.out.println(car1.getQuantity());



    }
}