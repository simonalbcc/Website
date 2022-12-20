package foodWebsiteProject.service;

import foodWebsiteProject.model.LineOrder;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartServiceTest {

    @BeforeEach
    void setUp() {
        CartService cartService = new CartService();
    }

    @Test
    public void withASingleProm() throws Exception {
        LineOrder lineOrder1 = new LineOrder(10.,5);
        LineOrder lineOrder2 = new LineOrder(5.,45);
        LineOrder lineOrder3 = new LineOrder(16.,10);
        List<LineOrder> orderProductPrice = new ArrayList<>();
        orderProductPrice.add(lineOrder1);
        orderProductPrice.add(lineOrder2);
        orderProductPrice.add(lineOrder3);
        Collections.sort(orderProductPrice, Comparator.comparing(LineOrder::getRealPrice));
        Assert.assertArrayEquals(new double[] {5,5.},CartService.nbPointsAndPriceProm(15,orderProductPrice),0.1);
    }

    @Test
    public void withMultiplePromSingleProduct() throws Exception {
        LineOrder lineOrder1 = new LineOrder(10.,5);
        LineOrder lineOrder2 = new LineOrder(5.,45);
        LineOrder lineOrder3 = new LineOrder(16.,10);
        List<LineOrder> orderProductPrice = new ArrayList<>();
        orderProductPrice.add(lineOrder1);
        orderProductPrice.add(lineOrder2);
        orderProductPrice.add(lineOrder3);
        Collections.sort(orderProductPrice, Comparator.comparing(LineOrder::getRealPrice));
        Assert.assertArrayEquals(new double[] {0,20.},CartService.nbPointsAndPriceProm(40,orderProductPrice),0.1);
    }

    @Test
    public void withMultiplePromMultipleProduct() throws Exception {
        LineOrder lineOrder1 = new LineOrder(10.,5);
        LineOrder lineOrder2 = new LineOrder(5.,3);
        LineOrder lineOrder3 = new LineOrder(16.,10);
        List<LineOrder> orderProductPrice = new ArrayList<>();
        orderProductPrice.add(lineOrder1);
        orderProductPrice.add(lineOrder2);
        orderProductPrice.add(lineOrder3);
        Collections.sort(orderProductPrice, Comparator.comparing(LineOrder::getRealPrice));
        Assert.assertArrayEquals(new double[] {5,25.},CartService.nbPointsAndPriceProm(45,orderProductPrice),0.1);
    }

    @Test
    public void withNoProm() throws Exception {
        LineOrder lineOrder1 = new LineOrder(10.,5);
        LineOrder lineOrder2 = new LineOrder(5.,3);
        LineOrder lineOrder3 = new LineOrder(16.,10);
        List<LineOrder> orderProductPrice = new ArrayList<>();
        orderProductPrice.add(lineOrder1);
        orderProductPrice.add(lineOrder2);
        orderProductPrice.add(lineOrder3);
        Collections.sort(orderProductPrice, Comparator.comparing(LineOrder::getRealPrice));
        Assert.assertArrayEquals(new double[] {9,0.},CartService.nbPointsAndPriceProm(9,orderProductPrice),0.1);
    }

}