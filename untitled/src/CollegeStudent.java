public class CollegeStudent extends Menu {
    private String name;
    private String major;
    private Integer age;

    public CollegeStudent(String name, String major, Integer age) {
        this.name = name;
        this.major = major;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 2 && name.length() < 21){
            this.name = name;
        }else{
            System.out.println("input 3-20 Characters");
            System.out.println();
            System.out.println("Klik ENTER Untuk melanjutkan");
            this.inputData();
            super.addCollegeStudent();
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (major.length() < 10) {
            this.major = major;
        }else{
            System.out.println("Max major 10 characters");
            System.out.println();
            System.out.println("Klik ENTER Untuk melanjutkan");
            this.inputData();
            super.addCollegeStudent();
        }
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        if (age >= 17) {
            this.age = age;
        }else{
            System.out.println("Min age 17 years");
            System.out.println();
            System.out.println("Klik ENTER Untuk melanjutkan");
            this.inputData();
            super.addCollegeStudent();
        }
    }
}
