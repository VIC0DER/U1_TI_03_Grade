package org.example;

import Model.Student;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //Contador para los ciclos for externos
        int i;
        //Creamos un objeto DecimalFormat para formatear el promedio final con 2 decimales
        DecimalFormat df = new DecimalFormat("#.##");
        //Creamos un arreglo de 5 estudiantes
        Student[] students = new Student[5];
        //Creamos un arreglo de 5 nombres para su asignacion a cada estudiante
        String[] names = {"Victor", "Damian", "Santiago", "Oscar", "Alejandro"};
        //Recorremos el arreglo de estudiantes
        for(i = 0; i < students.length; i++) {
            students[i] = new Student(); //Se tiene que instanciar el objeto para cada estudiante
            students[i].setName(names[i]); //Asignamos el nombre del arreglo de nombres
            students[i].setStudentId("20243ds0" + (i + 1)); //Asignamos una matricula a cada estudiante
            for (int j = 0; j < 5; j++) { //Creamos otro ciclo for para asignar las calificaciones
                students[i].setGrades(Math.random() * 10, j); //Asignamos una calificacion aleatoria en escala de 0 a 10
            }
        }
        //Muestreo de datos de cada uno de los estudiantes
        for(i = 0; i < students.length; i++){
            System.out.println("---Estudiante " + (i + 1) + "---");
            System.out.println("Nombre: " + students[i].getName());
            System.out.println("Promedio: " + df.format(students[i].getAverage()));
            System.out.println("¿Aprobado? " + (students[i].isApproved() ? "Si" : "No"));
        }
    }
}