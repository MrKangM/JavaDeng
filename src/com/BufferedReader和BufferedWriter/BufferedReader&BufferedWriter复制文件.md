## 缓冲流创建方式

```java
BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
BufferedReader br = new BufferedReader(new FileReader("b.txt"));
//匿名内部类创建方法
```

## 缓冲流复制文件

```java
public class BufferedReaderDemo02 {
    public static void main(String[] args) throws IOException {
//        使用缓冲流复制文件
//        1.创建缓冲流
        BufferedReader br = new BufferedReader(new FileReader("a.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("c.java"));
//        2.读取文件
//          a).单个字符读取
        int ch;
        while ((ch = br.read())!=-1){
            bw.write(ch);
        }
//          b).一次读取一个数组
        char[] arr = new char[1024];
        int len;
        while ((len = br.read(arr))!=-1){
            bw.write(arr,0,len);
        }

//        3.关闭资源
        br.close();
        bw.close();
    }
}
```