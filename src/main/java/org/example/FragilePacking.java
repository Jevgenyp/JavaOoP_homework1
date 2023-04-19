package org.example;

import lombok.Data;
import org.example.Interface.Packing;
import org.example.Product;

import java.util.List;
@Data

public class FragilePacking implements Packing {


    @Override
    public void packTheProducts(List<Product> shipmenList) {
        System.out.println("Хрупкий товар защищен дополнительной упаковкой");
    }
}
