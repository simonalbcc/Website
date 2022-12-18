package foodWebsiteProject.service;


import foodWebsiteProject.Constants;
import foodWebsiteProject.model.LineOrder;

import java.util.List;


public class CartService {


    public static double[] nbPointsAndPriceProm(int nbPoints, List<LineOrder> orderProductPrice) {

        int nbProductsPromo = nbPoints / Constants.NB_PRODUCTS_PROMOTION;
        double priceProm = 0;
        int iProm = 0;
        for (int iProd = 0; iProd < nbProductsPromo && iProm < orderProductPrice.size(); iProd++) {
            if(iProd * (iProm +1) >= orderProductPrice.get(iProm).getQuantity()) {
                iProm++;
            }
            priceProm += orderProductPrice.get(iProm).getRealPrice();
        }

        nbPoints -= nbProductsPromo * Constants.NB_PRODUCTS_PROMOTION;

        return new double[]{nbPoints, priceProm};
    }
}
