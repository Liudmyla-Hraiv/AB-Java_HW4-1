package com.company;

public class Employee {

    public String firstName; //имя
    public String lastName; //фамилия
    public int age; //возраст
    public String team;  //команда
    public long salary; // зп
    public POSITION position; //позиция сотрудника

    public Employee (String firstName, String lastName, int age, String team, POSITION position){
        this(firstName, lastName, age, team, 0, position);
    }
    public Employee (String firstName, String lastName, int age, String team, long salary, POSITION position){

        if (age <18) {
            System.out.println("Incorrect age value");
        }

        this.firstName=firstName;
        this.lastName=lastName;
        this.age = age;
        this.team = team;
         if (salary == 0){
             salary = position.minSalary;

//             switch (position){
//                 case JUNIOR: salary = 500; break;
//                 case MIDDLE: salary = 2000; break;
//                 case SENIOR: salary= 5000; break;
//                 default: salary = -1000;
//             }

//           if (position == POSITION.JUNIOR) {salary = 500;}
//           if (position == POSITION.MIDDLE) {salary = 2000;}
//           if (position == POSITION.SENIOR) {salary = 5000;}
         }
         this.salary = salary;
        this.position = position;
    }


}
