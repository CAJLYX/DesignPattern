package composite;

public class Client {
    public static void main(String[] args) {

        //从大到小创建对象
        //学校
        OrganizationComponent university = new University("清华大学", "中国顶级大学");

        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoCollege = new College("信息工程学院", "信息工程学院");

        //创建各个学院下的专业
        computerCollege.add(new Department("软件工程","软件工程不错"));
        computerCollege.add(new Department("网络工程","网络工程不错"));
        computerCollege.add(new Department("计算机科学与技术","计算机科学与技术老牌专业"));

        infoCollege.add(new Department("通信工程","通信工程不好学"));
        infoCollege.add(new Department("信息工程","信息工程好学"));

        //将学院加入到学校
        university.add(computerCollege);
        university.add(infoCollege);

        university.print();
//        computerCollege.print();
    }
}
