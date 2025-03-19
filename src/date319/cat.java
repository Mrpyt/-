package date319;

public class cat extends animal {
    public cat() {
    }

    public cat(int age, String color) {
        super(age, color);
    }

    public void catchMouse(){
        System.out.println("猫猫在抓老鼠");
    }
    @Override
    public void eat(String food) {
        System.out.println(super.getAge()+"岁的"+getColor()+"颜色的猫眯着眼睛侧头吃"+food);
    }
}
