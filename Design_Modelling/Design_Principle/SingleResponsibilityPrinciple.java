package Design_Modelling.Design_Principle;
class Student {

    public void saveStudent() {
        System.out.println("Student Saved");
    }
}

class ReportService {

    public void generateReport() {
        System.out.println("Report Generated");
    }
}
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {

        Student student = new Student();
        student.saveStudent();

        ReportService report = new ReportService();
        report.generateReport();
    }
}