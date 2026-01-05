package BasicWithExceptionHandling;

/*
   1.Create a Simple Class
     Create a Student class with attributes: name, age, and rollNumber.
     Include a constructor and a method to display student details.
*/
class Student{

    private String name ;
    private int age;
    private int rollNumber ;

    Student(String name , int age , int rollNumber){

        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("name can not be empty ");
        }
        if(age <0 ){
            throw new IllegalArgumentException("age can not be less than zero");
        }
        if(rollNumber <= 0 ){
            throw new IllegalArgumentException("roll Nnumber can not be zero or less than zero ");
        }

        this.name = name  ;
        this.age = age ;
        this.rollNumber = rollNumber ;
    }

    // ---------------------------GETTERS----------------------------------------------------------------------
    public String getName(){
            return name ;
    }
    public int getAge(){
        return age ;
    }
    public int getRollNumber(){
        return rollNumber ;
    }

    //---------------------------SETTERS------------------------------------------------------------------------
    public void setName(String name ){
         if(name.trim().isEmpty()){
             throw new IllegalArgumentException("name should be something cannot be empty ");
         }
         this.name = name  ;
    }
    public void setAge(int age ){

        if(age >5 && age <= 100 ) {
            throw new IllegalArgumentException("age must be in the range");
        }
        this.age = age ;
    }
    public void setRollNumber(int rollNumber){

        if(rollNumber <= 0 ) {
            throw new IllegalArgumentException("roll Number can not be zero ");
        }
        this.rollNumber = rollNumber ;
    }

    @Override
    public String toString() {
        return String.format( "Name :: %s || age :: %d || roll Number :: %d " , name , age , rollNumber);
    }

    public boolean isequals(Object obj){
           // three step
        if( obj  == this ) return true ;


         if(obj == null || obj.getClass() != this.getClass()) return false;

         Student st = (Student) obj ;

         return ((st.name.equals(this.name)) && (this.age == st.age) && (this.rollNumber == st.rollNumber) );
    }
}
public class Test1 {

    public static void main(String[] args) {
        Student st1 = new Student("Deepak" , 23 , 2021218207);
        Student st2 = new Student("pinder" , 22 ,  110 );

        System.out.println(st1);
        System.out.println(st2);

        System.out.println(st1.isequals(st2));
    }
}
