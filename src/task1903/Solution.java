package task1903;

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
        StringBuilder str = new StringBuilder("Tutorial");
        System.out.println("string = " + str);

        // insert character value at offset 8
        str.insert(3, '3');

        // prints StringBuilder after insertion
        System.out.print("After insertion = ");
        System.out.println(str.toString());
        IncomeData incomeData = new IncomeData() {
            @Override
            public String getCountryCode() {
                return null;
            }

            @Override
            public String getCompany() {
                return null;
            }

            @Override
            public String getContactFirstName() {
                return null;
            }

            @Override
            public String getContactLastName() {
                return null;
            }

            @Override
            public int getCountryPhoneCode() {
                return 56;
            }

            @Override
            public int getPhoneNumber() {
                return 6436456;
            }
        };
        System.out.println(new IncomeDataAdapter(incomeData).getPhoneNumber());




    }

    public static class IncomeDataAdapter implements Contact, Customer {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
//            String res = String.format("+%d(%2$s)%3$s-%4$s-%5$s", data.getCountryPhoneCode(),
//                    String.format("%010d", data.getPhoneNumber()).substring(0, 3),
//                    String.format("%010d", data.getPhoneNumber()).substring(3, 6),
//                    String.format("%010d", data.getPhoneNumber()).substring(6, 8),
//                    String.format("%010d", data.getPhoneNumber()).substring(8));

//            public String getPhoneNumber() {
//                StringBuilder str = new StringBuilder(String.format("+" + "%d" + "%010d",data.getCountryPhoneCode(), data.getPhoneNumber()));
//                str.insert(3, "(").insert(7, ")").insert(11, "-").insert(14, "-");
//                return str.toString();
//            }

            String num = String.format("%010d", data.getPhoneNumber());
           return String.format("+%d(%.3s)%s-%s-%s", data.getCountryPhoneCode(),
                    num, num.substring(3, 6), num.substring(6, 8), num.substring(8, 10));


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