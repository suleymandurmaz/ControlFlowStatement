package day05;

public class ifstatements {
    public static void main(String[] args) {
        int yas=78;
        //Yetişkin olup olmama
        if (yas>=18){
            System.out.println("kisi yetiskindir.");
        }else {
            System.out.println("Yetiskin degildir.");
        }


        //yasşı 70'den büyük,18'den küçük olma durumu
        if (yas<18|yas>=70){
            System.out.println("sosyal yardım alabilir.");
        }else if (yas>=70) {
            System.out.println("sosyal yardim alabilir.");
        }else {
            System.out.println("sosyal yardım alamaz.");

            //time -memory


          int x=65;
          int y=0b01000001;
          int z=0x41;
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);

        }
    }
}


















