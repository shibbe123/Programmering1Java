// Skriv metoden i denna klass



// Skriv en metod countWords som tar en sträng som parameter och som returnerar antalet ord i strängen. Ett ord i detta sammanhang är en följd av bokstäver, avgränsat med ett eller flera andra tecken.


// Testerna använder bara punkt, komma och mellanslag som avgränsare, men det är antagligen enklare att hantera alla andra tecken som avgränsare än att begränsa sig till just dessa.

// Exempel

// "PROGRAMMERA JAVA" har två ord 

// "I WASTED TIME, AND NOW DOTH TIME WASTE ME." har nio ord 

// .,ABC,,,DEF 7 har två "ord"

import java.util.ArrayList;;

public class EnglishWordCounter {

    public int countWords(String words){
        int letters = 0;
        for (int i = 0; i < words.length(); i++) {
            
            System.out.println(i);
            letters = i;
        }
        return letters;
    }


}