package int101retrain;

public class Main {
    public static void main(String[] args) {
        Naming n = new Naming("A B");
        System.out.println(n);
        n.addName("add XYZ: " + n.addName("XYZ"));
        n.addName("add WWW: " + n.addName("WWW"));
        n.addName("add URL: " + n.addName("URL"));
        n.addName("add WWW: " + n.addName("WWW"));
        n.addName("add ZIP: " + n.addName("ZIP"));
        n.addName("Show:" + n);
        System.out.println("find Yale:" + n.findName("Yale"));
        System.out.println("find WWW:" + n.findName("WWW"));
        System.out.println("remove MMM:" + n.removeName("MMM"));
        System.out.println("remove XYZ:" + n.removeName("XYZ"));
        System.out.println("show:" + n);
        System.out.println("remove XYZ:" + n.removeName("XYZ"));
        System.out.println("show:" + n);
    }
}