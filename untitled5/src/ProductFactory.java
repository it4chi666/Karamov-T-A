import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Интерфейс для фабрики продуктов
interface ProductFactory {
    Product createProduct(String name, double price);
}