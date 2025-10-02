import java.util.Stack;

public class Pila {

    Stack<Character> pila;

    public Pila(){
        pila=new Stack<Character>();
    }

    public boolean esVacia(){
        return pila.isEmpty();
    }

    public void push(Character c){

        pila. push(c);
    }

    public Character pop() throws Exception{
        if(esVacia())
            throw new Exception("codigo no balanceado");
        return pila.pop();
    }

    public boolean balanceado(String codigo)throws Exception{
        Pila p1=new Pila();

        for(int i=0; i<codigo.length();i++){
            if(codigo.charAt(i)=='('){
                p1.push(codigo.charAt(i));
            }else{
                if(codigo.charAt(i)==')'){
                    if(p1.pop()!='('){
                        return false;
                    }
                }
            }
        }
        if(p1.esVacia()){
            return true;
        }
        return false;
    }





}
