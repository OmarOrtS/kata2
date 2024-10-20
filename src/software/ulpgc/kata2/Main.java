package software.ulpgc.kata2;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("E:/Is2/title.basics.tsv");
        List<Title> titles = new FileTitleLoader(file, new TsvTitleDeserializer()).load();
    }
}
