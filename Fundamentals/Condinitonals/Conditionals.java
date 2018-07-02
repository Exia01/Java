public class Conditionals {
    public static void PlayCall() {
        boolean defenderGuarding = false;
        boolean closeToBasket = true;
        if(defenderGuarding == true) {
            System.out.println("Pass The Ball");
        } else if(closeToBasket == true) {
            System.out.println("Shoot The Ball");
        } else {
            System.out.println("Dribble The Ball");
        }
        System.out.println("Score?");
    }
    public static void main(String[] args) {
        PlayCall();
    }

}
