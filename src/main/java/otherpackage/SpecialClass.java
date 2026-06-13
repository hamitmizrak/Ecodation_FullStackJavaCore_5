package otherpackage;

import samepackage.SameClass;

public class SpecialClass extends SameClass {

    static void main() {
        SameClass accessSame = new SameClass();
        System.out.println(accessSame.publicValue);
        //System.out.println(accessSame.protectedValue);
        //System.out.println(accessSame.privateValue);
        //System.out.println(accessSame.defaultValue);
    }
}
