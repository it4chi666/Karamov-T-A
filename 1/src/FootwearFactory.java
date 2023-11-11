class FootwearFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Product("обувь", name, price);
    }
}