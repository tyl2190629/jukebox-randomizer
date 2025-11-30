public class JukeTester {
    public static void main(String[] args) {
        Record testRecord;

        Jukebox myJukebox = new Jukebox();

        myJukebox.insert(new Record());
        myJukebox.insert(new Record("Kokomo", "The Beach Boys"));
        myJukebox.insert(new Record("Wooly Bully", "Sam the Sham & the Pharaohs"));
        myJukebox.insert(new Record("Mustang Sally", "Wilson Pickett"));
        myJukebox.insert(1, new Record("Great Balls of Fire", "Jerry Lee Lewis"));
        myJukebox.insert(0, new Record("I Feel Good", "James Brown"));

        System.out.println("Jukebox now contains: " + myJukebox);

        System.out.println("\nA random Record is: " + myJukebox.random());
        System.out.println("A random Record is: " + myJukebox.random());
        System.out.println("A random Record is: " + myJukebox.random());
        System.out.println("A random Record is: " + myJukebox.random());
        System.out.println("A random Record is: " + myJukebox.random());

        testRecord = new Record("Kokomo", "The Beach Boys");
        System.out.println("\nDoes it contain " + testRecord + "?: " + myJukebox.contains(testRecord));

        testRecord = new Record("Mustang Sally", "The Commitments");
        System.out.println("Does it contain " + testRecord + "?: " + myJukebox.contains(testRecord));

        testRecord = new Record("Its Too Late", "Wilson Pickett");
        System.out.println("Does it contain " + testRecord + "?: " + myJukebox.contains(testRecord));

        testRecord = new Record("Great Balls of Fire", "Jerry Lee Lewis");
        System.out.println("\nWhat slot is " + testRecord + " in?: " + myJukebox.findSlot(testRecord));

        testRecord = new Record("The Great Pretender", "The Platters");
        System.out.println("What slot is " + testRecord + " in?: " + myJukebox.findSlot(testRecord));

        testRecord = new Record("Wooly Bully", "Sam the Sham & the Pharaohs");
        System.out.println("\nDid it successfully remove " + testRecord + "?: " + myJukebox.remove(testRecord));

        testRecord = new Record("Heartbreak Hotel", "Elvis Presley");
        System.out.println("Did it successfully remove " + testRecord + "?: " + myJukebox.remove(testRecord));

        System.out.println("\nJukebox now contains: " + myJukebox);
    }
}