import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        String userName, pass,select,newPass;
        Scanner enter = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName= enter.nextLine();
        System.out.print("Şifreniz: ");
        pass= enter.nextLine();

        if(userName.equals("Yüksel")){
            if(pass.equals("java123")){
                System.out.print("Giriş yaptınız");
            }else{
                System.out.println("Girdiğiniz şifre hatalı");
                System.out.println("Yeni şifre oluşturmak ister misiniz: ");
                System.out.println("evet ?/hayır ?");
                select = enter.nextLine();
                if(select.equals("evet")){
                    System.out.print("Yeni şifre:");
                    newPass= enter.nextLine();
                    if(newPass.equals("java123")){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        System.out.print("Şifre oluşturuldu");
                    }
                }else if(select.equals("hayır")){
                    System.out.print("Giriş yapılamadı");
                }else{
                    System.out.print("Hatalı seçim yaptınız");
                }
            }
        }else{
            System.out.print("Bilgileriniz yanlış!");
        }

    }
}
