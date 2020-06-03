package org.wuqian.wuqian6;

public class Test {
    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.setAge(200);
        worker.setName("吴骞");
        worker.setCompany("阿里巴巴");

        worker.setLimit(2);
        worker.setDuty("员工");

        worker.getAge();
        worker.getName();
        String company = worker.getCompany();
        String direction = worker.getDirection();
        int limit = worker.getLimit();
        String duty = worker.getDuty();
       worker.work();


    }
}
