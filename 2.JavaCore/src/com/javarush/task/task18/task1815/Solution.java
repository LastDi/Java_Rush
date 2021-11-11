package com.javarush.task.task18.task1815;

import java.util.List;
import java.util.Locale;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        private TableInterface tablet;

        public TableInterfaceWrapper(TableInterface tablet) {
            this.tablet = tablet;
        }

        @Override
        public void setModel(List rows) {
            tablet.setModel(rows);
            System.out.println(rows.size());
        }

        @Override
        public String getHeaderText() {
            return tablet.getHeaderText().toUpperCase(Locale.ROOT);
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tablet.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}