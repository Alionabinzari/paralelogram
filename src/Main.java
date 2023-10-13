public class Main {
    public static void main(String[] args)
    {
        Paralelogram paralelogram =new Paralelogram();

        int  perimetru = paralelogram.calculatePerimeter(5, 3);

        System.out.println("Perimetru - "+perimetru);

        double area = paralelogram.calculateArea(5, 3.5);

        System.out.println("Area - " + area);
    }
}