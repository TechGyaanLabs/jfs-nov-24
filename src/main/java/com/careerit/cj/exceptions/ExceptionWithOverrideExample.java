package com.careerit.cj.exceptions;

class E1Exception extends Exception{

}
class E2Exception extends  E1Exception{

}
class E3Exception extends  E2Exception{

}

class C1{

    public void m1()throws E2Exception{
        System.out.println("C1 of M1");
    }
}
class C2 extends C1{

    @Override
    public void m1()throws E2Exception{

    }

}


public class ExceptionWithOverrideExample {


           public static void m1(){

                try{
                    throw new E3Exception();
                }catch (E3Exception e3){

                }catch (E2Exception e2){

                }catch (E1Exception e1){

                }catch (Exception e){

                }

           }

}
