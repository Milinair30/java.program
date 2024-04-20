

class Animal {
    public void move() {
        System.out.println("Animal moves");
    }
}


class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("Cheetah runs");
    }
}


public class Lab3_3 {
    public static void main(String[] args) {
       
        Cheetah cheetah = new Cheetah();
       
        cheetah.move();
    }
}
