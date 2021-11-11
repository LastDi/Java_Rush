package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("/home/lastinc/1.txt");
            InputStream inputStream = new FileInputStream("/home/lastinc/1.txt");

            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setBirthDate(new Date(1220227200L * 1000));
            user.setCountry(User.Country.RUSSIA);
            user.setFirstName("Lolka");
            user.setLastName("Kek");
            user.setMale(true);
            javaRush.users.add(user);
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            inputStream.close();
            outputStream.close();
            if (!loadedObject.equals(javaRush)) {
                throw new Exception();
            }

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            for (int i = 0; i < this.users.size(); i++) {
                String isUser = this.users.get(i) != null ? "yes" : "no";
                writer.write(isUser);
                writer.write("\n");
                if (isUser.equals("yes")) {
                    writer.write(this.users.get(i).getLastName());
                    writer.write(":");
                    writer.write(this.users.get(i).getFirstName());
                    writer.write(":");
                    if (this.users.get(i).isMale()) {
                        writer.write("male");
                        writer.write(":");
                    }
                    else {
                        writer.write("female");
                        writer.write(":");
                    }
                    writer.write(this.users.get(i).getCountry().getDisplayName());
                    writer.write(":");
                    Long date = this.users.get(i).getBirthDate().getTime();
                    String longDate = date.toString();
                    writer.write(longDate);
                    writer.write("\n");
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                String isUser = reader.readLine();
                if (isUser.equals("yes")) {
                    User user = new User();
                    String[] tmp = reader.readLine().split(":");
                    for (String t : tmp) {
                        System.out.println(t);
                    }
                    user.setLastName(tmp[0]);
                    user.setFirstName(tmp[1]);
                    String male = tmp[2];
                    if (male.equals("male"))
                        user.setMale(true);
                    else
                        user.setMale(false);
                    for (int b = 0; b < User.Country.values().length; b++){
                        String stEnum = String.valueOf(User.Country.values()[b]);
                        if (tmp[3].toUpperCase().equals(stEnum)){
                            user.setCountry(User.Country.values()[b]);
                        }
                    }
                    Date date = new Date();
                    date.setTime(Long.parseLong(tmp[4]));
                    user.setBirthDate(date);
                    this.users.add(user);
                }
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
