public class CollegeStudent {
    private String name;
    private String major;
    private Integer age;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        Menu menu=new Menu();
        if (name.length() > 2 && name.length() < 21){
            this.name = name;
        }else{
            System.out.println("input 3-20 Characters");
            System.out.println();
            System.out.println("Klik ENTER Untuk melanjutkan");
            menu.inputData();
            menu.addCollegeStudent();
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        Menu menu=new Menu();
        if (major.length() <= 10) {
            this.major = major;
        }else{
            System.out.println("Max major 10 characters");
            System.out.println();
            System.out.println("Klik ENTER Untuk melanjutkan");
            menu.inputData();
            menu.addCollegeStudent();
        }
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        Menu menu=new Menu();
        if (age >= 17) {
            this.age = age;
        }else{
            System.out.println("Min age 17 years");
            System.out.println();
            System.out.println("Klik ENTER Untuk melanjutkan");
            menu.inputData();
            menu.addCollegeStudent();
        }
    }
    public void display(){
        System.out.println("Name    : "+ this.name);
        System.out.println("Age     : "+ this.age);
        System.out.println("Jurusan : "+ this.major);
    }
}
