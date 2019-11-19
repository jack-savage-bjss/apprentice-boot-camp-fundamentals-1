package checkout;

import java.util.ArrayList;
import java.util.List;

class Checkout {
    private int total;
    private int numberOfA = 0;
    private int numberOfB = 0;
    private int numberOfC = 0;
    private int numberOfD = 0;
    private Receipt receipt = new Receipt();
    List<Product> productList;

    public Checkout() {
        productList = new ArrayList<>();
        productList.add(new Product("A", 50));
        productList.add(new Product("B", 30));
        productList.add(new Product("C", 20));
        productList.add(new Product("D", 15));
    }

    boolean isSkuValid(String skuToValidate) {
        for (Product product : productList) {
            if (product.getSku().equals(skuToValidate)) {
                return true;
            }
        }
        return false;
    }

    void scan(String sku) {
        if (isSkuValid(sku)) {
            for (Product product : productList) {
                if (product.getSku().equals(sku)) {
                    total += product.getPrice();
                    receipt.scannedProduct();
                }
            }
        } else {
            System.out.println(String.format("Product '%s' not valid.\n", sku));
        }

        if ("A".equals(sku)) {
            total += 50;
            receipt.scannedA();
        } else if ("B".equals(sku)) {
            total += 30;
            receipt.scannedB();
        } else if ("C".equals(sku)) {
            total += 20;
            receipt.scannedC();
        } else if ("D".equals(sku)) {
            total += 15;
            receipt.scannedD();
        }
        if ("A".equals(sku)) {
            numberOfA++;
            if (numberOfA % 3 == 0) {
                total -= 20;
            }
        } else if ("B".equals(sku)) {
            numberOfB++;
            if (numberOfB % 2 == 0) {
                total -= 15;
            }
        } else if ("C".equals(sku)) {
            numberOfC++;
            if (numberOfC % 4 == 0) {
                total -= 10;
            }
        } else if ("D".equals(sku)) {
            numberOfD++;
            if (numberOfD % 5 == 0) {
                total -= 15;
            }
        }
    }

    int total() {
        return total;
    }

    public String receipt() {
        return receipt.text();
    }
}
