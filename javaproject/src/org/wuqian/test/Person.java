package org.wuqian.test;

public class Person {

        // 成员方法，一般使用private修饰
        private String name;
        private int age;
        private boolean marry; // 是否已婚
        // set和get方法，一般使用public修饰

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarry() {
        return marry;
    }

    public void setMarry(boolean marry) {
        this.marry = marry;
    }


        public static void main(String[] args) {
            Person person = new Person();
            // 赋值操作
            // person.name = "小明"; // 编译失败
            person.setName("小明");
            person.setAge(18);
            person.setMarry(true);
            // 取值操作
            // String name = person.name; // 编译失败
            /*String name = person.getName();
            int age = person.getAge();
            boolean isMarry = person.isMarry();*/
            System.out.println("name:"+person.getName()+" age:"+person.getAge()+" isMarry:"+person.isMarry());
        }
    }


