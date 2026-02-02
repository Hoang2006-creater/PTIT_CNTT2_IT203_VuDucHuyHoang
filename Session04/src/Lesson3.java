public class Lesson3 {
    public static void main(String[] args) {

        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};

        long startSB = System.nanoTime();

        StringBuilder report = new StringBuilder();
        report.append("--- BÁO CÁO MƯỢN SÁCH ---\n");

        for (int i = 0; i < transactions.length; i++) {
            report.append("Giao dịch: ")
                    .append(transactions[i])
                    .append("\n");
        }

        long endSB = System.nanoTime();

        long startStr = System.nanoTime();

        String report2 = "";
        report2 += "--- BÁO CÁO MƯỢN SÁCH ---\n";

        for (int i = 0; i < transactions.length; i++) {
            report2 += "Giao dịch: " + transactions[i] + "\n";
        }

        long endStr = System.nanoTime();

        System.out.println(report.toString());

        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (endSB - startSB) / 1_000_000);
        System.out.println("Số thời gian thực thi đối với String: " + (endStr - startStr) / 1_000_000);
    }
}
