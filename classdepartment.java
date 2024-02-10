class Department {
    private int departmentId;
    private String departmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

public class classdepartment {
    public static void main(String[] args) {
        Department department1 = new Department(101, "Finance");
        Department department2 = new Department(102, "Human Resources");

        System.out.println("Department 1 Details:");
        System.out.println("Department ID: " + department1.getDepartmentId());
        System.out.println("Department Name: " + department1.getDepartmentName());
        System.out.println();

        System.out.println("Department 2 Details:");
        System.out.println("Department ID: " + department2.getDepartmentId());
        System.out.println("Department Name: " + department2.getDepartmentName());
    }
}
