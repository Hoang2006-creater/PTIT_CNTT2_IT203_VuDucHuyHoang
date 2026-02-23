package Lesson4;

public class Main {
    public static void main(String[] args){
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Den da bat");
            }
        };
        smartLight.powerOn();
        smartLight.checkBattery();
    }
}
