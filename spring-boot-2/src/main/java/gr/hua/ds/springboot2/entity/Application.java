package gr.hua.ds.springboot2.entity;
import javax.persistence.*;

@Entity
@Table(name = "application")
public class Application {
    @Id
    @Column(name = "id_ap")
    private int idAp;

    @Column(name = "undergraduate_studies")
    private String undergraduateStudies;

    @Column(name = "grade")
    private int grade;

    @Column(name = "professor1")
    private String professor1;

    @Column(name = "professor2")
    private String professor2;

    @Column(name = "approval")
    private String approval;

    @Column(name = "order_number")
    private int orderNumber;

    public Application() {
    }

    public Application(String undergraduateStudies, int grade, String professor1, String professor2, String approval, int orderNumber) {
        this.undergraduateStudies = undergraduateStudies;
        this.grade = grade;
        this.professor1 = professor1;
        this.professor2 = professor2;
        this.approval = approval;
        this.orderNumber = orderNumber;

    }

    public int getIdAp() {
        return idAp;
    }

    public void setIdAp(int idAp) {
        this.idAp = idAp;
    }

    public String getUndergraduateStudies() {
        return undergraduateStudies;
    }

    public void setUndergraduateStudies(String undergraduateStudies) {
        this.undergraduateStudies = undergraduateStudies;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getProfessor1() {
        return professor1;
    }

    public void setProfessor1(String professor1) {
        this.professor1 = professor1;
    }

    public String getProfessor2() {
        return professor2;
    }

    public void setProfessor2(String professor2) {
        this.professor2 = professor2;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Application{" +
                "idAp=" + idAp +
                ", undergraduateStudies='" + undergraduateStudies + '\'' +
                ", grade=" + grade +
                ", professor1='" + professor1 + '\'' +
                ", professor2='" + professor2 + '\'' +
                ", approval='" + approval + '\'' +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
