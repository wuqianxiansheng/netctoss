package moshisheji.Factor2;

public interface Sender {
    void  send();
}
class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("This is MailSender");
    }

}
class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("This is SmsSender");

    }

}

class SendFactory{
    public Sender produceSms(){
        return new SmsSender();
    }
    public  Sender produceMail(){
        return new MailSender();
    }
}
class  FactoryTest{
    public static void main(String[] args) {
        SendFactory sendFactory=new SendFactory();
        Sender sender = sendFactory.produceMail();
        sender.send();
        Sender sender1 = sendFactory.produceSms();
        sender1.send();
    }
}