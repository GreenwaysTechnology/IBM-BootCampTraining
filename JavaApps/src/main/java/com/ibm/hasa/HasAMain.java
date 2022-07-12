package com.ibm.hasa;

public class HasAMain {
    public static void main(String[] args) {
        Address address = new Address("Coimbatore", "TN");
        Employee employee = new Employee(1, "Subramanian", address);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getAddress().getCity() + " " + employee.getAddress().getState());


        ProductController productController = new ProductController(new ProductService());
        System.out.println(productController.getProductService().getProduct());
    }
}
