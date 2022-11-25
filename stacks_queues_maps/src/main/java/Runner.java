import java.util.*;

public class Runner {

    public static void main(String[] args) {

//        ArrayList<String> trainerList = new ArrayList<>();
//
//        trainerList.add("Colin");
//        trainerList.add("Ed");
//        trainerList.add("Eoan");
//
//        System.out.println(trainerList);
//
//        Stack<String> trainerStack = new Stack<>();
//        trainerStack.push("Colin");
//        trainerStack.push("Ed");
//        trainerStack.push("Eoan");
////
////        System.out.println(trainerStack);
//////
////        System.out.println(trainerList.get(0));
////        System.out.println(trainerStack.get(1));
////
////        System.out.println(trainerStack.peek());
////        System.out.println(trainerStack);
//
//        Queue<String> trainerQueue = new LinkedList<>();
//
//        trainerQueue.add("Colin");
//        trainerQueue.add("Ed");
//        trainerQueue.add("Eoan");
//
//        System.out.println(trainerQueue);
//
//        System.out.println(trainerQueue.peek());
//        System.out.println(trainerQueue.poll());
//        System.out.println(trainerQueue);

        HashMap<String, Integer> trainerAges = new HashMap<>();

        trainerAges.put("Colin", 26);
        trainerAges.put("Ed", 19);
        trainerAges.put("Eoan", 23);

        trainerAges.put("Zsolt", 53);

        trainerAges.put("Colin", 35);

        System.out.println(trainerAges.values());
    }




}
