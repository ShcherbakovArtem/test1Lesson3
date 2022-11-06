package com.demoqa.pages;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPages {
    public void openPage(){
        open("/automation-practice-form");
        executeJavaScript("$('#footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
    }
    public void setFirstname(String value){
        $("#firstName").setValue(value);
    }
}
