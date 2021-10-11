package com.grocerycrud.functional_testing.desafio01;

import java.util.HashMap;
import java.util.Map;

public class Data {
    public Map<String, String> generateFormArray(){
        Map<String, String> person = new HashMap<>();
        person.put("name", "Teste Sicredi");
        person.put("last_name", "Teste");
        person.put("contact_first_name", "Gabriel");
        person.put("phone", "51 9999-9999");
        person.put("addressLine1", "Av Assis Brasil, 3970");
        person.put("addressLine2", "Torre D");
        person.put("city", "Porto Alegre");
        person.put("state", "RS");
        person.put("postal_code", "91000-000");
        person.put("country", "Brasil");
        person.put("from_employeer", "Fixter");
        person.put("credit_limit", "200");
        return person;
    }
}
