import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);
        /**
         * Создаём несколько списков со студентами, которых передадим в группы
         */
        List<Student> listStud1 = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();
        List<Student> listStud3 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud2.add(s4);
        listStud2.add(s5);
        listStud3.add(s6);

        /**
         * передаём студентов в группы
         */
        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        StudentGroup group4590 = new StudentGroup(listStud2, 4590);
        StudentGroup group4600 = new StudentGroup(listStud3, 4600);
        // System.out.println(group4580);
        // System.out.println(group4590);
        // System.out.println(group4600);

        /**
         * создаём список групп
         */
        List<StudentGroup> groups = new ArrayList<StudentGroup>();
        groups.add(group4580);
        groups.add(group4590);
        groups.add(group4600);


        /**
         * Передаём список в новый класс
         */
        StudentSteam steamGroups = new StudentSteam(groups, 128);
        
        /**
         * Теперь выведем отдельно каждую группу потока
         */
        for (StudentGroup group : steamGroups.getSteam()) {
            System.out.println(group);
        }
        System.out.println("=========================================================");

        /**
         * Осортеруем полученный список по количеству человек в группах от меньшего к большему
         * и выведем их.
         */
        Collections.sort(groups);

        for (StudentGroup group : steamGroups.getSteam()) {
            System.out.println(group);
        }


        

        // for(Student std : group4580)
        // {
        //     System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for(Student std: group4580.getGroup())
        // {
        //     System.out.println(std);
        // }
    }
}