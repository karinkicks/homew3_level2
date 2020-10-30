import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        to_count_unique_names(new ArrayList<String>(){{add("Карина");
            add("Марина");
            add("Мария");
            add("Лилия");
            add("Карина");
            add("Карина");
            add("Марина");
            add("Мария");
            add("Лилия");
            add("Карина");
            add("Карина");
            add("Марина");
            add("Мария");
            add("Лилия");
            add("Карина");}});
        DictionaryPhoneNumber dict = new DictionaryPhoneNumber();
        dict.add("Рыбченко", 123);
        dict.add("Рыбченко", 1234);
        dict.add("Иванов", 12334);
        dict.add("Петров", 12634);
        dict.add("Василенко", 1234);
        dict.showDict();
        dict.getPhone("Рыбченко");
        dict.getPhone("Шмелев");
    }

    static void to_count_unique_names(ArrayList<String> names){
        HashMap<String, Integer> uniqueNames = new HashMap<>();
        for (String name : names){
            if (uniqueNames.containsKey(name)){
                uniqueNames.put(name, uniqueNames.get(name)+1);
            }else{
                uniqueNames.put(name, 1);
            }
        }
        for(Map.Entry<String, Integer> name : uniqueNames.entrySet()){
            System.out.println(name.getKey() + " " + name.getValue());
        }
    }


}
