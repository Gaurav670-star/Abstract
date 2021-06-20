abstract class Abstrcat{
    abstract void run();
}

class Rahul extends Abstrcat{
    @overide
    void run(){
        System.out.println("RAHUL KUMAR");
    }

    public static void main(String[] args) {
        Abstrcat o = new Rahul();
        o.run();
    }

}
