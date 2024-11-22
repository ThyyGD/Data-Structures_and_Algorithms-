package StudentManagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        ArrayListAddStudent addStudent = new ArrayListAddStudent();
        System.out.println(" Add Student ");
        addStudent.addStudent(students, new Student("BH001","May Nguyen", 8.0));

        addStudent.addStudent(students, new Student("BH002","Hoang Anh", 7.5));

        addStudent.addStudent(students, new Student("BH003","Mai", 6.0));
        System.out.println(" List data of students");
        for (Student s : students){
            System.out.println("ID = " + s.id +" , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }

        System.out.println(" Edit Student ");
        ArrayListEditStudent edit = new ArrayListEditStudent();
        edit.editStudent(students, 1, new Student("BH009", "Teo", 4));
        System.out.println(" List data of students after updated ");
        for (Student s : students){
            System.out.println("ID = " + s.id +" , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }
        System.out.println(" Edit Student By Id ");
        edit.editStudentById(students, "BH009", new Student("BH009", "Ty", 9.0));
        System.out.println("List data of students after updated by ID ");
        for (Student s : students){
            System.out.println("ID = " + s.id +" , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }

        System.out.println(" Remove Student ");
        ArrayListRemoveStudent removeSt = new ArrayListRemoveStudent();
        removeSt.removeStudentById(students, "BH009");
        System.out.println(" List data of students after removed by ID ");
        for (Student s : students){
            System.out.println("ID = " + s.id +" , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }






        System.out.println(" Binary Search Student By Id ");
        ArrayListSearchAStudent searchSt = new ArrayListSearchAStudent();
        String numberId = "BH001";
        int findSt = searchSt.binarySearch(students, numberId);
        if(findSt == -1){
            System.out.println("Can not found id = " + numberId);
        } else {
            System.out.println("found id = " + numberId);
        }

        System.out.println(" Sort Student by ID ");
        Collections.sort(students, Student.IdStudentComparator);
        System.out.println(" After sort ");
        for (Student str : students){
            System.out.println(str);
        }
        System.out.println(" Sort Student by Full name ");
        Collections.sort(students, Student.FullNameStduComparator);
        System.out.println(" After sort ");
        for (Student str : students){
            System.out.println(str);
        }
        System.out.println(" Sort Student by mark ");
        Collections.sort(students, Student.MarkStduComparator);
        System.out.println(" After sort ");
        for (Student str : students){
            System.out.println(str);
        }
    }

}



