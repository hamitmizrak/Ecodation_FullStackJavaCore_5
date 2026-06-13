package samepackage;

public class SameClass {
    // Access Modifier
    public String publicValue = "public data";
    protected String protectedValue = "protected data";
    private String privateValue = "private data"; //sadece aynı classslarda çağırabilirsin
    String defaultValue = "default data";

    static void main() {
        SameClass accessSame = new SameClass();
        System.out.println(accessSame.publicValue);
        System.out.println(accessSame.protectedValue);
        System.out.println(accessSame.privateValue);
        System.out.println(accessSame.defaultValue);
    }
}
