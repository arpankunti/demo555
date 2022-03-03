public class ClassAndObjects {
    public static void main(String[] args) {

        Ball b=new Ball();
        b.spinAndBounce();
        b.spin();
        b.bounce();

    }
}

class Ball {
  //  public String state;


    public  void bounce() {
      //  state = "bouncing";
        System.out.println("Ball is bouncing");
    }

    public  void spin() {
    //    state = "spinning";
        System.out.println("Ball is spinning");
    }

    public  void spinAndBounce() {
        spin();
        bounce();
    }
}