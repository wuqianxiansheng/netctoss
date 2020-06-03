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
import java.util.List;

//删除
public class XMLTest4 {
    public static void main(String[] args)throws DocumentException,IOException{
        SAXReader reader = new SAXReader();
        File file = new File("student.xml");
        Document document = reader.read(file);
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        Element element = elements.get(3);
        rootElement.remove(element);

        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        XMLWriter writer = new XMLWriter(new FileWriter(file), format);
        writer.write(document);
        writer.close();





    }

}
