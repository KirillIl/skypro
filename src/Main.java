public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        // Задание 1
        System.out.println("Задание 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляем с совершенолетием!!! Теперь тебе " + age +" лет");
        }
        if (age < 18) {
            System.out.println("Твой возрвст совершенолетия не наступил, необходимо немного подождать :(");
        }
        // Задание 2
        System.out.println("Задание 2");
        if(age >= 7 && age < 18){
            System.out.println("Ребенок ходит в школу, так как ему " + age + " лет");
        }
        if (age >= 18 && age < 24){
            System.out.println("Закончил школу и может отправляться в университет");
        }
        if (age >= 24){
            System.out.println("Закончил университет, теперь можешь работать!");
        }
        //Задание 3
        System.out.println("Задание 3");
        int capacityOneWagon = 102;
        int seatPlace = 60;
        int standingPlace = capacityOneWagon - seatPlace;

        int seatPlaceUsed = 34;
        int standingPlaceUsed = 12;
        int totalSeatsUsed = seatPlaceUsed + standingPlaceUsed;

        if (seatPlaceUsed < seatPlace) {
            System.out.println("Осталось сидячих мест " + (seatPlace - seatPlaceUsed));
        }
        if (standingPlaceUsed < standingPlace) {
            System.out.println("Осталось стоячих мест " + (standingPlace - standingPlaceUsed));
        }
        if (totalSeatsUsed >= capacityOneWagon){
            System.out.println("В вагоне уже нет мест!");
        }
        if (totalSeatsUsed <= capacityOneWagon){
            System.out.println( "Всего мест осталось в вагоне " + (capacityOneWagon - totalSeatsUsed) +
                    ", из них сидячих " + (seatPlace-seatPlaceUsed) + ", а стоячих " + (standingPlace - standingPlaceUsed));
        }

    }

}