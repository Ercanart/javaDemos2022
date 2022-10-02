public class Main {
    public static void main(String[] args) {
        //Bir class birden fazla interface' yi uygulayabilir.
        /*ICustomerDal customerDal = new ICustomerDal() {
            @Override
            public void add() {

            }
        }*/
        //Interface ler de abstract class lar gibi new lenemzler.
        //Interface onu implemente eden classın referansını tutabilir.
        ICustomerDal customerDal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}