package bilibili.src.pt13.Test1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {

        //假数据制作 - 爬虫爬取百家姓
        String familyNameNet = "";
        String boyNameNet = "";
        String girlNameNet = "";

        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //通过正则表达式截取数据
        ArrayList<String> familyNameTempList = getData(familyNameStr,"(.{4})(， |。)", 1);
        ArrayList<String> boyNameTempList = getData(familyNameStr,"([\\u4e00-\\u9fa5·]{2}})(、 |。)", 1);
        ArrayList<String> girlNameTempList = getData(familyNameStr,"(.. ){4}..", 0);

        //处理数据
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c + "");
            }
        }

        //boyName - 去重
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String s : boyNameTempList) {
            if (!boyNameList.contains(s)) {
                boyNameList.add(s);
            }
        }

        //girlName
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : girlNameTempList) {
            String[] arr = s.split(" ");
            Collections.addAll(girlNameList, arr);
        }

        //System.out.println(familyNameStr);
        //System.out.println(boyNameStr);
        //System.out.println(girlNameStr);

        //生成数据
        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 20, 20);
        Collections.shuffle(list);
        System.out.println(list);


    }

    private static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boyhs.add(familyNameList.get(0) + boyNameList.get(0));
        }
        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlhs.add(familyNameList.get(0) + girlNameList.get(0));
        }
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-男-" + age);
        }
        for (String girlName : girlhs) {
            int age = r.nextInt(8) + 18;
            list.add(girlName + "-女-" + age);
        }
        return list;
    }

    //根据正则表达式进行截取数据
    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    public static String webCrawler(String net) throws IOException {
        //创建一个StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //创建一个url对象
        URL url = new URL(net) ;
        //链接这个网站
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //读取数据 - 需要用转换流进行转换
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();

    }

}
