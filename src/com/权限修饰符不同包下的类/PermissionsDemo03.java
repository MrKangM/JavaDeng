package com.权限修饰符不同包下的类;

import com.权限修饰符.PermissionsDemo01;

public class PermissionsDemo03 {
    public static void main(String[] args) {
        PermissionsDemo01 pr = new PermissionsDemo01();
//        只能调用public方法
        pr.publicmethod();
//        pr.defaultmethod();
//        pr.privatemethod();
//        pr.protectedmethod();
    }
}
