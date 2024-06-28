package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // copy from here...
    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person newPerson = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson.setFirstname("Teddy");
        newPerson.setLastname("Archibald");
        newPerson.setHavePets("No");
        newPerson.setFavoriteColor("Red");
        newPerson.setBirthMonth("March");
        newPerson.setFavoriteBeverage("Half&Half");
        students.add(newPerson);

        Person newPerson1 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson1.setFirstname("Peter");
        newPerson1.setLastname("Van Beever");
        newPerson1.setHavePets("Yes");
        newPerson1.setFavoriteColor("Purple");
        newPerson1.setBirthMonth("February");
        newPerson1.setFavoriteBeverage("Latte");
        students.add(newPerson1);

        Person newPerson2 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson2.setFirstname("Tim");
        newPerson2.setLastname("Van Linkous");
        newPerson2.setHavePets("No");
        newPerson2.setFavoriteColor("Blue");
        newPerson2.setBirthMonth("September");
        newPerson2.setFavoriteBeverage("Water");
        students.add(newPerson2);

        Person newPerson3 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson3.setFirstname("Qian");
        newPerson3.setLastname("Wang");
        newPerson3.setHavePets("No");
        newPerson3.setFavoriteColor("Blue");
        newPerson3.setBirthMonth("October");
        newPerson3.setFavoriteBeverage("Water");
        students.add(newPerson3);

        Person newPerson4 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson4.setFirstname("Diptika");
        newPerson4.setLastname("Devi");
        newPerson4.setHavePets("No");
        newPerson4.setFavoriteColor("Orange");
        newPerson4.setBirthMonth("June");
        newPerson4.setFavoriteBeverage("Tea");
        students.add(newPerson4);

        Person newPerson5 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson5.setFirstname("Ian");
        newPerson5.setLastname("Gordon");
        newPerson5.setHavePets("Yes");
        newPerson5.setFavoriteColor("Orange");
        newPerson5.setBirthMonth("June");
        newPerson5.setFavoriteBeverage("Tea");
        students.add(newPerson5);

        Person newPerson6 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson6.setFirstname("Tim");
        newPerson6.setLastname("Nguyen");
        newPerson6.setHavePets("Yes");
        newPerson6.setFavoriteColor("White");
        newPerson6.setBirthMonth("November");
        newPerson6.setFavoriteBeverage("Bubble Tea");
        students.add(newPerson6);

        Person newPerson7 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson7.setFirstname("Bryan");
        newPerson7.setLastname("Smith");
        newPerson7.setHavePets("No");
        newPerson7.setFavoriteColor("Brown");
        newPerson7.setBirthMonth("May");
        newPerson7.setFavoriteBeverage("Water");
        students.add(newPerson7);

        Person newPerson8 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson8.setFirstname("Johnathan");
        newPerson8.setLastname("Diehl");
        newPerson8.setHavePets("No");
        newPerson8.setFavoriteColor("Green");
        newPerson8.setBirthMonth("May");
        newPerson8.setFavoriteBeverage("Coffee");
        students.add(newPerson8);

        Person newPerson9 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson9.setFirstname("Jared");
        newPerson9.setLastname("Thacker");
        newPerson9.setHavePets("Yes");
        newPerson9.setFavoriteColor("Green");
        newPerson9.setBirthMonth("December");
        newPerson9.setFavoriteBeverage("Water");
        students.add(newPerson9);

        Person newPerson10 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson10.setFirstname("Robbie");
        newPerson10.setLastname("Niemeyer");
        newPerson10.setHavePets("No");
        newPerson10.setFavoriteColor("Blue");
        newPerson10.setBirthMonth("January");
        newPerson10.setFavoriteBeverage("Water");
        students.add(newPerson10);

        Person newPerson11 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson11.setFirstname("Mohammed");
        newPerson11.setLastname("N");
        newPerson11.setHavePets("No");
        newPerson11.setFavoriteColor("Green");
        newPerson11.setBirthMonth("August");
        newPerson11.setFavoriteBeverage("Snapple");
        students.add(newPerson11);

        Person newPerson12 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson12.setFirstname("Jousue");
        newPerson12.setLastname("Castro");
        newPerson12.setHavePets("Yes");
        newPerson12.setFavoriteColor("Blue");
        newPerson12.setBirthMonth("June");
        newPerson12.setFavoriteBeverage("Coffee");
        students.add(newPerson12);

        Person newPerson13 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson13.setFirstname("Corey");
        newPerson13.setLastname("Ross");
        newPerson13.setHavePets("No");
        newPerson13.setFavoriteColor("Black");
        newPerson13.setBirthMonth("October");
        newPerson13.setFavoriteBeverage("Water");
        students.add(newPerson13);

        Person newPerson14 = new Person("Teddy", "Archibald", "Red", "March", "Half&Half", "no");
        newPerson14.setFirstname("Will");
        newPerson14.setLastname("Chapman");
        newPerson14.setHavePets("No");
        newPerson14.setFavoriteColor("Purple");
        newPerson14.setBirthMonth("December");
        newPerson14.setFavoriteBeverage("Water");
        students.add(newPerson14);


        // and so on for EACH person in the cohort.

        return students;
    }

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        //String[] values = line.split(COMMA_DELIMITER);
        //Person newPerson = new Person(values[0], values[1]);
        //return newPerson;
        return null;
    }
}
