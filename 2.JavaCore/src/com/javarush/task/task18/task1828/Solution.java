package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static class Product {
        public int id;
        public String name;
        public String price;
        public String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s\n", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0)
            return;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        List<Product> products = new ArrayList<>();
        try (BufferedReader filereader = new BufferedReader(new FileReader(filename))){
            while (filereader.ready()) {
                Product product = getProduct(filereader.readLine());
                products.add(product);
                }
            }
        catch (IOException e) {
            e.printStackTrace();
        }
        switch (args[0]) {
            case "-u":
                int idU = Integer.parseInt(args[1]);
                String name = "";
                for (int i = 2; i < args.length - 2; i++)
                    name += args[i] + " ";
                if (name.length() > 30)
                    name = name.substring(0,30);
                String price = args[args.length - 2];
                if (price.length() > 8)
                    price = price.substring(0, 8);
                String quantity = args[args.length - 1];
                if (quantity.length() > 4)
                    quantity = quantity.substring(0, 4);
                Product newProduct = new Product(idU, name, price, quantity);
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).id == idU) {
                        products.set(i, newProduct);
                        break;
                    }
                }
                break;
            case "-d":
                int idD = Integer.parseInt(args[1]);
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).id == idD) {
                        products.remove(i);
                        break;
                    }
                }
                break;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            for (Product product : products) {
                writer.write(product.toString());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Product getProduct(String line) {
        String id = line.substring(0, 8).trim();
        String name = line.substring(8, 38).trim();
        String price = line.substring(38, 46).trim();
        String quantity = line.substring(46, 50).trim();
        return (new Product(Integer.parseInt(id), name, price, quantity));
    }
}
