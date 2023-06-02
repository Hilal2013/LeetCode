package easy.hilal;

public class A {
    int x=4;

}
class B extends A{
int x=10;
    public static void main(String[] args) {
       A obj=new B();
        System.out.println(obj.x);//4

//        String str = null;
//        switch (str) {
//            case "null":
//                System.out.println("null string");
//                break;
//        }

    }
}

