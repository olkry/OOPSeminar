import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HachModel;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", 21, 0111);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        // ModelList model = new ModelList(students);
        // View view = new View();
        // Controller control = new Controller(model, view);

        ModelFile fModel = new ModelFile("StudentDB.txt");
        // fModel.saveAllStudentToFile(students);

        iGetModel modelFile = fModel;
        iGetModel model = new ModelList(students);
        //Создадим и заполним новую модель для обработки хеш карт
        iGetModel modelHash = new HachModel(students);

        iGetView view = new View();
        // Создадим новый экземпляр для дз на английском
        iGetView viewEng = new ViewEng();

        Controller control = new Controller(model, view);
        //И новый контроллер на английском для дз
        Controller controlEng = new Controller(modelFile, viewEng);
        //Создадим контроллер для хеш-карты на английском
        Controller hashControl = new Controller(modelHash, viewEng);

        // control.update();

        // control.run();
        //Исполнение контроллера с инглиш 
        // controlEng.runEng();
        //Исполнение хеш-контроллера на английском
        hashControl.runHash();

        // //Потестируем класс HachModel 
        // HachModel studentHash = new HachModel();
        // studentHash.addStudent(students);
        // System.out.println(studentHash.getAllStudents());
        // studentHash.printHashStud();

    }
}
