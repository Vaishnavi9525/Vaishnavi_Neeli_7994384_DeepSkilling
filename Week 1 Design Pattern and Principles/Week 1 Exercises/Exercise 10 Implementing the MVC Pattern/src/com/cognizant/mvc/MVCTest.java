package com.cognizant.mvc;

public class MVCTest {

    public static void main(String[] args) {

        Student model = new Student();

        model.setName("Rahul");
        model.setId("101");
        model.setGrade("A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(
                        model,
                        view);

        controller.updateView();

        System.out.println();

        controller.setStudentName(
                "Priya");

        controller.setStudentGrade(
                "A+");

        controller.updateView();
    }
}