package project;

abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void performDuty();
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    void performDuty() {
        System.out.println(name + " is preparing for OOPs Exam.");
    }
}

class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    void performDuty() {
        System.out.println(name + " is teaching that class.");
    }
}


