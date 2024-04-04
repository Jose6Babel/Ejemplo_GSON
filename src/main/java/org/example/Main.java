package org.example;

import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String ejemplo = "Texto de ejemplo";

        Gson gson = new Gson();
        Integer intGson = gson.fromJson("1", Integer.class);

        System.out.println(gson.toJson(ejemplo));
        System.out.println(intGson);
    }
}