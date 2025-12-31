public class CompositionExample {

    public static void main(String[] args) {
        // Create a University object
        ContainerObjectUniversity university = new ContainerObjectUniversity("ABC University");

        // Add Departments
        university.addDepartment("CSE");
        university.addDepartment("ME");
        university.addDepartment("EEE");
        university.addDepartment("ECE");

        // Display university details
        university.displayUniversityDetails();
    }
}
