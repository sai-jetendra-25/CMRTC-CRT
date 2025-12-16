import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        
        float amount=0;
    
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the type");
  int type=sc.next().toUpperCase().charAt(0);
  System.out.println("Enter the units");
  int units=sc.nextInt();


            if(type=='H')
            {
           if(units<=50)
                amount=units*1;
            else if (units>=51 && units<=200) 
                        amount=units*1.75f;
            else amount=units*3;

  System.out.println("Current bill:"+ amount);
  float Dis=amount * (5 / 100.0f);
  System.out.println("Discount:"+Dis);
  System.out.println("Total bil Rs:"+(amount-Dis));
           }

           if(type=='R'){
                System.out.println("Retail connection");
            if(units<=75)
                amount=units*1.23f;
            else if (units>=76 && units<=175) 
              amount=units*2.35f;

            else if(units>=176 && units<=450)
                  amount=units*3f;
            else amount=units*3.75f;

  System.out.println("Current bill:"+ amount);
  float Dis=amount * (7 / 100.0f);
  System.out.println("Discount:"+Dis);
  System.out.println("Total bil Rs:"+(amount-Dis));
           }
            if(type=='L'){
            System.out.println("Retail connection");
            if(units<150)
                amount=units*1.80f;
            else if (units>=151 && units<=500) 
                        amount=units*4.21f;
            else if(units>=501 && units<=1500)
                              amount=units*7.56f;
            else amount=units*13.84f;
  System.out.println("Current bill:"+ amount);
  float Dis=amount * (12/ 100.0f);
  System.out.println("Discount:"+Dis);
  System.out.println("Total bil Rs:"+(amount-Dis));

    }
    sc.close();
}
}
