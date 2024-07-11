import java.util.ArrayList;
import java.util.List;

public class Department {
      String name;
    List<Department> subDepartments;

    Department(String name) {
        this.name = name;
        this.subDepartments = new ArrayList<>();
    }

    void addSubDepartment(Department department) {
        subDepartments.add(department);
    }

    void displayDepartmentHierarchy(String indent) {
        System.out.println(indent + name);
        for (Department subDepartment : subDepartments) {
            subDepartment.displayDepartmentHierarchy(indent + "  ");
        }
    }
}
