public class CoffeeTest {
    public static void main(String[] args) {
        Coffee ethiopiaCoffee = new EthiopiaAmericano();
        ethiopiaCoffee.brewing();

        System.out.println();

        Coffee ethiopiaLatte = new Latte(ethiopiaCoffee);
        ethiopiaLatte.brewing();

        System.out.println();

        Coffee ethiopiaMocha = new Mocha(ethiopiaLatte);
        ethiopiaMocha.brewing();

        System.out.println();

        Coffee ethiopiaMocha2 = new Mocha(new Latte(new EthiopiaAmericano()));
        ethiopiaMocha2.brewing();

        System.out.println();

        Coffee kenyaCoffee = new KenyaAmericano();
        kenyaCoffee.brewing();

        System.out.println();

        Coffee kenyaCoffeeWhippingCream = new WhippingCream(new KenyaAmericano());
        kenyaCoffeeWhippingCream.brewing();

        // 결과
        // Ethiopia Americano
        // Ethiopia Americano Add Milk
        // Ethiopia Americano Add Milk Add Mocha
        // Ethiopia Americano Add Milk Add Mocha
        // Kenya Americano
        // Kenya Americano Add Whipping Cream
    }
}
