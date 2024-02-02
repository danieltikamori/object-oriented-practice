public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println(person.showHelloWorld());
        System.out.println(person.getPersonName());
        System.out.println(person.getPersonAge());

        Calculator calculator = new Calculator();
        int result = calculator.doubleNumber(47);
        System.out.println(result);

        Music myMusic = new Music();
        myMusic.musicTitle = "Toccata and Fugue in D Minor";
        myMusic.artistName = "J. S. Bach";
        myMusic.launchYear = 1708;

        myMusic.showMusicDetails();

        myMusic.giveRating(4.5);
        myMusic.giveRating(5.0);
        myMusic.giveRating(3.0);

        double ratingAverage = myMusic.getRatingAverage();
        System.out.println("Rating average: " + ratingAverage);

        Car myCar = new Car();
        myCar.carModel = "Porsche Cayenne Turbo E-Hybrid";
        myCar.carYear = 2024;
        myCar.carColor = "Black";

        myCar.showCarDetails();

        System.out.println("The car age is: " + myCar.calculateCarAge());

        Student myStudent = new Student();
        myStudent.studentName = "John";
        myStudent.studentAge = 20;

        myStudent.studentDetails();
    }
}
