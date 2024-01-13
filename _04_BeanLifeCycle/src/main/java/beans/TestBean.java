package beans;

public class TestBean {
    public TestBean(){
        System.out.println("TestBean 1");
    }

    public void bean1_init(){
        System.out.println("bean1의 init 메서드");
    }

    public void bean1_destroy(){
        System.out.println("bean1의 destory 메서드");
    }
}
