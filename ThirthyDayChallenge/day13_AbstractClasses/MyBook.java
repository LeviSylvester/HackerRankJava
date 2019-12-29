package ThirthyDayChallenge.day13_AbstractClasses;

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book {
    // Declare the price instance variable
    private int price;
    /**
     * Class Constructor
     *
     * @param title  The book's title.
     * @param author The book's author.
     * @param price  The book's price.
     **/
// Write your constructor here
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    /**
     * Method Name: display
     * <p>
     * Print the title, author, and price in the specified format.
     **/
// Write your method here
    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
// End class
}