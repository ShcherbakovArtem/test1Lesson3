package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPages {
    //Elements
        SelenideElement firstNameInput = $("#firstName");

    //Actions
    public void openPage(){
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
    }
    public void setFirstname(String value){
        firstNameInput.setValue(value);
    }
    public void setLastname(String value){
        $("#lastName").setValue(value);
    }
    public void setUserEmail(String value){
        $("#userEmail").setValue(value);
    }
    public void setGender(){
        $("[for=gender-radio-1]").click();
    }
}
