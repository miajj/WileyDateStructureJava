package LinkedLists;

/**
 * Created by mia on 25/01/2018.
 */
public class CircleListDuck {

//    public static void main(String[] args) {
//        CircleList C = new CircleList();
//        int N = 3; // number of iterations of the game
//        Node it;	// the player who is "it"
//        Node goose;	// the goose
//        Random rand = new Random();
//        rand.setSeed(System.currentTimeMillis()); // use current time as seed
//        // The players...
//        String[] names = {"Bob","Jen","Pam","Tom","Ron","Vic","Sue","Joe"};
//        for (int i = 0; i< names.length; i++) {
//            C.add(new Node(names[i], null));
//            C.advance();
//        }
//        for (int i = 0; i < N; i++) {	// play Duck, Duck, Goose N times
//            System.out.println("Playing Duck, Duck, Goose for " + C.toString());
//            it = C.remove();
//            System.out.println(it.getElement() + " is it.");
//            while (rand.nextBoolean() || rand.nextBoolean()) { // march around circle
//                C.advance(); // advance with probability 3/4
//                System.out.println(C.getCursor().getElement() + " is a duck.");
//            }
//            goose = C.remove();
//            System.out.println(goose.getElement() + " is the goose!");
//            if (rand.nextBoolean()) {
//                System.out.println("The goose won!");
//                C.add(goose); // add the goose back in its old place
//                C.advance();  // now the cursor is on the goose
//                C.add(it);    // The "it" person will be it again in next round
//            }
//            else {
//                System.out.println("The goose lost!");
//                C.add(it);     // add who's "it" back at the goose's place
//                C.advance(); // now the cursor is on the "it" person
//                C.add(goose);  // The goose will be "it" in the next round
//            }
//        }
//        System.out.println("Final circle is " + C.toString());
//    }

}
