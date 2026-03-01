import java.util.*;

    class Patient {
        String name;
        int severity;
        int arrivalTime;

        public Patient(String name, int severity, int arrivalTime) {
            this.name = name;
            this.severity = severity;
            this.arrivalTime = arrivalTime;
        }

        @Override
        public String toString() {
            return name + " (Mức " + severity + ", đến lúc " + arrivalTime + ")";
        }
    }

    public class Lesson5 {
        public static void main(String[] args) {

            Comparator<Patient> cmp = (p1, p2) -> {
                if (p1.severity != p2.severity) {
                    return p1.severity - p2.severity;
                }
                return p1.arrivalTime - p2.arrivalTime;
            };

            Set<Patient> hangDoi = new TreeSet<>(cmp);

            hangDoi.add(new Patient("Bệnh nhân A", 3, 800));
            hangDoi.add(new Patient("Bệnh nhân B", 1, 815));
            hangDoi.add(new Patient("Bệnh nhân C", 1, 805));

            System.out.println("Thứ tự xử lý cấp cứu:");
            for (Patient p : hangDoi) {
                System.out.println(p);
            }
        }
    }
