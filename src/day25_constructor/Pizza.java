package day25_constructor;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int culCost(){
       int price = 0;
        switch (size){
           case 'S' : price = 10;
               break;

           case 'M' : price = 12;
               break;
           case 'L' : price = 14;
               break;

       }
       return price += numberOfCheeseTopping*2 + numberOfPepperoniTopping*2;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", price is " + culCost() +
                '}';
    }


}
