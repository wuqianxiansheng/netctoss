package xmlzuoye;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

//查询文件
public class XMLTest1 {
    public static void main(String[] args) throws DocumentException {
        //1.创建SaxReader解析器对象
        SAXReader reader=new SAXReader();
        File file=new File("student.xml");
        Document document = reader.read(file);
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        for (Element eles:elements){
            System.out.println("元素名："+eles.getName()+"ID"+eles.attributeValue("id"));
            List<Element> ele = eles.elements();
            for (Element childeles:ele){
                System.out.print("元素名："+childeles.getName()+"，文本："+childeles.getText()+"   ");
            }
            System.out.println();
        }


    }
}
