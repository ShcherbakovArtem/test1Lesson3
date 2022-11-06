package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPages {
    //Elements
        private SelenideElement firstNameInput = $("#firstName");

    //Actions
    public RegistrationFormPages openPage(){
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return new RegistrationFormPages();
    }
    public RegistrationFormPages setFirstname(String value){
        firstNameInput.setValue(value);
        return this;
    }
    public RegistrationFormPages setLastname(String value){
        $("#lastName").setValue(value);
        return this;
    }
    public RegistrationFormPages setUserEmail(String value){
        $("#userEmail").setValue(value);
        return this;
    }
    public RegistrationFormPages setGender(){
        $("[for=gender-radio-1]").click();
        return this;
    }
}
