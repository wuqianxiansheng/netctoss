package xmlzuoye;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//添加解析：在xml文件中添加一个student元素
public class XMLTest3 {
    public static void main(String[] args) throws DocumentException, IOException {
        SAXReader reader = new SAXReader();
        File file = new File("student.xml");
        Document document = reader.read(file);
        Element rootElement = document.getRootElement();
        Element student = rootElement.addElement("student");
        student.addAttribute("id","3");
        Element name = student.addElement("name");
        name.setText("马翔");
        Element age = student.addElement("age");
        age.setText("20");
        Element address = student.addElement("address");
        address.setText("黄石");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        XMLWriter writer = new XMLWriter(new FileWriter(file), format);
        writer.write(document);
        writer.close();


    }

}
