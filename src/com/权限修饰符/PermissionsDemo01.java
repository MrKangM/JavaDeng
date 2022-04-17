package com.权限修饰符;
/*
*   权限修饰符：
*       public：在当前类中可以使用
*       default：在当前类中可以使用
*       private：在当前类中可以使用
*       protected：在当前类中可以使用
* */
public class PermissionsDemo01 {
//    使用方法：
//    public
    public void publicmethod(){
        System.out.println("publicMethod");
    }
//    default
    void defaultmethod(){
        System.out.println("defaultMethod");
    }
//    private
    private void privatemethod(){
        System.out.println("privateMethod");
    }
//    protected:
    protected void protectedmethod(){
        System.out.println("protectedMethod");
    }

    public static void main(String[] args) {
//        在当前类进行调用
        PermissionsDemo01 pr = new PermissionsDemo01();
        pr.publicmethod();
        pr.defaultmethod();
        pr.privatemethod();
        pr.protectedmethod();

    }
}
