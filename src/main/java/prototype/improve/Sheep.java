package prototype.improve;
//TODO 为什么非要加Cloneable接口  才能调用clone方法  clone方法不是父类的吗  为什么非要加implements才能使用
//   answer: clone方法是Object类的  但是如果不实现cloneable接口 就会报CloneNotSupportedException错误

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    public Sheep friend;

    public Sheep getFriend() {
        return friend;
    }
    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // @Override
    // public String toString() {
    //     return "Sheep{" +
    //             "name='" + name + '\'' +
    //             ", age=" + age +
    //             ", color='" + color + '\'' +
    //             ", friend=" + friend +
    //             '}';
    // }

    //克隆该实例 使用默认的clone()方法完成
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
