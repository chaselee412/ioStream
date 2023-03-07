package com.charles.chapter14.poly_.polyparameter_;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary,double bonus) {
        super(name, salary);
        this.bonus = bonus;//     constructor 从外部传递进来的参数
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage() {
        System.out.println("经理 " + getName() + " is managing");
    }
//重写获取年薪方法


    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
}
