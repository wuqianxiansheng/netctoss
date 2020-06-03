package XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

//查询文件
public class XMLTest1 {
    public static void main(String[] args) throws DocumentException{
        //创建Sax解析对象
        SAXReader reader=new SAXReader();
        File file=new File("student.xml");
        Document document = reader.read(file);
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        for (Element element:elements){

            System.out.println("元素名："+element.getName()+",ID:"+element.attributeValue("id"));
            List<Element> elements1 = element.elements();
            for (Element eles:elements1){
                System.out.print("元素名："+eles.getName()+",文本："+eles.getText()+"    ");
            }
            System.out.println();

        }


    }
}
