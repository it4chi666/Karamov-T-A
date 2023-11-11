class ElectronicsFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Product("техника", name, price);
    }
}