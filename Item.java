public class Item {

    String name;
    double price;

    int quantity;

    Item(String name, double price, int quantity )
    {

        this.name=name;
        this.price=price;
        this.quantity=quantity;

    }


    String getName()
    {


        return name;


    }

    double getPrice()

    {

        return price;

    }


    int getQuantity(){





        return quantity;

    }

    double getValue()
    {

        return quantity*price;

    }
 
}



class Inventory
{


    public static void main(String[] args) {
        

        Item i1=new Item(null, 0, 0);
        i1.name="Item1";

        i1.price=100;
        i1.quantity=5;

        System.out.println("Name  Price Quantity");
        System.out.println(i1.name+"  "+i1.price+"  "+i1.quantity);


    }

}
