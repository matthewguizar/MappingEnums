package entity;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(name = "employee_id", unique = true)
    private String employeeId;

    @Enumerated(EnumType.STRING)
    @Column(name = "employee_status")
    private EmployeeStatus employeeStatus;


    public Employee() {
    }

    public Employee(String name, String employeeId, EmployeeStatus employeeStatus) {
        this.name = name;
        this.employeeId = employeeId;
        this.employeeStatus = employeeStatus;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeStatus getEmployeeStatus() {
        return this.employeeStatus;
    }

    public void setEmployeeStatus(EmployeeStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", employeeId='" + getEmployeeId() + "'" +
            ", employeeStatus='" + getEmployeeStatus() + "'" +
            "}";
    }


}
