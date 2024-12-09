interface Foo{int x=20;}
public class checkIntComp {
    public static void main(String[] args) {
        //Foo.x=10;// will throw error as it is final
    }
}
