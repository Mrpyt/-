package date315;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:while(true) {
            System.out.println("------------黑马程序------------");
            System.out.println("------------1 添加学生------------");
            System.out.println("------------2 删除学生------------");
            System.out.println("------------3 更改信息------------");
            System.out.println("------------4 查询学生------------");
            System.out.println("------------5 退出------------");
            Scanner sc = new Scanner(System.in);
            String chosen = sc.next();

            switch (chosen) {
                case "1"->addStudent(list);
                case "2"->deleteStudent(list);
                case "3"->setStudent(list);
                case "4"->searchStudent(list);
                case "5"->{
                    System.out.println("退出成功");
                    break loop;
                }
                default->System.out.println("违法操作");
            }
        }
    }
    public static void addStudent(ArrayList<Student> list) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        String id = null;
        System.out.println("请输入增加学生的id");
        id = sc.next();
        while(ifStudent(list,id)) {
            System.out.println("重复id，请重新输入");
            id= sc.next();
        }
        s.setId(id);
        System.out.println("id可以正常使用，请继续输入");
        System.out.println("请输入增加学生的name");
        s.setName(sc.next());
        System.out.println("请输入增加学生的age");
        s.setAge(sc.next());
        list.add(s);
        System.out.println("增加成功");
    }
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除的学号");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index>=0){
            list.remove(index);
            System.out.println("删除成功");
        }
        else
        {System.out.println("学号不存在");}


    }
    public static int getIndex(ArrayList<Student> list, String id) {
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;

    }
    public static void setStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改的学号");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index>=0) {
            System.out.println("学号存在，请输入姓名");
            String name = sc.next();
            list.get(index).setName(name);
            System.out.println("请输入年龄");
            String age = sc.next();
            list.get(index).setAge(age);
            System.out.println("修改成功");
        }
        else{
            System.out.println("学号不存在，请重新输入");
            
        }
    }
    public static void searchStudent(ArrayList<Student> list) {
        if(list.size()==0) {
            System.out.println("信息不全，请补录");
            return;
        }
        for(int i=0;i<list.size();i++) {
            System.out.println("id:"+list.get(i).getId()+" name:"+list.get(i).getName()+" age:"+list.get(i).getAge());
        }


    }
    public static boolean ifStudent(ArrayList<Student> list,String id) {
        for(int i =0;i<list.size();i++) {
            String id1 = list.get(i).getId();
            if(id1.equals(id)){
                return true;
            }
        }
        return false;
    }

}
