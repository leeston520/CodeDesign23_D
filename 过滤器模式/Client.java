package chatGPT.过滤器模式;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 创建一个过滤器接口
interface Filter {
    public void applyFilter(List<String> data);
}

// 创建一个数据处理类，用于存储数据和应用过滤器
class DataProcessor {
    private List<String> data;

    public DataProcessor(List<String> data) {
        this.data = data;
    }

    public void applyFilter(Filter filter) {
        filter.applyFilter(data);
    }

    public List<String> getData() {
        return data;
    }
}

// 创建一个过滤器实现类，用于过滤出包含指定关键字的数据
class KeywordFilter implements Filter {
    private String keyword;

    public KeywordFilter(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public void applyFilter(List<String> data) {
        ((ArrayList<String>) data).removeIf(str -> !str.contains(keyword));
    }
}

// 创建一个过滤器实现类，用于过滤出长度小于指定长度的数据
class LengthFilter implements Filter {
    private int length;

    public LengthFilter(int length) {
        this.length = length;
    }

    public void applyFilter(List<String> data) {
        data.removeIf(str -> str.length() > length);
    }
}

// 创建一个示例代码，用于应用多个过滤器
class Client {
    public static void main(String[] args) {
        List<String> data2 = Arrays.asList("hello", "world", "foo", "bar");
            List<String> data = new ArrayList<>();
            data.add("hello");
            data.add("world");
            data.add("foo");
            data.add("bar");
         System.out.println(data);
        System.out.println(data2);
        // 跟适配器和桥接换汤不换药
        DataProcessor processor = new DataProcessor(data);
        processor.applyFilter(new KeywordFilter("o"));
        processor.applyFilter(new LengthFilter(3));

        List<String> filteredData = processor.getData();
        System.out.println(filteredData);
    }
}
