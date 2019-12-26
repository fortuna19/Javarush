package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MVPD {
    public static void main(String[] args) throws IOException {

        String url = "https://sp.auth.adobe.com/api/v1/authenticate?";
        String requestor_id = "dtci";
        String mso_id = "Grande";
        String domain_name = "";// = "ngtvfeqa.com";
        String reg_code = "NRLHZ6R";
        String noflash = "true";
        String no_iframe = "true";
        String redirect_url = "https%3A//ngtvfeqa.com/activate-congrats";

        System.out.println("Please choose a channel:");
        System.out.println("1. ABC");
        System.out.println("2. National Geographic");
        System.out.println("3. FX");


        while (channel < 1 && channel > 3); {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int channel = Integer.parseInt(reader.readLine());
            if (channel == 1)
                domain_name = "abc.go.com";
            else if (channel == 2)
                domain_name = "ngtvfeqa.com";
            else if (channel == 3)
                domain_name = "fxtvfeqa.com";
            else
                System.out.println("You are mistaken. Select channel from 1 to 3");
        }

        System.out.println(url + "requestor_id=" + requestor_id + "&" + "mso_id=" + mso_id + "&" + "domain_name=" + domain_name + "&" + "reg_code=" + reg_code + "&" + "noflash=" + noflash + "&" + "no_iframe=" + no_iframe + "&" + "redirect_url=" + redirect_url);


    }

}
