import java.util.Stack;

public class Bai1UngDung {
    public static void main(String[] args) {
        //Đảo ngược câu tiếng việt với stack
        String seq = "Hello các bạn";
        System.out.println(seq);
        String [] word = seq.split(" ");
        Stack<String> stackString =new Stack<>();
        // Duyệt và theem vào stack
        for(String words : word){
            stackString.push(words);
        }
        while (!stackString.isEmpty()){
            System.out.println(stackString.pop()+ " ");
        }
    }
}
