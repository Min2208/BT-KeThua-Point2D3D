public class Main {
    public static void main(String[] args) {
        Point2D point=new Point2D();
        System.out.println(point.getXY()[1]);
        System.out.println(point.toString());
        point.setXY(5,10);
        System.out.println(point.getXY()[0]);
        System.out.println(point.getXY()[1]);

        Point3D point3D=new Point3D(5,10,15);
        System.out.println(point3D.toString());

    }
}
