package Lesson5;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    displayAll();
                    break;
            }

        } while (choice != 0);
    }

    // Tiếp nhận bệnh nhân
    static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        // Kiểm tra trùng ID
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                System.out.println("ID đã tồn tại!");
                return;
            }
        }

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        patients.add(new Patient(id, name, age, diagnosis));
        System.out.println("Tiếp nhận thành công!");
    }

    // Cập nhật chẩn đoán
    static void updateDiagnosis() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();

        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = sc.nextLine();
                p.setDiagnosis(newDiagnosis);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân!");
    }

    //  Xuất viện
    static void dischargePatient() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = sc.nextLine();

        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId().equals(id)) {
                iterator.remove();
                System.out.println("Đã xuất viện!");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân!");
    }

    // Sắp xếp
    static void sortPatients() {
        Collections.sort(patients, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge(); // Tuổi giảm dần
                }
                return p1.getFullName().compareToIgnoreCase(p2.getFullName()); // Tên A-Z
            }
        });

        System.out.println("Đã sắp xếp danh sách!");
    }

    //  Hiển thị
    static void displayAll() {
        if (patients.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        for (Patient p : patients) {
            p.display();
        }
    }
}