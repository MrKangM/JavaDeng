package com.权限修饰符;

public class PermissionsDemo04 extends PermissionsDemo01{
    public static void main(String[] args) {
        PermissionsDemo04 pr = new PermissionsDemo04();
        pr.publicmethod();
        pr.defaultmethod();
//        继承中，private无法被调用
//        pr.privatemethod();
        pr.protectedmethod();
    }
}
