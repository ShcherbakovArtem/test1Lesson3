package com.demoqa.tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples() {
        $("[data-testid=email]").setValue("a@a.com");
        $x("//*[@id='email']").setValue("a@a.com");
        $(by("data-testid", "email")).setValue("a@a.com");
        $(by("data-testid", "email")).setValue("a@a.com");


        $("[id=email]").setValue("a@a");
        $("#email").setValue("a@a");
        $(byId("email")).setValue("a@a");


       //  <div>Hellow Qa Guru<div>
        $x("//div[text()='Hellow Qa Guru '']");
        $(byText("Hellow Qa Guru"));
        $(withText("llow Qa Gu"));
    }
}
