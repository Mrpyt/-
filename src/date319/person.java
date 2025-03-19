package date319;

public class person {
    private String name;
    private int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void keepPet(animal animal,String something) {
        if (animal instanceof cat c) {
            System.out.println("年龄为"+age+"养了一只"+c.getColor()+"颜色的猫");
            c.eat(something);
        }
        else if(animal instanceof dog d) {
            System.out.println("年龄为"+age+"养了一只"+d.getColor()+"颜色的狗");
            d.eat(something);
        }


    }




}
