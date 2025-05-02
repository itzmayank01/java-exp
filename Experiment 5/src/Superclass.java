package Experiment4;

class SuperClass {
    private int privateNum = 500119184; 

    public int getprivateNum() {
        return privateNum;
    }
}

class SubClass extends SuperClass {
    public void showPrivateMember() {
        System.out.println("Accessing private member using getter: " + getprivateNum());
    }
}

class PrivateMemberTest {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.showPrivateMember();
    }
}