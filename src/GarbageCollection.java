public class GarbageCollection {
    boolean checkedOut = false;
    GarbageCollection(boolean checkedOut){
        this.checkedOut = checkedOut;

    }
    void checkIn(){
        this.checkedOut =  true;
    }
    protected  void finalize(){
        if(checkedOut){
            System.out.println("Error:checked out");
        }
    }
    public static void main(String[] args){
        GarbageCollection garbageCollection = new GarbageCollection(true);
        garbageCollection.checkIn();
        new GarbageCollection(true);
        System.gc();
    }
}


