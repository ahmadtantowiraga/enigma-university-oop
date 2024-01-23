public class Operation {
    static CollegeStudent[] collegeStudents=new CollegeStudent[5];


    public void addOperation(CollegeStudent collegeStudent){
        if (collegeStudents[4]!=null){
            System.out.println("The storage is full or delete storage if you want to input data");
        }
        for (int i = 0; i < collegeStudents.length; i++) {
            if (collegeStudents[i]==null){
                collegeStudents[i]=collegeStudent;
                break;
            }
        }
    }
    public void deleteOperation(){
        if (collegeStudents[0]==null){
            System.out.println("Cannot delete data because it is still empty");
        }
        for (int i = collegeStudents.length-1; i >= 0; i--) {
            if(collegeStudents[i]!=null){
                collegeStudents[i]=null;
            }
        }
    }

}
