package com.charles.chapter14.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);
        polyParameter.testWork(tom);
        polyParameter.testWork(milan);
    }
    //showEmpAnnual(Employee e)
//实现获取任何员工对象的年工资,并在 main 方法中调用该方法 [e.getAnnual()]
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());//动态绑定机制绑定的是子类的重写方法.传入对象使用的方法看运行类型
    }
//添加一个方法，testWork,如果是普通员工，则调用 work 方法，如果是经理，则调用manage 方法
    public void testWork(Employee e) {//形参是父类，传入实参是子类，则会向上转型
        if(e instanceof Worker) {
            ((Worker) e).work();//有向下转型操作
        } else if(e instanceof Manager) {
            ((Manager) e).manage();//有向下转型操作
        } else {
            System.out.println("不做处理...");
        }
    }
}
