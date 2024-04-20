
// Base class
class Sports {
    // Method in the base class
    void play() {
        System.out.println("Playing...");
    }
}


class Football extends Sports {
   
    @Override
    void play() {
        System.out.println("Playing Football!");
    }
}


class Basketball extends Sports {
   
    @Override
    void play() {
        System.out.println("Playing Basketball!");
    }
}


class Rugby extends Sports {
    
    @Override
    void play() {
        System.out.println("Playing Rugby!");
    }
}

public class Example2 {
    public static void main(String[] args) {
        // Create objects of each subclass
        Sports genericSport = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        
        System.out.println("Generic Sports:");
        genericSport.play(); 
        System.out.println("\nFootball:");
        football.play(); 
        System.out.println("\nBasketball:");
        basketball.play(); 
        System.out.println("\nRugby:");
        rugby.play(); //
    }
}

