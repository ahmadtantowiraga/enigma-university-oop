import java.util.Scanner;
public class Menu {
    public CollegeStudent collegeStudent;
    public Operation operation;
    public Menu(){
        showMenu();
    }

    public void showMenu(){
        while (true) {
            String noMenu;
            do {
                System.out.println("--------------------------------------");
                System.out.println("Main Menu");
                System.out.println("--------------------------------------");
                System.out.println("1. Add Mahasiswa");
                System.out.println("2. Delete Mahasiswa");
                System.out.println("3. View All Mahasiswa");
                System.out.println("4. Exit");
                System.out.println("Enter the selected menu : ");
                noMenu = inputData();
                if (Integer.parseInt(noMenu) < 1 || Integer.parseInt(noMenu) > 4) {
                    System.out.println("Masukan NO MENU yang benar");
                    System.out.println("Tekan ENTER untuk melanjutkan");
                    inputData();
                }
            } while (Integer.parseInt(noMenu) < 1 && Integer.parseInt(noMenu) > 4);
            if (noMenu.equals("4")){
                break;
            }
            switch (noMenu) {
                case "1":
                    addCollegeStudent();
                    break;
                case "2":
                    deleteCollegeStudent();
                    break;
                case "3":
                    viewAllCollegeStudent();
                    break;
            }
        }
    }
    public void addCollegeStudent(){
        System.out.println("--------------------------------------");
        System.out.println("Add College Student");
        System.out.println("--------------------------------------");
        System.out.println("Name (3-20 Characters) : ");
        collegeStudent.setName(inputData());
        System.out.println("Age (min 17 years):");
        collegeStudent.setAge(Integer.parseInt(inputData()));
        System.out.println("Major (max 10 characters):");
        collegeStudent.setMajor(inputData());
    }

    public void deleteCollegeStudent(){
        System.out.println("--------------------------------------");
        System.out.println("Delete College Student");
        System.out.println("--------------------------------------");

        System.out.println("Mahasiswa yang terakhir masuk di delete:");
        System.out.println("Successfully Deleting Student");
    }

    public void viewAllCollegeStudent(){
        System.out.println("--------------------------------------");
        System.out.println("View all College Student");
        System.out.println("--------------------------------------");

    }

    public String inputData(){
        Scanner scanner=new Scanner(System.in);
        String data=scanner.nextLine();
        return data;
    }


}
