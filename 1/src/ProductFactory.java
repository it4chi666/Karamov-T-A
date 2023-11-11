import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


interface ProductFactory {
    Product createProduct(String name, double price);
}