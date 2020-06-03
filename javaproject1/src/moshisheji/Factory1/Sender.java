package moshisheji.Factory1;

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

class SendFactory {
   public Sender produce(String str) {
        if (str.equals("SmsSender")) {
            return new SmsSender();
        } else if (str.equals("MailSender")) {
            return new MailSender();
        }
        return null;
    }

}
class FactoryTest{
    public static void main(String[] args) {
        SendFactory sendFactory=new SendFactory();
        Sender smsSender = sendFactory.produce("SmsSender");
        smsSender.send();
    }
}

