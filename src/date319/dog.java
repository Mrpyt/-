package date319;

public class dog extends animal {
    public dog() {
    }

    public dog(int age, String color) {
        super(age, color);
    }

    public void lookHome(){
        System.out.println("狗狗正在看家");
    }

    @Override
    public void eat(String food) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿正在死死的抱住"+food+"猛吃");
    }
}
