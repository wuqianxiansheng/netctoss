package moshisheji.proxy;

public class Women {
    private Boy boy;

    public Women(Boy boy) {
        this.boy = boy;
    }
    public  void  found(){
        System.out.println("找女孩");
        System.out.println("介绍给男孩");
        this.boy.marry();
        System.out.println("收钱");
    }
}
