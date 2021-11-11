package com.javarush.task.task19.task1905;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        @Override
        public String getCountryCode() {
            String result = "";
            for (Map.Entry<String, String> pair : Solution.countries.entrySet()) {
                if (pair.getValue().equals(this.customer.getCountryName()))
                    result = pair.getKey();
            }
            return result;
        }

        @Override
        public String getCompany() {
            return this.customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String txt = this.contact.getName();
            String[] name = txt.split(", ");
            return name[1];
        }

        @Override
        public String getContactLastName() {
            String txt = this.contact.getName();
            String[] name = txt.split(", ");
            return name[0];
        }

        @Override
        public String getDialString() {
            String begin = "callto://+";
            String number = this.contact.getPhoneNumber();
            char[] nums = number.toCharArray();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= '0' && nums[i] <= '9')
                    list.add(nums[i] - '0');
            }
            String result = begin;
            for (int i = 0; i < list.size() ; i++) {
                result += list.get(i);
            }
            return result;
        }

    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}