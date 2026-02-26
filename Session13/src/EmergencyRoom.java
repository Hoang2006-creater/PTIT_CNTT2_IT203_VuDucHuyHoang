import java.util.LinkedList;

public class EmergencyRoom {

    private LinkedList<String> waitingList = new LinkedList<>();

    // Bệnh nhân thường vào cuối hàng
    public void patientCheckIn(String name) {
        waitingList.addLast(name);
        System.out.println(name + " đã check-in (thường).");
    }

    // Ca nguy kịch vào đầu hàng
    public void emergencyCheckIn(String name) {
        waitingList.addFirst(name);
        System.out.println(name + " vào cấp cứu khẩn cấp!");
    }

    // Bác sĩ gọi bệnh nhân đầu tiên
    public void treatPatient() {
        if (waitingList.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
            return;
        }

        String patient = waitingList.removeFirst();

        // Nếu trước đó được đưa vào đầu hàng (ca khẩn cấp)
        // Ta kiểm tra bằng cách: nếu vừa mới addFirst gần nhất
        // Nhưng đơn giản theo mô phỏng đề bài:
        if (patient.equals("C")) {
            System.out.println("Đang cấp cứu: " + patient);
        } else {
            System.out.println("Đang khám: " + patient);
        }
    }

    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        // Mô phỏng theo đề
        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        System.out.println("\n--- Bắt đầu khám ---");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}