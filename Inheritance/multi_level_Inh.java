public class multi_level_Inh{
    public static void main(String args[]){

        GOAT chase = new GOAT();

        chase.color = "brown";
        System.out.println(chase.color);
        chase.eats();
        chase.breath();
        chase.legs = 4;
        System.out.println(chase.legs);
        chase.body();
        chase.breed = "rocket";
        System.out.println(chase.breed);
        chase.chars();
        
    }

    }

    class animals{
        String color;
        void eats(){
            System.out.println("food");
        }
        void breath(){
            System.out.println("oxygen");
        }
    }
    class mammal extends animals{   
        int legs;
        void body(){
            System.out.println("warm blooded organism");
        }
    }
    class GOAT extends mammal{
        String breed;
        void chars(){
            System.out.println("majdur");
        }
    }
    