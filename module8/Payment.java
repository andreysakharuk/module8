package module8;

import java.util.ArrayList;

public class Payment {

    private ArrayList<Good> goods = new ArrayList<Good>();

    public void addGoodToPayment(Good good) {
        goods.add(good);
    }

    public ArrayList<Good> getGoods() {
        return goods;
    }

}
