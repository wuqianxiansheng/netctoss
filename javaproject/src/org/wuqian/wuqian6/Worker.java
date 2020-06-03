package org.wuqian.wuqian6;
//1.	以面向对象的思想，编写自定义类描述IT从业者。设定属性包括：姓名，年龄，技术方向，工作年限, 工作单位和职务；方法包括：工作
/*
1)	 设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
2)	 限定IT从业人员必须年满15岁，无效信息需提示，并设置默认年龄为15。
3)	 限定“技术方向”是只读属性
4)	 工作方法通过输入参数，接收工作单位和职务，输出个人工作信息
5)	 编写测试类，测试IT从业者类的对象及相关方法（测试数据信息自定义）

 */
public class Worker {
    private String name;
    private  int age;
    private  String direction;//技术方向
    private int limit;//工作年限
    private String company;
    private String duty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(""+name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 15;
            System.out.println("年龄信息无效，已修改默认年龄为15");
        } else {
            this.age = age;
        }
    }

    public String getDirection() {
        return direction="java工程师";
    }


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getCompany() {

        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    void work(){
            System.out.println("名字："+name);
            System.out.println("年龄："+age);
            System.out.println("技术方向："+direction);
            System.out.println("工作年限："+limit+"年");
            System.out.println("工作单位："+company);
            System.out.println("职务："+duty);
        }
}
