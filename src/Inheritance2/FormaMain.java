package Inheritance2;

public class FormaMain {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();

        forma.calcolaArea();

        double areaRettangolo= rettangolo.calcolaArea();
        double areaTriangolo= triangolo.calcolaArea();
    }

}
