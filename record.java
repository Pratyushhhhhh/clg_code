import java.util.Scanner;

class InvalidEmpNameException extends Exception {
    public InvalidEmpNameException(String message) {
        super(message);
    }
}

class InvalidEmpIdException extends Exception {
    public InvalidEmpIdException(String message) {
        super(message);
    }
}

class InvalidDeptIdException extends Exception {
    public InvalidDeptIdException(String message) {
        super(message);
    }
}


class Employ{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID (2001 - 5001): ");
            int empId = sc.nextInt();
            if (empId < 2001 || empId > 5001) {
                throw new InvalidEmpIdException("Employee ID must be between 2001 and 5001.");
            }

            sc.nextLine();

            System.out.print("Enter Employee Name (First letter capital): ");
            String empName = sc.nextLine();
            if (empName.isEmpty() || !Character.isUpperCase(empName.charAt(0))) {
                throw new InvalidEmpNameException("Employee name must start with a capital letter.");
            }

            System.out.print("Enter Department ID (1 - 5): ");
            int deptId = sc.nextInt();
            if (deptId < 1 || deptId > 5) {
                throw new InvalidDeptIdException("Department ID must be between 1 and 5.");
            }

            // If all inputs are valid
            System.out.println("\nEmployee Details:");
            System.out.println("ID       : " + empId);
            System.out.println("Name     : " + empName);
            System.out.println("Dept ID  : " + deptId);

        } catch (InvalidEmpIdException | InvalidEmpNameException | InvalidDeptIdException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        } finally {
            sc.close();
        }
    }
}
