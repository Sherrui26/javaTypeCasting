
public class Smartphone {
    
    String brand;//e.g: Nokia, Samsung
    String model;//e.g: Lumia, Galaxy Y, Note S
    double price;
    int warranty;//warranty (in year)

    Smartphone() {
        
    }
    
public Smartphone(String a, String b, double c, int d){
    this.brand=a;
    this.model=b;
    this.price=c;
    this.warranty=d;
}    

public String getBrand(){
    return brand;
}

public String getModel(){
    return model;
}

public double getPrice(){
    return price;
}

public int getWarranty(){
    return warranty;
}

public String toString(){
    return "\n\nBrand: "+brand +"\nModel: "+ model +"\nPrice: $"+ price +"\nWarranty: "+ warranty;
    }
}
