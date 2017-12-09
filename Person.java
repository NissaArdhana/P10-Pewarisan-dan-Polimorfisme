public class Person{
    protected String name;
    protected String address;

    /**
    * Default constructor
     */

     public Person(){
         System.out.println("Inside person :contructor");
    name= "";
    address= "";
     }

     /**
    * Contructor dengan dua parameter
    */
    public Person( String vname, String vaddress) {
        this.name = vname;
        this.address = vaddress;
    }

    /**
    *Method accessor adalah method yang dibuat untuk menangani variabel atribut sebuah class
    * get menggunakan fungsion
    * set menggunakan variabel
    */

    public String getName(){

        return name;

    }

    public String getAddress(){

        return address;

    }

    public void setName(String vname){
        this.name = vname;

    }

    public void setAddress(String vaddress){
        this.address = vaddress;
    }
}