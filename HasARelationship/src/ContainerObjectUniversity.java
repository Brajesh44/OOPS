import java.util.ArrayList;
import java.util.List;

public class ContainerObjectUniversity {


private String universityName;
private List<ContainedObjectDepartment> departments;

public ContainerObjectUniversity(String universityName) {
    this.universityName = universityName;
    this.departments = new ArrayList<>();
}

// Add a department to the university
public void addDepartment(String departmentName) {

    departments.add(new ContainedObjectDepartment(departmentName));
}

    public void addDepartmentAggregate(ContainedObjectDepartment department)
    {
        departments.add(department);
    }

// Display university details
public void displayUniversityDetails() {
    System.out.println("University: " + universityName);
    System.out.println("Departments:");
    for (ContainedObjectDepartment dept : departments) {
        System.out.println("- " + dept.getName());
    }
}
}

