import java.util.*;

public class DictionaryPhoneNumber {
    //Добавление значений в справочник
    HashMap<String, List<Integer>> dictionary  = new HashMap<>();

    public void add(String lastname, Integer phone){
        if (dictionary.size()==0){
            dictionary.put(lastname,new ArrayList<Integer>(){{add(phone);}});
        }else {
            if (dictionary.containsKey(lastname)) {
                dictionary.get(lastname).add(phone);
            } else {
                dictionary.put(lastname, new ArrayList<Integer>() {{
                    add(phone);
                }});
            }
        }
        /*for (Map.Entry<String, List<Integer>> record : dictionary.entrySet()){
            if(lastname.equals(record.getKey())){
                record.getValue().add(phone);
                return;
            }
        }
        dictionary.put(lastname,new ArrayList<Integer>(){{add(phone);}});
        }*/
    }

    public void showDict(){
        for(Map.Entry<String, List<Integer>> name : dictionary.entrySet()){
            System.out.println(name.getKey() + " " + name.getValue());
        }
    }

    public List<Integer> getPhone(String lastname){
        return dictionary.getOrDefault(lastname, Collections.emptyList());


       /* for(Map.Entry<String, ArrayList<Integer>> name : dictionary.entrySet()){
            if(lastname.equals(name.getKey())){
                return name.getValue();
            }
        }*/

    }
}
