class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}
class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException,
                   EmployeeNameInvalidException,
                   TaxNotEligibleException {

        if (!isIndian) {
            throw new CountryNotValidException(
                "The employee should be an Indian citizen for calculating tax"
            );
        }

        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException(
                "The employee name cannot be empty"
            );
        }

        double taxAmount;

        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal >= 10000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException(
                "The employee does not need to pay tax"
            );
        }

        return taxAmount;
    }
}


public class CalculatorSimulator {

    public static void main(String[] args) {

        TaxCalculator calculator = new TaxCalculator();

        // Test Case 1
        try {
            double tax = calculator.calculateTax("Ron", false, 34000);
            System.out.println("Tax amount is: " + tax);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test Case 2
        try {
            double tax = calculator.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is: " + tax);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test Case 3
        try {
            double tax = calculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is: " + tax);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test Case 4
        try {
            double tax = calculator.calculateTax("", true, 30000);
            System.out.println("Tax amount is: " + tax);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

