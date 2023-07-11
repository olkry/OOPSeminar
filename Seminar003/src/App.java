import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.AverageAge;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;
import Services.TeacherService;

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

        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Игорь", 23, 301);

        // PersonComparator<Student> comS = new PersonComparator<Student>();
        // comS.compare(s1, s2);

        // Teacher t1 = new Teacher("Иван", 25, "Docent");
        // Teacher t2 = new Teacher("Игорь", 23, "Proff");

        // PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        // comT.compare(t1, t2);

        // PersonComparator<Person> comP = new PersonComparator<Person>();
        // comP.compare(t1, s2);

        // Emploee e1 = new Emploee("Фёдрыч", 60, "разнорабочий");
        // // EmploeeController empControll = new EmploeeController();
        // // empControll.paySalary(e1);

        // EmploeeController.paySalary(e1);

        //Создадим пул учителей, с которыми будем работать
        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Proff");
        Teacher t3 = new Teacher("Валентина", 48, "Docent");
        Teacher t4 = new Teacher("Антонина", 64, "Proff");
        Teacher t5 = new Teacher("Сергей", 42, "Ingener");
        Teacher t6 = new Teacher("Екатерина", 27, "Laborant");
        // Заведём список учителей
        List<Teacher> tichList = new ArrayList<Teacher>();
        tichList.add(t1);
        tichList.add(t2);
        tichList.add(t3);
        tichList.add(t4);
        tichList.add(t5);
        tichList.add(t6); 
        System.out.println(tichList);
        System.out.println("==========================================================");
        //Как пользоваться сортировкой через compare не понятно совсем, а главное зачем(((
        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        // comT.compare(t1, t2);
        // comT.compare(t2, t3);
        // comT.compare(t3, t4);
        // comT.compare(t4, t5);
        // comT.compare(t5, t6);
        // List<Teacher> tichListSort = new ArrayList<Teacher>();
        // comT.compare(t1, t2);
        // tichListSort.add(t1);
        // comT.compare(t2, t3);
        // tichListSort.add(t2);
        // comT.compare(t3, t4);
        // tichListSort.add(t3);
        // comT.compare(t4, t5);
        // tichListSort.add(t4);
        // comT.compare(t5, t6);
        // tichListSort.add(t5);
        // tichListSort.add(t6); 
        // System.out.println(tichListSort);
        // Благодаря Давиду понял, как применить компоратор и осортировать по возрасту, от старшего.
        tichList.sort(comT);
        System.out.println(tichList);
        

        // Для 3го задания создаем коллекции 3х класов
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);

        Emploee e1 = new Emploee("Фёдрыч", 60, "разнорабочий");
        Emploee e2 = new Emploee("Мыхалыч", 42, "разнорабочий");
        Emploee e3 = new Emploee("Петька", 18, "разнорабочий");
        List<Emploee> emploeesList = new ArrayList<Emploee>();
        emploeesList.add(e1);
        emploeesList.add(e2);
        emploeesList.add(e3);

        //Выводим средние показатели возраста
        AverageAge tichersAge = new AverageAge<>(tichList);
        System.out.println("Средний возраст всех учителей = " + tichersAge.averAge());
        AverageAge studentAge = new AverageAge<>(listStud1);
        System.out.println("Средний возраст всех студентов = " + studentAge.averAge());
        AverageAge emploeesAge = new AverageAge<>(emploeesList);
        System.out.println("Средний возраст всех рабочих = " + emploeesAge.averAge());
        
    }
}