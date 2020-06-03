package moshisheji.Factory3;

public interface Sender {
    void send();
}

class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is MailSender");

    }
}

class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is SmsSender");

    }
}
 interface provider{
    public Sender produce();
}
class  SmsSenderFactory implements  provider{
    @Override
    public Sender produce() {
     return new SmsSender();
    }
}
class  MailSenderFactory implements  provider{
    @Override
    public Sender produce() {
    return new MailSender();
    }
}
class FactoryTest{
    public static void main(String[] args) {
        SmsSenderFactory smsSenderFactory = new SmsSenderFactory();
        Sender produce = smsSenderFactory.produce();
        produce.send();
        MailSenderFactory mailSenderFactory=new MailSenderFactory();
        Sender produce1 = mailSenderFactory.produce();
        produce1.send();



    }


}