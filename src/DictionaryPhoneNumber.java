import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DictionaryPhoneNumber {
    //Добавление значений в справочник
    HashMap<String, ArrayList<Integer>> dictionary  = new HashMap<>();

    public void add(String lastname, Integer phone){
        if (dictionary.size()==0){
            dictionary.put(lastname,new ArrayList<Integer>(){{add(phone);}});
        }else {
            for (Map.Entry<String, ArrayList<Integer>> record : dictionary.entrySet()){
                if(lastname.equals(record.getKey())){
                    record.getValue().add(phone);
                    return;
                }
            }
            dictionary.put(lastname,new ArrayList<Integer>(){{add(phone);}});
        }
    }

    public void showDict(){
        for(Map.Entry<String, ArrayList<Integer>> name : dictionary.entrySet()){
            System.out.println(name.getKey() + " " + name.getValue());
        }
    }

    public void getPhone(String lastname){
        for(Map.Entry<String, ArrayList<Integer>> name : dictionary.entrySet()){
            if(lastname.equals(name.getKey())){
                System.out.println(name.getKey() + " " + name.getValue());
                return;
            }
        }
        System.out.println("Данных не найдено");
    }
}
