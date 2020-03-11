
/*
 * Copyright (c) Dmytro Hutkin 2020.
 */

import java.util.List;

public class MinStampsFinder {

    private int price;
    private List<Integer> stamps;

    public MinStampsFinder(int price) {
        this.price = price;
    }

    public MinStampsFinder(int price, List<Integer> stamps) {
        this.price = price;
        this.stamps = stamps;
    }
}
