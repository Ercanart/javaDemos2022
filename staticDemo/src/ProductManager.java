public class ProductManager {
    public void add(Product product) {
        /*ProductValidator validator = new ProductValidator();
        if (validator.isValid(product)) {
            System.out.println("Eklendi.");
        }else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }*/
        //Bunları yerine;
        // ProductValidator class ını new lemek yerine, class ı kendi sayfasında static yaptık.
        //Bu nedenle aşağıda, isValid metodu ile kullanabildik. Statikle new'lenen class'ın, yalnızca bir örneği oluşur.
        //Statik' de class ı ilkl new leyen kulllanıcı nesneyi oluşturur,
        // sonrasında ise diğer kullanıcılar da aynı nesneyi kullanır.
        //Manager sınıfları statik yapılmaz!
        //statikler direkt class ismi ile çağrılır.
        if (ProductValidator.isValid(product)) {
            System.out.println("Eklendi.");
        }else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }

    }
}
// 08:30 !!!!