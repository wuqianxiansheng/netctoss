package JavaTest;

import java.io.Serializable;

public class Digui1  implements Serializable{
    private static final long serialVersionUID = 6114480077355899195L;

    public int jiecheng(int n){
    if (n==0||n==1){
        return 1;
    }
    return jiecheng(n-1)*n;
}

    public static void main(String[] args) {
        Digui1 digui1=new Digui1();
        System.out.println( digui1.jiecheng(5));
    }
}
