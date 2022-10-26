package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest(){
        open("/text-box");
        $("[id=userName]").setValue("Artem");
        $("[id=userEmail]").setValue("testemail@gmail.com");
        $("[id=currentAddress]").setValue("la la la");
        $("[id=permanentAddress]").setValue("da da da");
        $("[id=submit]").click();

        $("#output #name").shouldHave(text("Artem"));
        $("#output #email").shouldHave(text("testemail@gmail.com"));
        $("#output #currentAddress").shouldHave(text("la la la"));
        $("#output #permanentAddress").shouldHave(text("da da da"));
    }

}
