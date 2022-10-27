package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestPracticeForm {
    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void practiceForm(){
        String name ="Artem";
        open("/automation-practice-form");
        $("#firstName").setValue(name);
        $("#lastName").setValue("Shcherbakov");
        $("#userEmail").setValue("artshcherbakov99@gmail.com");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("+79103445241");
        // $("#dateOfBirthInput").click();
       /* $(".react-datepicker__month-select").setValue("4");
        $(".react-datepicker__year-select").setValue("1999");
        $(".react-datepicker__day react-datepicker__day--026").setValue("26");*/
        $("#subjectsInput").setValue("VSU");
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-3]").click();
        //$("input#uploadPicture").uploadFromClasspath("TNhs2h00Rc0.jpeg");
        $("#currentAddress").setValue("la la la");
        /*$("#state").setValue("Russia");
        $("#city").setValue("Voronez");*/







    }
}
