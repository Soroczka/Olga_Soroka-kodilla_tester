public class Notebook {
    private int weight;
    private int price;
    private int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        if (this.price<600){
            System.out.println("This notebook is cheap.");
        } else if (this.price <= 1000){
            System.out.println("The price is good.");
        }
        else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight(){
        if (this.weight < 1000){
            System.out.println("This notebook is light");
        } else if (this.weight <= 1500){
            System.out.println("This notebook isn't very heavy");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkYearAndPrice(){
        if (this.year <= 2016 && this.price<600) {
            if (this.price<600){
                System.out.println("This notebook is old and cheap. Year: "+this.year+" and price: "+price);
            } else if (this.price <= 1000){
                System.out.println("The price is high for the year. Year: "+this.year+" and price: "+price);
            }
            else {
                System.out.println("This notebook is too expensive. Year: "+this.year+" and price: "+price);
            }
        } else if (this.year <=2020){
            if (this.price<600){
                System.out.println("This notebook is really cheap. Year: "+this.year+" and price: "+price);
            } else if (this.price <= 1000){
                System.out.println("The price is ok. Year: "+this.year+" and price: "+price);
            }
            else {
                System.out.println("This notebook is too expensive. Year: "+this.year+" and price: "+price);
            }
        } else {
            if (this.price<600){
                System.out.println("This notebook is too cheap. Maybe something is wrong with it? Year: "+this.year+" and price: "+price);
            } else if (this.price <= 1000){
                System.out.println("The price is small. Is it a sale?! Year: "+this.year+" and price: "+price);
            }
            else {
                System.out.println("This notebook has ok price. Year: "+this.year+" and price: "+price);
            }
        }
    }

}
