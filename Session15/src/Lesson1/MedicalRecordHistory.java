package Lesson1;

import java.util.Stack;

public class MedicalRecordHistory {
        Stack<EditAction>history = new Stack<>();
        // Them chinh sua moi

        public void addEdit (EditAction action){
            history.push(action);
            System.out.println("Da them chinh sua "+action);
        }
        // Undo chinh sua gan nhat
    public EditAction undoEdit(){
            if(history.isEmpty()){
                System.out.println("Khong co chinh sua nao de undo!");
                return null;
            }
            EditAction removed = history.pop();
            System.out.println("Da undo"+removed);
            return removed;
        }
        public EditAction getLastestEdit (){
            if(history.isEmpty()){
                System.out.println("Stack rong");
                return null;
            }
            return history.peek();
        }
        public boolean isEmpty(){
            return history.isEmpty();
        }
        public void displayHistory(){
            if(history.isEmpty()){
                System.out.println("Khong co linh su chinh sua ");
                return;
            }
            System.out.println("Lich su chinh sua: ");
            for(int i = history.size() -1 ;i>=0;i--){
                System.out.println(history.get(i));
            }
        }
}
