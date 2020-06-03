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

//添加解析：在xml文件中添加一个student元素
public class XMLTest3 {
    public static void main(String[] args) throws DocumentException, IOException {
        SAXReader reader = new SAXReader();
        File file = new File("student.xml");
        Document document = reader.read(file);
        Element rootElement = document.getRootElement();
        Element element = rootElement.addElement("student");
        element.addAttribute("id", "4");
        Element name = element.addElement("name");
        name.setText("邱金鹏");
        Element age = element.addElement("age");
        age.setText("20");
        Element address = element.addElement("address");
        address.setText("黄石");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        XMLWriter writer = new XMLWriter(new FileWriter(file), format);
        writer.write(document);
        writer.close();

    }
}
