package date319;

public class test {
    public static void main(String[] args) {
        person p = new person("老李",20);
        cat c = new cat(2,"白色");
        dog d = new dog(3,"黑色");
        p.keepPet(c,"鱼");
        p.keepPet(d,"骨头");

    }
}
