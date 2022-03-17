package example;

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channeluP() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}

public class Ex07_01 {
    public static void main(String args[]) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channeluP();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true;
        stv.displayCaption("Hello, World");
    }
}
