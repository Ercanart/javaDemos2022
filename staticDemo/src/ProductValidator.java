public class ProductValidator {

    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    //Ana class static olamaz.
    public ProductValidator() {  //Bu constructor çalışmaz
        System.out.println("Yapıcı blok çalıştı");
    }
    public static boolean isValid(Product product) {
        if(product.price>0 && !product.name.isEmpty()) {  // ! operatörü ; değilse demektir.
            return true;
        }else{
            return false;
        }

    }
    public void bisey() {

    }
}
