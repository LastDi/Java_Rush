package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/

public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("/home/lastinc/1.txt");

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();
            InputStream inputStream = new FileInputStream("/home/lastinc/1.txt");
            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            if (!somePerson.equals(ivanov))
                throw new Exception();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null)
                return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            writer.write(this.name);
            writer.write("\n");
            for (int i = 0; i < this.assets.size(); i++) {
                String isAssets = this.assets.get(i) != null ? "yes" : "no";
                writer.write(isAssets);
                writer.write("\n");
                if (this.assets.get(i) != null) {
                    writer.write(this.assets.get(i).getName());
                    Double tmp = this.assets.get(i).getPrice();
                    writer.write("=");
                    writer.write(tmp.toString());
                    writer.write("\n");
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            this.name = reader.readLine();
            String isAssets = reader.readLine();
            while (reader.ready()) {
                if (isAssets.equals("yes")) {
                    String[] tmp = reader.readLine().split("=");
                    this.assets.add(new Asset(tmp[0], Double.parseDouble(tmp[1])));
                    isAssets = reader.readLine();
                }
            }
        }
    }
}
