class first1{

}
class second extends first1{

}

class first{
    public static void main(String string[]){
        first1 f1 = new second();
        first1 f2 = new second();
    }
}