
class IceCream {
    String name;
    int sales;

    IceCream(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }
}

public class IceCreamRush {
    public static void main(String[] args) {
        IceCream[] flavours = new IceCream[8];
        flavours[0] = new IceCream("Vanilla", 50);
        flavours[1] = new IceCream("Strawberry", 35);
        flavours[2] = new IceCream("Chocolate", 80);
        flavours[3] = new IceCream("Mango", 60);
        flavours[4] = new IceCream("Black Forest", 95);
        flavours[5] = new IceCream("Fruitsmixed", 55);
        flavours[6] = new IceCream("Pineapple", 60);
        flavours[7] = new IceCream("Butterscotch", 70);


        for (int i = 0; i < flavours.length - 1; i++) {
            for (int j = 0; j < flavours.length - 1 - i; j++) {
                if (flavours[j].sales < flavours[j + 1].sales) {
    
                    IceCream temp = flavours[j];
                    flavours[j] = flavours[j + 1];
                    flavours[j + 1] = temp;
                }   
            }
        }
        System.out.println("Ice Cream Flavours sorted by popularity:");
        
        for (int i = 0; i < flavours.length; i++) {
            System.out.println(flavours[i].name + " - " + flavours[i].sales + " sales"); 
        }    
    }
}
