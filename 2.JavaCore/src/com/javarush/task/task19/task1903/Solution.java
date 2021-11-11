package com.javarush.task.task19.task1903;

import java.util.HashMap;
import java.util.Map;

/* 
Адаптация нескольких интерфейсов
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

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return this.data.getCompany();
        }

        @Override
        public String getCountryName() {
            String result = "";
            for (Map.Entry<String, String> pair : Solution.countries.entrySet()) {
                if (pair.getKey().equals(this.data.getCountryCode()))
                    result = pair.getValue();
            }
            return result;
        }

        @Override
        public String getName() {
            return (this.data.getContactLastName() + ", " + this.data.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {  //For example1: +38(050)123-45-67
            int code = this.data.getCountryPhoneCode();
            int number = this.data.getPhoneNumber();
            int firstNum = number / 10000000;
            Integer secondNum = number % 10000000;
            String firstNumStr = "";
            if (firstNum == 0)
                firstNumStr = "000";
            else if (firstNum < 10)
                firstNumStr = "00" + firstNum;
            else if (firstNum < 100)
                firstNumStr = "0" + firstNum;
            else
                firstNumStr = firstNum + "";
            char[] strNum = secondNum.toString().toCharArray();
            char[] newStrNum = new char[7];
            int k = 0;
            for (int i = 0; i < newStrNum.length; i++) {
                if (newStrNum.length - i > strNum.length)
                    newStrNum[i] = '0';
                else {
                    newStrNum[i] = strNum[k];
                    k++;
                }
            }
            String phone = "+" + code + "(" + firstNumStr + ")"
                    + newStrNum[0] + newStrNum[1] + newStrNum[2] + "-" + newStrNum[3]
                    + newStrNum[4] + "-" + newStrNum[5] + newStrNum[6];
            return phone;
        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}