import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Игорь", 23, 301);
        // Student s3 = new Student("Иван", 22, 121);
        // Student s4 = new Student("Игорь",  23, 444);
        // Student s5 = new Student("Даша",  23, 171);
        // Student s6 = new Student("Лена",  23, 104);
        // /**
        //  * Создаём несколько списков со студентами, которых передадим в группы
        //  */
        // List<Student> listStud1 = new ArrayList<Student>();
        // List<Student> listStud2 = new ArrayList<Student>();
        // List<Student> listStud3 = new ArrayList<Student>();
        // listStud1.add(s1);
        // listStud1.add(s2);
        // listStud1.add(s3);
        // listStud2.add(s4);
        // listStud2.add(s5);
        // listStud3.add(s6);

        // /**
        //  * передаём студентов в группы
        //  */
        // StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        // StudentGroup group4590 = new StudentGroup(listStud2, 4590);
        // StudentGroup group4600 = new StudentGroup(listStud3, 4600);
        // // System.out.println(group4580);
        // // System.out.println(group4590);
        // // System.out.println(group4600);

        // /**
        //  * создаём список групп
        //  */
        // List<StudentGroup> groups = new ArrayList<StudentGroup>();
        // groups.add(group4580);
        // groups.add(group4590);
        // groups.add(group4600);


        // /**
        //  * Передаём список в новый класс
        //  */
        // StudentSteam steamGroups = new StudentSteam(groups, 128);
        
        // /**
        //  * Теперь выведем отдельно каждую группу потока
        //  */
        // for (StudentGroup group : steamGroups.getSteam()) {
        //     System.out.println(group);
        // }
        // System.out.println("=========================================================");

        // /**
        //  * Осортеруем полученный список по количеству человек в группах от меньшего к большему
        //  * и выведем их.
        //  */
        // Collections.sort(groups);

        // for (StudentGroup group : steamGroups.getSteam()) {
        //     System.out.println(group);
        // }


        

        // // for(Student std : group4580)
        // // {
        // //     System.out.println(std);
        // // }

        // // System.out.println("=========================================================");

        // // Collections.sort(group4580.getGroup());

        // // for(Student std: group4580.getGroup())
        // // {
        // //     System.out.println(std);
        // // }

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s1, s2);

        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Proff");

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(t1, s2);

        Emploee e1 = new Emploee("Фёдрыч", 60, "разнорабочий");
        // EmploeeController empControll = new EmploeeController();
        // empControll.paySalary(e1);

        EmploeeController.paySalary(e1);
    }
}