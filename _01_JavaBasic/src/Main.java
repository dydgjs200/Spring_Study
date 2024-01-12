import Beans.HelloWorld;
import Beans.HelloWorldEn;
import Beans.HelloWorldInter;
import Beans.HelloWorldInter2;

public class Main {
    public static void main(String[] args) {

        HelloWorldEn hello1 = new HelloWorldEn();
        callMethod(hello1);

        HelloWorldEn hello2 = new HelloWorldEn();
        callMethod(hello2);

        // Helloworld 인터페이스로 바로 담을 수 있음
        HelloWorld helloInter1 = new HelloWorldInter();
        callMethodInter(helloInter1);

        HelloWorld helloInter2 = new HelloWorldInter2();
        callMethodInter(helloInter2);
    }

    public static void callMethod(HelloWorldEn hello){
        hello.sayHello();
    }

    public static void callMethodInter(HelloWorld hello){
        hello.sayHello_inter();
    }
}