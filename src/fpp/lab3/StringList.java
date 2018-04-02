package fpp.lab3;
public class StringList {

    private String[] listOfString = new String[2];
    private int size = 0;
    public StringList(){
    }

    public void add(String str){
        if(size == listOfString.length){
            resize();
        }
        listOfString[size++] = str;
    }

    public boolean find(String str){
        for(int i = 0; i < size; i++){
            if(listOfString[i].equals(str));
            return true;
        }
        return false;
    }

    public String get(int index){
        return listOfString[index];
    }

    public boolean remove(String str){
        boolean found = false;
        for(int i = 0; i < size; i++){
            if(listOfString[i].equals(str)) {
                found = true;
                for(int j = i; j < size - 1; j++){
                    listOfString[j] = listOfString[j+1];
                }
                listOfString[size-1] = null;
                size--;
                break;
            }
        }
        return found;
    }

    @Override
    public String toString(){
        String output = "[";
        for(int i = 0; i < size; i++){
            output +=listOfString[i];
            if(listOfString[i+1] != null)
                output+=", ";
        }
        output += "]";
        return output;
    }

    public int size(){
        return size;
    }

    private void resize(){
        System.out.println("Resizing...");
        String[] temp = new String[listOfString.length * 2];
        System.arraycopy(listOfString, 0, temp, 0, listOfString.length);
        listOfString = temp;
    }



    public static void main(String[] arg){
        StringList listOfString = new StringList();
        listOfString.add("Bob");
        listOfString.add("Steve");
        listOfString.add("Susan");
        listOfString.add("Mark");
        listOfString.add("Dave");
        listOfString.add("Mark");
        listOfString.add("Bob");
        System.out.println(listOfString.size());
        listOfString.remove("Susan");
        System.out.println(listOfString.size());
        System.out.println(listOfString);
    }


}


