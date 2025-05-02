package Experiment4;

class Player {
 String name;
 int age;
 String position;

 public Player(String name, int age, String position) {
     this.name = name;
     this.age = age;
     this.position = position;
 }

 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Position: " + position);
 }

 public void play() {
     System.out.println(name + " is playing.");
 }

 public void train() {
     System.out.println(name + " is training.");
 }
}

class Cricket_Player extends Player {
 public Cricket_Player(String name, int age, String position) {
     super(name, age, position);
 }

 public void play() {
     System.out.println(name + " is batting/bowling in a cricket match.");
 }
}

class Football_Player extends Player {
 public Football_Player(String name, int age, String position) {
     super(name, age, position);
 }

 public void play() {
     System.out.println(name + " is playing football as a " + position + ".");
 }
}

class Hockey_Player extends Player {
 public Hockey_Player(String name, int age, String position) {
     super(name, age, position);
 }

 public void play() {
     System.out.println(name + " is playing hockey as a " + position + ".");
 }
}

class SportsDemo {
 public static void main(String[] args) {    
     Cricket_Player cricketer = new Cricket_Player("Virat Kohli", 34, "Batsman");
     Football_Player footballer = new Football_Player("Cristiano Ronaldo", 39, "Forward");
     Hockey_Player hockeyPlayer = new Hockey_Player("Manpreet Singh", 32, "Midfielder");

     System.out.println("Cricket Player Details:");
     cricketer.displayInfo();
     cricketer.play();
     cricketer.train();
     System.out.println();

     System.out.println("Football Player Details:");
     footballer.displayInfo();
     footballer.play();
     footballer.train();
     System.out.println();

     System.out.println("Hockey Player Details:");
     hockeyPlayer.displayInfo();
     hockeyPlayer.play();
     hockeyPlayer.train();
 }
}
