import java.util.Scanner;
public class BackToSender{

        public static void main(String... args){
               
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter number of Successful delivery: ");
        int numberOfDelivery = inputCollector.nextInt();

                int riderDayPayment = riderWage(numberOfDelivery);
                System.out.println("Commission: " + riderDayPayment);     

            }

        public static int riderWage(int numberOfDelivery){
                int amountPerParcel = 0;
                   if(numberOfDelivery < 50){
                       amountPerParcel = 160;
                    }
                   else if(numberOfDelivery == 50 && numberOfDelivery <= 59){
                         amountPerParcel = 200;
                    }
                   else if(numberOfDelivery == 60 && numberOfDelivery <= 69){
                        amountPerParcel = 250;
                    }
                   else if(numberOfDelivery >= 70){
                        amountPerParcel = 500;
                    }
                int riderDayPayment = (numberOfDelivery * amountPerParcel) + 5000;
                    return riderDayPayment;

                }

    }
