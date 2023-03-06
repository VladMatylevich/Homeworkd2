public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var frient = 19;
        System.out.println(frient);
        frient = frient + 2;
        System.out.println(frient);
        frient = frient / 7;
        System.out.println(frient);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var Tyson = 78.2;
        var Tommy = 82.7;
        var capacityLeft = Tyson + Tommy;
        System.out.println("Oбщий вес + capacityLeft");
        System.out.println("общий вес " + capacityLeft);
        var LeftWeight = Tyson - Tommy;
        System.out.println("разница в весе " + LeftWeight + "кг! ");
        var Overload = Tommy % Tyson;
        System.out.println("разница в весе с остатком деления " + Overload + "кг! ");
        var hours = 640;
        var SlavaTime = 8;
        var NumberSlaves = hours / SlavaTime;
        System.out.println("Всего работников в компании" + NumberSlaves + " человек");
        var slave = 94;
        var SommonSlave = NumberSlaves + slave;
        System.out.println("Общее количество" + SommonSlave + "работника");
        var workinghouse = hours / SommonSlave;
        System.out.println("Если в компании работает" + SommonSlave + "человек, то всего" + workinghouse + "часов работы может быть поделено между сотрудниками");
    }
}
