public class App {
    public static void main(String[] args) {

        Character F22 = new Character();

        F22.name = "F22-Raptor";
        F22.sayMyName();
        F22.speed = 2.25;
        F22.sayMySpeed();
        F22.range = 1600;
        F22.sayMyRange();

        Character F35 = new Character();

        F35.name = "F35";
        F35.sayMyName();
        F35.speed = 1.30;
        F35.sayMySpeed();
        F35.range = 670;
        F35.sayMyRange();

        Character A10 = new Character();

        A10.name = "A10-Warthog";
        A10.sayMyName();
        A10.speed = 0.70;
        A10.sayMySpeed();
        A10.range = 1500;
        A10.sayMyRange();

        Character Archer = new Character();

        Archer.name = "Robin Hood";
        Archer.sayMyName();
        Archer.strength = 5;
        Archer.sayMyStrength();
        Archer.agility = 10;
        Archer.sayMyAgility();
        Archer.intelligence = 0;
        Archer.sayMyIntelligence();
        

        Character Priest = new Character();

        Priest.name = "Skyarch";
        Priest.sayMyName();
        Priest.strength = 3;
        Priest.sayMyStrength();
        Priest.agility = 2;
        Priest.sayMyAgility();
        Priest.intelligence = 10;
        Priest.sayMyIntelligence();
    }
}
