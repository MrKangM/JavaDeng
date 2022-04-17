package com.权限修饰符;

public class PermissionsDemo02 {
    public static void main(String[] args) {
//        在相同包不同类中调用
        PermissionsDemo01 pr = new PermissionsDemo01();
        pr.publicmethod();
        pr.defaultmethod();
//        private无法被调用
//        pr.privatemethod();
        pr.protectedmethod();
    }
}
