package Ds.src.Day2;



public class CheckPalindromeInLinkedList {
       static StringKeyNode first=null;

        static StringKeyNode insert(String data){
            StringKeyNode newNode = new StringKeyNode(data);
            if(!isEmpty()){
                StringKeyNode current=first;
                while(current.next!=null){
                    current=current.next;
                }
                current.next=newNode;
            }
            else{
                first=newNode;
            }
            return newNode;
        }

        static boolean isEmpty(){
            return (first==null);
        }

        static boolean isPalindrome(){
            StringKeyNode current=first;
            String dataValue="";
            while(current!=null){
                dataValue+=current.key;
                current=current.next;
            }
            for(int i=0;i<dataValue.length();i++){
                if(dataValue.charAt(i)!=dataValue.charAt(dataValue.length()-1-i)){
                    return false;  
                }
            }
            return true;
        }


        public static void main(String[] args) {
            insert("A");
            insert("C");
            insert("O");
            insert("R");
            insert("O");
            insert("C");
            insert("A");
            System.out.println("It is a palindrome- "+isPalindrome());

        }
}
