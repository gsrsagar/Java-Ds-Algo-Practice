public class Counter {
    String s=null;
    int counter=0;
    public Counter(String s){
      this.s=s;
    }
    public void increment(){
        counter++;
    }
    public String  getCurrentValue(){
        return s;
    }
    public String toString(){
        return s+":"+counter;
    }


}
