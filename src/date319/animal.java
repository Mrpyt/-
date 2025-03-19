package date319;

public class animal {
    private int age;
    private String color;

    public animal() {
    }

    public animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat(String food) {
        System.out.println("正在吃"+food);
    }
}
