public class AggregationExample {

//    Why This Code Represents Aggregation?
//    ✔️ Departments are created separately from University.
//    ✔️ Departments are passed as references into University.
//    ✔️ Deleting a University does not delete Departments, as they exist independently.

    public static void main(String[] args) {
        // Create Department objects independently
        ContainedObjectDepartment cse = new ContainedObjectDepartment("CSE");
        ContainedObjectDepartment me = new ContainedObjectDepartment("ME");
        ContainedObjectDepartment eee = new ContainedObjectDepartment("EEE");
        ContainedObjectDepartment ece = new ContainedObjectDepartment("ECE");

        // Create a University object
        ContainerObjectUniversity university = new ContainerObjectUniversity("ABC University");

        // Add existing departments to the university
        university.addDepartmentAggregate(cse);
        university.addDepartmentAggregate(me);
        university.addDepartmentAggregate(eee);
        university.addDepartmentAggregate(ece);

        // Display university details
        university.displayUniversityDetails();
    }
}
