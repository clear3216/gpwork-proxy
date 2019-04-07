package staticproxy;

public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }


    public void request() {
        before();
        subject.request();
        after();
    }

    public void before(){
        System.out.println("before()");
    }

    public void after(){
        System.out.println("after()");
    }
}
