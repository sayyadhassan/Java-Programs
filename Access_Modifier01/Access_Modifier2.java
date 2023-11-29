package Access_Modifier01;

//Access Modifiers(public,private,protected,default) members in the Same Class

public class Access_Modifier2 {
    public int Marks_Hindi=55;
    public void marksHindi(){
        System.out.println("Hindi = "+Marks_Hindi);
    }
    private int Marks_English=75;
    private void marksEnglish(){
        System.out.println("English = "+Marks_English);
    }
    protected int Marks_Math=70;
    protected void marksMath(){
        System.out.println("Math = "+Marks_Math);
    }
    int Marks_Science=65;
    void marksScience(){
        System.out.println("Science = "+Marks_Science);
    }

    public static void main(String []args){
        Access_Modifier2 obj = new Access_Modifier2();

//        obj.Marks_Hindi;   error because here it is useless
//        Public Members
        System.out.println(obj.Marks_Hindi);
        obj.marksHindi();

//        Private Members
        System.out.println(obj.Marks_English);
        obj.marksEnglish();

//        Protected Members
        System.out.println(obj.Marks_Math);
        obj.marksMath();

//        Default Members
        System.out.println(obj.Marks_Science);
        obj.marksScience();
    }

}
