interface Camera {

    void click();

}

interface Music {

    void play();

}

class Mobile implements Camera, Music {

    @Override
    public void click() {

        System.out.println("Photo Clicked");

    }

    @Override
    public void play() {

        System.out.println("Music Playing");

    }

}

public class MultipleInheritanceUsingInterface {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.click();
        mobile.play();

    }

}
