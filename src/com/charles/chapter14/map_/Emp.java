package com.charles.chapter14.map_;

public class Emp {
        private String name;
        private double sal;
        private int id;

        public Emp(String name, double sal, int id) {
            this.name = name;
            this.sal = sal;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSal() {
            return sal;
        }

        public void setSal(double sal) {
            this.sal = sal;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", sal=" + sal +
                    ", id=" + id +
                    '}';
        }
    }

