package week7.Coding.QUE1;

public class DemoHorse {

    public static void main(String[] args) {

        Horse horse = new Horse();
        RaceHorse race = new RaceHorse();

        horse.setName("Man o'War");
        horse.setColor("Black");
        horse.setBirthYear(1997);
        race.setRacesCompeted(30);

        System.out.println("Horse Name: " + horse.getName() + "\nColor: " + horse.getColor() + "\nYear of Birth: " + horse.getBirthYear() + "\nRaces Competed: " + race.getRacesCompeted());

    }
}
