package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/Is2/title.basics.tsv");
        List<Title> titles = new FileTitleLoader(file, new TsvTitleDeserializer()).load();
        Map<String, String> stats = new HashMap<>();
        for (Title title : titles) {
            stats.put(title.getTitle(), title.getGenre());
        }
        for (String title : stats.keySet()) {
            System.out.println(title + "\t" + stats.get(title));
        }
    }
}
