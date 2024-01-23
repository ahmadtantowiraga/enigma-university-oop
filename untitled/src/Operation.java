public class Operation {
    CollegeStudent[] collegeStudents=new CollegeStudent[5];
    public void addOperation(CollegeStudent collegeStudent){
        if (collegeStudents[5]!=null){
            System.out.println("The storage is full or delete storage if you want to input data");
        }
        for (int i = 0; i < collegeStudents.length; i++) {
            if (collegeStudents[i]==null){
                collegeStudents[i]=collegeStudent;
            }
        }
    }
    public void deleteOperation(CollegeStudent collegeStudent){
        if (collegeStudents[0]==null){
            System.out.println("Cannot delete data because it is still empty");
        }
    }
}
