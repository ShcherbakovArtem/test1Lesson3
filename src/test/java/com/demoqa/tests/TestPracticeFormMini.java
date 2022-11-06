package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationFormPages;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestPracticeFormMini {
    RegistrationFormPages registrationFormPages = new RegistrationFormPages();
    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void practiceForm() {
        registrationFormPages.openPage();
        registrationFormPages.setFirstname("Artem");
        registrationFormPages.setLastname("Shcherbakov");
        registrationFormPages.setUserEmail("artshcherbakov99@gmail.com");
        registrationFormPages.setGender();
        $("#userNumber").setValue("9103445241");
        $("#uploadPicture").uploadFile(new File("src/test/resources/TNhs2h00Rc0.jpeg"));
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1988");
        $(".react-datepicker__day--017:not(.react-datepicker__day--selected").click();
        $("#subjectsInput").setValue("VSU");
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-3]").click();
        $("#currentAddress").setValue("la la la");
        $(byText("Select State")).click();
        $(byText("NCR")).click();
        $(byText("Select City")).click();
        $(byText("Gurgaon")).click();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Artem Shcherbakov"),
                text("artshcherbakov99@gmail.com"),
                text("Male"),
                text("+79103445241"),
                text("17 July,1988"),
 //               text("VSU"),
                text("Sports"),
                text("Music"),
                text("TNhs2h00Rc0.jpeg"),
                text("NCR Gurgaon"));
        $("#closeLargeModal").click();
    }
    @Test
    void practiceFormMini() {
        String name = "Artem";
        registrationFormPages.openPage();
        $("#firstName").setValue(name);
        $("#lastName").setValue("Shcherbakov");
        $("#userEmail").setValue("artshcherbakov99@gmail.com");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("9103445241");
        $("#uploadPicture").uploadFile(new File("src/test/resources/TNhs2h00Rc0.jpeg"));
        $("#submit").click();


        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Artem Shcherbakov"),
                text("artshcherbakov99@gmail.com"),
                text("Male"),
                text("+79103445241"),
                text("17 July,1988"));
        $("#closeLargeModal").click();
    }

}