package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData() {
        //create six student object by calling Student class parameterized constructor
        Student s1 = new Student("Sohan", 1, 20);
        Student s2 = new Student("Mohan", 2, 24);
        Student s3 = new Student("Shah", 3, 40);
        Student s4 = new Student("Najin", 4, 10);
        Student s5 = new Student("Zyan", 5, 34);
        Student s6 = new Student("Wassim", 6, 28);

        //create HashSet object and add all the students object inside it
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s6);
        //return the HashSet object


        return studentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet) {
        //Create a TreeSet object
        Set<String> treeSet = new TreeSet<>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> itr = studentSet.iterator();
        //get all the name and add it inside the TreeSet object
        while (itr.hasNext()) {
            //return the TreeSet object;
            Student obj = itr.next();
            treeSet.add(obj.getName());
        }
        return treeSet;
    }

    public static Map<String, Integer> calculateAverage(Set<Student> studentSet) {
        //create a HashMap object of type <String,Integer>
        HashMap<String, Integer> hashMap = new HashMap<>();
        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //retrieve the Student object from the iterator
        while (iterator.hasNext()) {
            Student obj = iterator.next();
            hashMap.put(obj.getName(), obj.getTotalMarks());
        }
        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

        return hashMap;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
