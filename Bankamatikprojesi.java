import java.util.Scanner;

public class Bankamatikprojesi {
    public static void main(String[] args) {
        String userName, passaword;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 3000;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz :");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz :");
            passaword = input.nextLine();
            if (userName.equals("sedat") && passaword.equals("sedat123")) {
                System.out.println("Merhaba, yazılım bankasına hoşgeldiniz ! ");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-)Para yatırma\n" +
                            "2-)Para çekme\n" +
                            "3-)Bakiye sorgulama\n" +
                            "4-)Çıkış");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                            int invest = input.nextInt();
                            balance += invest;
                            System.out.println("Yeni bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı giriniz: \n");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                balance -= withdraw;
                                System.out.println("Yeni bakiyeniz : " + balance);
                                break;
                            }
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;


                    }


                } while (select != 4);
                System.out.println("İyi günler, tekrar görüşmek üzere !");
                break;
            } else {
                right--;

                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz ! Lütfen tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Kartınız bloke olmuştur. Banka ile görüşünüz ! ");
                } else {
                    System.out.println("Kalan hakkınız "  +  right );
                }
            }
        }
    }
}



