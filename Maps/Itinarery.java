package Maps;

import java.util.HashMap;

/**
 * Itinarery
 */
public class Itinarery {

    public static void ItinareryMap(HashMap<String, String> map){

        HashMap<String, String> revMap = new HashMap<>();
        for (String keys : map.keySet() ){
            revMap.put(map.get(keys), keys);
        }

        for(String key : map.keySet()){
            if (!revMap.containsKey(key)) {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
    }
}