class Box{
    int value;

    Box(int value){
        this.value = value;
    }
}
public class BoxMain {
    static void modify(Box b){
        b.value = 30;
        b = new Box(50);
        b.value = 70;
    }

    public static void main(String[] args) {
        Box b1 = new Box(10);

        Box b2 = b1;

        modify(b2);

        System.out.println(b1.value);
        System.out.println(b2.value);
    }
}
