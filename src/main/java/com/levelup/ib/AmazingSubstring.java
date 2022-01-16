package com.levelup.ib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazingSubstring {

    public static void main(String[] args){
        System.out.println(solve("ZYKsIjJXEkrVCUOcPzQSoWUWgpVMCXOdomsGZKAQTAlxmfEorVIRSFJrVhpNzQCeQIrlBDeBuDIUSvZVdBxqWqXOMOFQsoeOgYQnPbCOhKBadbrCcMjpoKOpPNjnzArUjQwdYHcOZqXoTcRkevYWmfBgLzuoEtFCwGuVTBWltOVGuWomAdwnctJPkrSfTGTzIDXzaBeruHswYyColqVWocVAqJeJWUnqPEDsKtzjRatoIAQrhXFwgTjOkEYxRdVqIBtxFBNcVIMOjsrhCqdSWvVGJeYCCwOeRQIAJpQNBgjHwxButqzCwFTGDJGnaWyUXkoauyFfcBaGkvsbuqWxbhMNaBZwHeBhmmNYvYKuWGWpACIHjprgueVkaQvkVfNCfWZVnzcucoInCswhAgPArufYkJvcAOKOboPhBSkUlAYPCkFbcqcXAdYjtuvrqBmcGmHBDpwjefGwYGCFatHftUjStJygCceHrrNAaFZceUvkmDvlHhIatVTvqbSDsDlPzQGjKrdvnHaUIBAQXHOtmpqhYqJfExJtezYbxblsYzakGrYRVZYbpXWtoNskUaMhfEBluXwrfGvuwwBpreGthTEQprjWXOYQoKWAnMOudHokSchlrBgsXgsVYlDhyzKUkFHrcMawRlKeQmrcsGktTmVQDdOtxMKXADzOnEojQmQqtgCfalZzKCoLFKjGtVwcJDkvuBUMhYBXSMRozRwayEKnjflQfLddwwGSzZhHAgZhnKIrDGNDfvbaOrnOUxwqOBwnJNywzGjFfkaljAJQXZvDXIcrqscItGSJTCUIlqFQPUfwoVrqVckPnERcJpLTwvbCIsklHJWsgveTuuOanJVoJdGpawWnHXMytKVxUgLsZOnrycWguqzcttvFRmFzupCcxrfrlHVaUIZbHPhIjZHnhQfGkhOumUhRdWcxogHonJCWSeSROLdDEMKICbUguqIrSckOmhOfQSuPbJgboHUexWvcuvLYJCDNOoXu"));
    }

    public static int solve(String A) {
        List<String> allStrs = allSubStrings(A);
        int countofGoodWords = 0;
        final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for(String str:allStrs){
            if(vowels.contains(str.charAt(0))){
                countofGoodWords++;
            }
        }
        return countofGoodWords%10003;
    }

    public static List<String> allSubStrings(String a){
        List<String> subStrings = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            String subStr="";

            // Second loop is generating sub-String
            for (int j = i; j < a.length(); j++) {
                subStr += a.charAt(j);
                subStrings.add(subStr);
            }
        }
        return subStrings;
    }
}
