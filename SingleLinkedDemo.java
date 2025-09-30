import java.util.Scanner;
class Node {
    int empID;
    String empName;
    float empsalary;
    Node next;
    Node(int empID, String empName, float empsalary) {
        this.empID = empID;
        this.empName = empName;
        this.empsalary = empsalary;
    }
}
class SLL {
    Node head;
    void add(int empID, String empName, float salary) {
        if (head != null) {
            Node check = head;
            while (check != null) {
                if (check.empID == empID) {
                    System.out.println("Duplicate Employee ID! Cannot insert.");
                    return;
                }
                check = check.next;
            }
        }
        Node newnode = new Node(empID, empName, salary);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        System.out.println("Employee added successfully!");
    }
    void view() {
        if (head == null) {
            System.out.println("empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.empID + " " + temp.empName + " " + temp.empsalary);
                temp = temp.next;
            }
        }
    }
    int size() {
        int count = 0;
        Node currentnode = head;
        while (currentnode != null) {
            count++;
            currentnode = currentnode.next;
        }
        return count;
    }
    void update(int empID, int choice, String newName, float newSalary) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.empID == empID) {
                switch (choice) {
                    case 1 -> {
                        temp.empName = newName;
                        System.out.println("Name updated successfully!");
                    }
                    case 2 -> {
                        temp.empsalary = newSalary;
                        System.out.println("Salary updated successfully!");
                    }
                    case 3 -> {
                        temp.empName = newName;
                        temp.empsalary = newSalary;
                        System.out.println("Name and Salary updated successfully!");
                    }
                    default -> System.out.println("Invalid choice");
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee ID not found");
    }
    void find(int empID) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.empID == empID) {
                System.out.println("Found: " + temp.empID + " " + temp.empName + " " + temp.empsalary);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee not found");
    }
    void delete(int empID) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.empID == empID) {
            head = head.next;
            System.out.println("Employee deleted successfully!");
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.empID == empID) {
                prev.next = curr.next;
                System.out.println("Employee deleted successfully!");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Employee not found");
    }
}

public class SingleLinkedDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL s1 = new SLL();
        int opt = 0;

        do {
            System.out.println("\n1.ADD");
            System.out.println("2.VIEW");
            System.out.println("3.UPDATE");
            System.out.println("4.SIZE");
            System.out.println("5.FIND");
            System.out.println("6.DELETE");
            System.out.println("7.EXIT");
            System.out.println("enter the operation number to perform");
            opt = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (opt) {
                case 1 -> {
                    System.out.println("enter employee id");
                    int empID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter employee name");
                    String empName = sc.nextLine();
                    System.out.println("enter employee salary");
                    float salary = sc.nextFloat();
                    s1.add(empID, empName, salary);
                }
                case 2 -> s1.view();
                case 3 -> {
                    System.out.println("Enter employee ID to update:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Note: Employee ID cannot be updated.");
                    System.out.println("What do you want to update?");
                    System.out.println("1. Name");
                    System.out.println("2. Salary");
                    System.out.println("3. Both");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    String newName = "";
                    float newSalary = 0;

                    if (choice == 1) {
                        System.out.println("Enter new name:");
                        newName = sc.nextLine();
                    } else if (choice == 2) {
                        System.out.println("Enter new salary:");
                        newSalary = sc.nextFloat();
                    } else if (choice == 3) {
                        System.out.println("Enter new name:");
                        newName = sc.nextLine();
                        System.out.println("Enter new salary:");
                        newSalary = sc.nextFloat();
                    }
                    s1.update(id, choice, newName, newSalary);
                }
                case 4 -> System.out.println("Total employees: " + s1.size());
                case 5 -> {
                    System.out.println("Enter employee ID to find:");
                    int id = sc.nextInt();
                    s1.find(id);
                }
                case 6 -> {
                    System.out.println("Enter employee ID to delete:");
                    int id = sc.nextInt();
                    s1.delete(id);
                }
                case 7 -> {
                    System.out.println("exit");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option, try again.");
            }
        } while (opt != 7);
    }
}
