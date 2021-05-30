package Hello;

import Proxy.Man;

public class Test {
   final int width ;
   public Test(int n){
      width = n;
   }

   public static void main(String[] args){
      Wrapper.id = 1;

      Wrapper w = new Wrapper();
      Wrapper.test5();

      w.test3();
      Test t = new Test(45);
      System.out.println(t.width);
      Man man = new Man();
      man.help();

   }

}


