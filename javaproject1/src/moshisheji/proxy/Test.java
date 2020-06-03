package moshisheji.proxy;

public class Test {
    public static void main(String[] args) {
        Boy boy=new Boy();
        Women women=new Women(boy);
        women.found();
    }
}
