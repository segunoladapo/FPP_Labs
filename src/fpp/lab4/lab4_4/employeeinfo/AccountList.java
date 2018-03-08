package fpp.lab4.lab4_4.employeeinfo;


public class AccountList {

    private Account[] accounts = new Account[50];
    private int size = 0;
    public AccountList(){
    }

    public void add(Account account){
        if(size == accounts.length){
            resize();
        }
        accounts[size++] = account;
    }

    public boolean find(Account account){
        for(int i = 0; i < size; i++){
            if(accounts[i].equals(account));
            return true;
        }
        return false;
    }

    public Account get(int index){
        return accounts[index];
    }

    public boolean remove(Account account){
        boolean found = false;
        for(int i = 0; i < size; i++){
            if(accounts[i].equals(account)) {
                found = true;
                for(int j = i; j < size - 1; j++){
                    accounts[j] = accounts[j+1];
                }
                accounts[size-1] = null;
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
            output +=accounts[i];
            if(accounts[i+1] != null)
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
        Account[] temp = new Account[accounts.length * 2];
        System.arraycopy(accounts, 0, temp, 0, accounts.length);
        accounts = temp;
    }


}


