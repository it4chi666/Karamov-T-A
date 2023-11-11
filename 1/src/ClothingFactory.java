class ClothingFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Product("одежда", name, price);
    }
}