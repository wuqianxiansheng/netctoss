package XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

//修改解析：修改xml文件第2个stduent元素下的id,及name属性的文本
public class XMLTest2 {
    public static void main(String[] args) throws DocumentException ,IOException{
        SAXReader reader=new SAXReader();
        File file=new File("student.xml");
        Document document = reader.read(file);
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        Element element = elements.get(1);
        element.addAttribute("id","2");
        Element name = element.element("name");
        name.setText("成龙");
        //写入数据到xml文档中
        //格式化为缩进格式
        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        XMLWriter writer=new XMLWriter(new FileWriter(file),format);
        writer.write(document);
        writer.close();

    }
}
