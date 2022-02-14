package task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Знакомство с тегами
/home/masha/Desktop/txt.txt

*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(bufferedReader.readLine())))
        {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader1.readLine()) != null) {
                stringBuilder.append(line);
            }

            Document document = Jsoup.parse(stringBuilder.toString(), "", Parser.xmlParser());
            Elements elements = document.select(args[0]);
            elements.forEach(System.out::println);

        }
    }
}
