package com.company;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(6);
        Shape circle1 = new Circle(8);
        Shape square = new Square(7);
        Shape square1 = new Square(9);
        Shape triangle = new Triangle(9, 8, 7);
        Shape triangle1 = new Triangle(7, 6, 5);
        Shape sphere = new Sphere(7);
        Shape sphere1 = new Sphere(9);
        Shape cube = new Cube(6);
        Shape cube1 = new Cube(8);
        Shape tetrahedron = new Tetrahedron(7);
        Shape tetrahedron1 = new Tetrahedron(71);
        System.out.println("Area of all Shape");
        showShape(circle);
        showShape(circle1);
        showShape(square);
        showShape(sphere1);
        showShape(square1);
        showShape(triangle);
        showShape(triangle1);
        showShape(sphere);
        showShape(cube);
        showShape(cube1);
        showShape(tetrahedron);
        showShape(tetrahedron1);

        System.out.println("Perimeter and Volume of all Shape");
       Circle cerc=((Circle) circle);
       Circle cerc1= ((Circle) circle1);
        Triangle triunghi=((Triangle) triangle);
        Triangle triunghi1=((Triangle) triangle1);
        Square patrat=((Square) square);
        Square patrat1=((Square) square1);
        Sphere sfera=((Sphere) sphere);
        Sphere sfera1=((Sphere) sphere1);
        Cube cub=((Cube) cube);
        Cube cub1=((Cube) cube1);
        Tetrahedron piramida=((Tetrahedron) tetrahedron);
        Tetrahedron piramida1=((Tetrahedron) tetrahedron1);
        showShape1(cerc);
        showShape1(cerc1);
        showShape1(triunghi);
        showShape1(triunghi1);
        showShape1(patrat);
        showShape1(patrat1);
        showShape2(sfera);
        showShape2(sfera1);
        showShape2(cub);
        showShape2(cub1);
        showShape2(piramida);
        showShape2(piramida1);
       
    }

    public static void showShape(Shape shape) {
        String word = String.format("%1.2f", shape.getArea());
        System.out.println(word);
    }
    public static void showShape1(TwoDimensionalShape tw) {
        String word = String.format("%1.2f",tw.getPerimeter());
        System.out.println(word);
    }
    public static void showShape2(ThreeDimensionalShape th) {
        String word = String.format("%1.2f",th.getVolume());
        System.out.println(word);
    }
}
